package fr.eni_ecole.europcar.dao;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import fr.eni_ecole.europcar.entites.Utilisateur;

public class UtilisateurBouchon implements IUtilisateurDao {
    private List<Utilisateur> users = new ArrayList<>();

    public UtilisateurBouchon(Context context) {

    }

    @Override
    public Utilisateur getUserById(int id) {
        return new Utilisateur("TOTO", "password");
    }

    @Override
    public Utilisateur getUserByName(String username) {
        return new Utilisateur(username,"mot de passe");
    }

    @Override
    public void addUser(Utilisateur user) {

    }
}
