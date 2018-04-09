package fr.eni_ecole.europcar.activities;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import fr.eni_ecole.europcar.R;
import fr.eni_ecole.europcar.services.LocationService;

public class LoginActivity extends AppCompatActivity implements SignInFragment.onSignInListener, SignUpFragment.onSignUpListener {

    private LocationService locationService;
    private LinearLayout layoutInscription;
    private LinearLayout layoutConnexion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        this.locationService = new LocationService();

    }

    @Override
    protected void onResume() {
        super.onResume();
        //fragmentConnexion = getSupportFragmentManager().findFragmentById(R.id.connexionFragment);
        //fragmentInscription = getSupportFragmentManager().findFragmentById(R.id.inscriptionFragment);
        layoutInscription = findViewById(R.id.layoutInscription);
        layoutConnexion = findViewById(R.id.layoutConnexion);

        layoutInscription.setVisibility(View.GONE);
        layoutConnexion.setVisibility(View.VISIBLE);
    }

    @Override
    public void clickInscription() {
        layoutInscription.setVisibility(View.VISIBLE);
        layoutConnexion.setVisibility(View.GONE);
    }

    @Override
    public void submitConnexion(String user, String pass) {

    }

    @Override
    public void onClickConnexion() {
        layoutInscription.setVisibility(View.GONE);
        layoutConnexion.setVisibility(View.VISIBLE);
    }

    @Override
    public void submitInscription(String user, String pass) {

    }
}
