package fr.eni_ecole.europcar.dao;

import java.util.List;

import fr.eni_ecole.europcar.entites.Reservation;

public interface IReservationDao {

    /**
     * Requete pour toutes les réservation de l'agence
     * @return Reservation
    */
    public List<Reservation> getAll();

    /**
     * Requete pour reservation selon id
     * @param resaId
     * @return Reservation
     */
    public Reservation getResaById(String resaId);

    /**
     * Requete pour ajouter une réservation
     * @param resa
     * @return Reservation
     */
    public Reservation add(Reservation resa);

    /**
     * Requete pour mise à jour d'une reservation
     * @param resa
     * @return Reservation
     */
    public Reservation update(Reservation resa);

    /**
     * Requete pour suppression d'une réservation
     * @param resa
     * @return boolean
     */
    public boolean delete(Reservation resa);

}
