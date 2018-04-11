package fr.eni_ecole.europcar.activities;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import fr.eni_ecole.europcar.R;
import fr.eni_ecole.europcar.fragments.ListeReservationsFragment;

public class ListeReservationsActivity extends AppCompatActivity implements ListeReservationsFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_reservations);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
