package fr.eni_ecole.europcar.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import fr.eni_ecole.europcar.R;
import fr.eni_ecole.europcar.entites.Agence;
import fr.eni_ecole.europcar.fragments.ModifAgenceFragment;

public class ModifAgenceActivity extends AppCompatActivity implements ModifAgenceFragment.onSettingsListener {

    private SharedPreferences prefs;
    private SharedPreferences.Editor editeur;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modif_agence);
    }

    /**
     * Méthode pour la gestion du formulaire de modification de l'agence
     * @param agence
     * @return void
     */
    @Override
    public void onSubmitSettings(Agence agence) {
        if(agence != null) {
            this.prefs = getBaseContext().getSharedPreferences("agencePrefs", MODE_PRIVATE);
            this.editeur = prefs.edit();
            this.editeur.putString("raisonSociale", agence.getRaisonSociale());
            this.editeur.putString("siret", agence.getSiret());
            this.editeur.putString("voie", agence.getVoie());
            this.editeur.putString("codePostal", agence.getCodePostal());
            this.editeur.putString("ville", agence.getVille());
            this.editeur.commit();
        }
        Intent intent = new Intent(ModifAgenceActivity.this,ListeReservationsActivity.class);
        startActivity(intent);
        finish();
    }
}
