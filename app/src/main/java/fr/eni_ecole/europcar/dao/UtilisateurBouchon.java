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
    public Utilisateur getUserById(String userId) {
        return new Utilisateur("TOTO", "password");
    }

    @Override
    public Utilisateur getUserByEmail(String email) {
        return new Utilisateur(email,"mot de passe");
    }

    @Override
    public String addUser(Utilisateur user) {
        return "12";
    }
}
