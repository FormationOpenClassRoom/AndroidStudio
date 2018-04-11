package fr.eni_ecole.europcar.dao;

import fr.eni_ecole.europcar.entites.Utilisateur;

public interface IUtilisateurDao {
    /**
     * Requete pour rechercher un utilisateur par son id
     * @param userId
     * @return Utilisateur
     */
    public Utilisateur getUserById(String userId);

    /**
     * Requete pour rechercher un utilisateur par son adresse mail
     * @param email
     * @return Utilisateur
     */
    public Utilisateur getUserByEmail(String email);

    /**
     * Requete pour ajouter un utilisateur
     * @param user
     * @return String
     */
    public String addUser(Utilisateur user);
}
