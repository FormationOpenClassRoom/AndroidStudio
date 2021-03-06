package fr.eni_ecole.europcar.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import fr.eni_ecole.europcar.R;
import fr.eni_ecole.europcar.entites.Utilisateur;
import fr.eni_ecole.europcar.services.UtilisateurService;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link SignUpFragment.onSignUpListener} interface
 * to handle interaction events.
 * Use the {@link SignUpFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SignUpFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private onSignUpListener mListener;
    private EditText email;
    private EditText pass;
    private EditText pass2;
    private Button btnSubmit;
    private TextView txtSignIn;
    private EditText token;

    public SignUpFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SignUpFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SignUpFragment newInstance(String param1, String param2) {
        SignUpFragment fragment = new SignUpFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_sign_up, container, false);
        email = v.findViewById(R.id.username);
        pass = v.findViewById(R.id.password);
        pass2 = v.findViewById(R.id.password2);
        btnSubmit = v.findViewById(R.id.btnSubmit);
        txtSignIn = v.findViewById(R.id.sign_in);
        token = v.findViewById(R.id.token);

        txtSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onClickConnexion();
            }
        });
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isError = false;
                if(email.getText().toString().isEmpty()){
                    email.setError("Vous devez indiquer une adresse mail");
                    isError = true;
                }
                if(pass.getText().toString().isEmpty()){
                    pass.setError("Vous devez indiquer un mot de passe");
                    isError = true;
                }
                if(pass2.getText().toString().isEmpty()){
                    pass2.setError("Vous devez confirmer votre mot de passe ");
                    isError = true;
                }
                if(!pass.getText().toString().equals(pass2.getText().toString())){
                    pass2.setError("Les mots de passe ne sont pas identiques");
                    isError = true;
                }
                if(token.getText().toString().isEmpty()){
                    token.setError("Vous devez indiquer un token de sécurité");
                    isError = true;
                }
                if(isError){
                    Toast.makeText(v.getContext(), "Vous devez corriger les erreurs ci dessus", Toast.LENGTH_SHORT).show();
                } else {
                    Utilisateur user = new Utilisateur();
                    user.setEmail(email.getText().toString());
                    user.setPassword(pass.getText().toString());
                    user.setToken(token.getText().toString());
                    mListener.submitInscription(user);
                }
            }
        });

        return v;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof onSignUpListener) {
            mListener = (onSignUpListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface onSignUpListener {
        // TODO: Update argument type and name
        void onClickConnexion();
        void submitInscription(Utilisateur user);
    }
}
