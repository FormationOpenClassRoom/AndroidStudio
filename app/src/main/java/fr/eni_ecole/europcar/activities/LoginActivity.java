package fr.eni_ecole.europcar.activities;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import fr.eni_ecole.europcar.R;
import fr.eni_ecole.europcar.services.LocationService;

public class LoginActivity extends AppCompatActivity {

    private LocationService locationService;
    private Fragment fragmentConnexion;
    private Fragment fragmentInscription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        this.locationService = new LocationService();


    }

    @Override
    protected void onResume() {
        super.onResume();
        fragmentConnexion = getSupportFragmentManager().findFragmentById(R.id.connexionFragment);
        fragmentInscription = getSupportFragmentManager().findFragmentById(R.id.inscriptionFragment);
        fragmentConnexion.getFragmentManager().
    }
}
