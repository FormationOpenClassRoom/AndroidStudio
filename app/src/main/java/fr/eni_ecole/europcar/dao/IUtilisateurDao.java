package fr.eni_ecole.europcar.dao;

import fr.eni_ecole.europcar.entites.Utilisateur;

public interface IUtilisateurDao {
    public Utilisateur getUserById(int id);
    public Utilisateur getUserByName(String username);
    public void addUser(Utilisateur user);
}
