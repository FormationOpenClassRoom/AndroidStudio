package fr.eni_ecole.europcar.services;

import android.content.Context;
import fr.eni_ecole.europcar.dao.UtilisateurBouchon;
import fr.eni_ecole.europcar.dao.UtilisateurSql;
import fr.eni_ecole.europcar.entites.Utilisateur;

public class UtilisateurService {
    private UtilisateurBouchon userBouchon;
    private UtilisateurSql userSql;

    /**
     * Constructeur par défaut
     * @param context
     */
    public UtilisateurService(Context context) {
        this.userBouchon = new UtilisateurBouchon(context);
    }

    /**
     * Méthode pour récupération d'un utilisateur par son email
     * @param email
     * @return Utilisateur
     */
    public Utilisateur getUserByEmail(String email){
        return this.userBouchon.getUserByEmail(email);
    }

    /**
     * Méthode pour récupération d'un utilisateur par son id
     * @param userId
     * @return Utilisateur
     */
    public Utilisateur getUserById(String userId){
        return this.userBouchon.getUserById(userId);
    }

    /**
     * Méthode pour ajouter un nouvel utilisateur
     * @param user
     * @return Utilisateur
     */
    public String addUser(Utilisateur user){
        return this.userBouchon.addUser(user);
    }
}
