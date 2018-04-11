package fr.eni_ecole.europcar.fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.StrictMode;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import fr.eni_ecole.europcar.R;
import fr.eni_ecole.europcar.entites.Reservation;
import fr.eni_ecole.europcar.services.ReservationService;

import static android.app.Activity.RESULT_OK;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link RestitutionFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link RestitutionFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RestitutionFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public RestitutionFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment RestitutionFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static RestitutionFragment newInstance(String param1, String param2) {
        RestitutionFragment fragment = new RestitutionFragment();
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
        View v = inflater.inflate(R.layout.fragment_restitution, container, false);
        String resaId = getActivity().getIntent().getStringExtra("id");
        ReservationService service = new ReservationService();
        Reservation resa = service.resaById(resaId);

        TextView vehiculeId = v.findViewById(R.id.resa_vehiculeId);
        TextView dateDebut = v.findViewById(R.id.resa_dateDebut);
        TextView dateFin = v.findViewById(R.id.resa_dateFin);
        TextView tarifJournalier = v.findViewById(R.id.resa_tarifJournalier);
        CheckBox isEndommage = v.findViewById(R.id.rest_endommage);
        CheckBox isPlein = v.findViewById(R.id.rest_plein);
        Button btnPhoto = v.findViewById(R.id.btnPhoto);
        Button btnRendre = v.findViewById(R.id.btnRendre);

        vehiculeId.setText(resa.getVehiculeId());
        dateDebut.setText(new SimpleDateFormat("dd/MM/yyyy").format(resa.getDateDebut()));
        dateFin.setText(new SimpleDateFormat("dd/MM/yyyy").format(resa.getDateFin()));
        tarifJournalier.setText(String.valueOf(resa.getTarifJournalier()));
        //Toast.makeText(v.getContext(), "RESAID = " + resaId, Toast.LENGTH_SHORT).show();
        return v;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
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
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onClickRendre(Uri uri);
    }

    private Uri file;
    public void takePicture(){
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        File mediaStorageDir = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),"LiveCoding");
        if(!mediaStorageDir.exists()){
            mediaStorageDir.mkdirs();
        }
        String timestamp = new SimpleDateFormat("yyyMMdd_HHmmss").format(new Date());
        file = Uri.fromFile(new File(mediaStorageDir.getPath() + File.separator + timestamp + ".jpg"));
        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
        StrictMode.setVmPolicy(builder.build());

        intent.putExtra(MediaStore.EXTRA_OUTPUT, file);
        startActivityForResult(intent, 42);
    }
}
