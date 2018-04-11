package fr.eni_ecole.europcar.activities;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

import fr.eni_ecole.europcar.R;
import fr.eni_ecole.europcar.fragments.RestitutionFragment;

public class RestitutionActivity extends AppCompatActivity implements RestitutionFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restitution);
    }


    @Override
    protected void onResume() {
        super.onResume();
        //String resaId = getIntent().getStringExtra("id");
        //android.app.FragmentManager manager = getFragmentManager();
        //Toast.makeText(this, "RESAID = " + resaId, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClickRendre(Uri uri) {

    }
}
