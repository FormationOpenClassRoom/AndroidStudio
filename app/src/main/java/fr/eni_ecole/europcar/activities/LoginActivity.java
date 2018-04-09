package fr.eni_ecole.europcar.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import fr.eni_ecole.europcar.R;
import fr.eni_ecole.europcar.entites.Utilisateur;
import fr.eni_ecole.europcar.services.LocationService;
import fr.eni_ecole.europcar.services.UtilisateurService;

public class LoginActivity extends AppCompatActivity implements SignInFragment.onSignInListener, SignUpFragment.onSignUpListener {

    private LocationService locationService;
    private LinearLayout layoutInscription;
    private LinearLayout layoutConnexion;
    private SharedPreferences prefs;
    private SharedPreferences.Editor editeur;
    private Utilisateur user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        this.locationService = new LocationService();

    }

    @Override
    protected void onResume() {
        super.onResume();
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
    public void submitConnexion(String user, String pass, boolean remember) {
        if(remember){
           prefs = getBaseContext().getSharedPreferences("userPrefs",MODE_PRIVATE);
            editeur = prefs.edit();
            editeur.putString("user",user);
            editeur.putString("pass",pass);
            editeur.commit();
        }
        this.user = new UtilisateurService(this).getUserByName(user);
        if(this.user != null){
            Intent intent = new Intent(LoginActivity.this,MainActivity.class);
            startActivity(intent);
            finish();
        } else {

        }
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
