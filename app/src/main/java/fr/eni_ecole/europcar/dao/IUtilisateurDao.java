package fr.eni_ecole.europcar.dao;

import fr.eni_ecole.europcar.entites.Utilisateur;

public interface IUtilisateurDao {
    public Utilisateur getUserById(String userId);
    public Utilisateur getUserByEmail(String email);
    public String addUser(Utilisateur user);
}
