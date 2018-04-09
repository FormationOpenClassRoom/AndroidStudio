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

    public Utilisateur getUserByName(String username){
        return this.userBouchon.getUserByName(username);
    }
    public Utilisateur getUserById(int id){
        return this.userBouchon.getUserById(id);
    }
    public void addUser(Utilisateur user){
        this.userBouchon.addUser(user);
    }
}
