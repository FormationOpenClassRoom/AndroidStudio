package fr.eni_ecole.europcar.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import fr.eni_ecole.europcar.R;
import fr.eni_ecole.europcar.entites.Utilisateur;
import fr.eni_ecole.europcar.fragments.SignInFragment;
import fr.eni_ecole.europcar.fragments.SignUpFragment;
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

        this.layoutInscription = findViewById(R.id.layoutInscription);
        this.layoutConnexion = findViewById(R.id.layoutConnexion);
        this.prefs = getBaseContext().getSharedPreferences("userPrefs",MODE_PRIVATE);
        //this.locationService = new LocationService();
        if (this.prefs.contains("user") && this.prefs.contains("pass")) {
            EditText username  = this.layoutConnexion.findViewById(R.id.username);
            username.setText(this.prefs.getString("user",""));
            EditText password = this.layoutConnexion.findViewById(R.id.password);
            password.setText(this.prefs.getString("pass",""));
            CheckBox remember = this.layoutConnexion.findViewById(R.id.remember);
            remember.setChecked(this.prefs.getBoolean("remember",false));
            /*this.user = new UtilisateurService(this).getUserByEmail(prefs.getString("user",""));
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            intent.putExtra("id",this.user.getId());
            startActivity(intent);
            finish();*/
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        this.layoutInscription = findViewById(R.id.layoutInscription);
        this.layoutConnexion = findViewById(R.id.layoutConnexion);

        this.layoutInscription.setVisibility(View.GONE);
        this.layoutConnexion.setVisibility(View.VISIBLE);
    }

    @Override
    public void clickInscription() {
        this.layoutInscription.setVisibility(View.VISIBLE);
        this.layoutConnexion.setVisibility(View.GONE);
    }

    @Override
    public void submitConnexion(String email, String pass, boolean remember) {
        if(remember){
            this.prefs = getBaseContext().getSharedPreferences("userPrefs",MODE_PRIVATE);
            this.editeur = prefs.edit();
            this.editeur.putString("user",email);
            this.editeur.putString("pass",pass);
            this.editeur.putBoolean("remember", remember);
            this.editeur.commit();
        } else {
            this.prefs = getBaseContext().getSharedPreferences("userPrefs",MODE_PRIVATE);
            this.editeur = prefs.edit();
            this.editeur.remove("user");
            this.editeur.remove("pass");
            this.editeur.remove("remember");
            this.editeur.commit();
        }
        this.user = new UtilisateurService(this).getUserByEmail(email);
        if(this.user != null){
            Intent intent = new Intent(LoginActivity.this,MainActivity.class);
            intent.putExtra("id",this.user.getUserId());
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(this, "Il y a eu un problème lors de la connexion", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onClickConnexion() {
        this.layoutInscription.setVisibility(View.GONE);
        this.layoutConnexion.setVisibility(View.VISIBLE);
    }

    @Override
    public void submitInscription(Utilisateur user) {
        Inscription(user);
        Intent intent = new Intent(LoginActivity.this, ModifAgenceActivity.class);
        intent.putExtra("id", this.user.getUserId());
        startActivity(intent);
        finish();
    }
    public void Inscription(Utilisateur user){
        this.user = new UtilisateurService(this).getUserById(
                new UtilisateurService(this).addUser(new Utilisateur(user.getEmail(),user.getPassword()))
        );
    }
}
