package fr.eni_ecole.europcar.activities;

import android.content.Context;
import android.net.Uri;
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

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link SignInFragment.onSignInListener} interface
 * to handle interaction events.
 */
public class SignInFragment extends Fragment {

    private onSignInListener mListener;
    private EditText username;
    private EditText password;

    public SignInFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_sign_in, container, false);
        TextView txtInscription = v.findViewById(R.id.sign_up);
        txtInscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.clickInscription();
            }
        });
        Button btnSubmit = v.findViewById(R.id.btnSubmit);

        username = v.findViewById(R.id.username);
        password = v.findViewById(R.id.password);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isError = false;
                if(username.getText().toString().isEmpty()){
                    username.setError("Vous devez indiquer une adresse mail");
                    isError = true;
                }
                if(password.getText().toString().isEmpty()){
                    password.setError("Vous devez indiquer un mot de passe");
                    isError = true;
                }
                if(isError){
                    Toast.makeText(v.getContext(), "Veuillez corriger les erreurs ci dessus", Toast.LENGTH_SHORT).show();
                } else {
                    mListener.submitConnexion(username.getText().toString(), password.getText().toString());
                }
            }
        });

        return v;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof onSignInListener) {
            mListener = (onSignInListener) context;
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
    public interface onSignInListener {
        // TODO: Update argument type and name
        void clickInscription();
        void submitConnexion(String user, String pass);
    }
}
