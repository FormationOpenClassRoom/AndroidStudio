package fr.eni_ecole.europcar.dao;

import fr.eni_ecole.europcar.entites.Utilisateur;

public class UtilisateurVolley implements IUtilisateurDao {

    @Override
    public Utilisateur getUserById(String userId) {
        return null;
    }

    @Override
    public Utilisateur getUserByEmail(String username) {
        return null;
    }

    @Override
    public String addUser(Utilisateur user) {
        return "12";
    }
}
