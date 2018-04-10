package fr.eni_ecole.europcar.activities;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import fr.eni_ecole.europcar.R;

public class ModifAgenceActivity extends AppCompatActivity implements ModifAgenceFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modif_agence);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
