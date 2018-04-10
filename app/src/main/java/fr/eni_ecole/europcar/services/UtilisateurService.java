package fr.eni_ecole.europcar.services;

import android.content.Context;
import fr.eni_ecole.europcar.dao.UtilisateurBouchon;
import fr.eni_ecole.europcar.dao.UtilisateurSql;
import fr.eni_ecole.europcar.entites.Utilisateur;

public class UtilisateurService {
    private UtilisateurBouchon userBouchon;
    private UtilisateurSql userSql;

    public UtilisateurService(Context context) {
        this.userBouchon = new UtilisateurBouchon(context);
    }

    public Utilisateur getUserByEmail(String email){
        return this.userBouchon.getUserByEmail(email);
    }
    public Utilisateur getUserById(String userId){
        return this.userBouchon.getUserById(userId);
    }
    public String addUser(Utilisateur user){
        return this.userBouchon.addUser(user);
    }
}
