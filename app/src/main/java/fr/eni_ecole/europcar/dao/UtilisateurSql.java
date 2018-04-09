package fr.eni_ecole.europcar.dao;

import fr.eni_ecole.europcar.entites.Utilisateur;

public class UtilisateurSql implements IUtilisateurDao {
    @Override
    public Utilisateur getUserById(int id) {
        return null;
    }

    @Override
    public Utilisateur getUserByName(String username) {
        return null;
    }

    @Override
    public int addUser(Utilisateur user) {
        return 1;
    }
}
