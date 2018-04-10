package fr.eni_ecole.europcar.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import fr.eni_ecole.europcar.R;
import fr.eni_ecole.europcar.entites.Agence;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ModifAgenceFragment.onSettingsListener} interface
 * to handle interaction events.
 * Use the {@link ModifAgenceFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ModifAgenceFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private onSettingsListener mListener;

    private EditText raisonSociale;
    private EditText siret;
    private EditText voie;
    private EditText codePostal;
    private EditText ville;
    private Button btnSettings;

    public ModifAgenceFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ModifAgenceFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ModifAgenceFragment newInstance(String param1, String param2) {
        ModifAgenceFragment fragment = new ModifAgenceFragment();
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
        View v = inflater.inflate(R.layout.fragment_modif_agence, container, false);

        this.raisonSociale = v.findViewById(R.id.raison_sociale);
        this.siret = v.findViewById(R.id.siret);
        this.voie = v.findViewById(R.id.voie);
        this.codePostal = v.findViewById(R.id.code_postal);
        this.ville = v.findViewById(R.id.ville);
        this.btnSettings = v.findViewById(R.id.btnSettings);

        this.btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isError = false;
                if(raisonSociale.getText().toString().isEmpty()){
                    raisonSociale.setError("Vous devez indiquer la raison sociale");
                    isError = true;
                }
                if(siret.getText().toString().isEmpty()){
                    siret.setError("Vous devez indiquer le numéro de SIRET");
                    isError = true;
                }
                if(voie.getText().toString().isEmpty()){
                    voie.setError("Vous devez indiquer la voie de l'adresse");
                    isError = true;
                }
                if(codePostal.getText().toString().isEmpty()){
                    codePostal.setError("Vous devez indiquer le code postal de l'adresse");
                    isError = true;
                }
                if(ville.getText().toString().isEmpty()){
                    ville.setError("Vous devez indiquer la ville de l'adresse");
                    isError = true;
                }
                if(isError){
                    Toast.makeText(v.getContext(), "Veuillez corriger les erreurs avant de continuer", Toast.LENGTH_SHORT).show();
                } else {
                    Agence agence = new Agence();
                    agence.setRaisonSociale(raisonSociale.getText().toString());
                    agence.setSiret(siret.getText().toString());
                    agence.setVoie(voie.getText().toString());
                    agence.setCodePostal(codePostal.getText().toString());
                    agence.setVille(ville.getText().toString());
                    mListener.onSubmitSettings(agence);
                }
            }
        });

        return v;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof onSettingsListener) {
            this.mListener = (onSettingsListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        this.mListener = null;
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
    public interface onSettingsListener {
        // TODO: Update argument type and name
        void onSubmitSettings(Agence agence);
    }
}
