package fr.eni_ecole.europcar.services;



import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import fr.eni_ecole.europcar.dao.ReservationBouchon;
import fr.eni_ecole.europcar.dao.ReservationSql;
import fr.eni_ecole.europcar.entites.Agence;
import fr.eni_ecole.europcar.entites.Reservation;
import fr.eni_ecole.europcar.entites.Restitution;
import fr.eni_ecole.europcar.entites.Utilisateur;
import fr.eni_ecole.europcar.entites.Voiture;

public class ReservationService {

    private ReservationBouchon reservationBouchon;
    private ReservationSql reservationSql;

    /**
     * Constructeur par défaut
     */
    public ReservationService() {
        this.reservationBouchon = new ReservationBouchon();
    }

    /**
     * Méthode pour récupération d'une réservation par son id
     * @param resaId
     * @return Reservation
     */
    public Reservation resaById(String resaId){
        return this.reservationBouchon.getResaById(resaId);
    }

    /**
     * Méthode pour récupération de la liste de toutes les reservations de l'agence
     * @return List<Reservation>
     */
    public List<Reservation> getAll(){
        return  this.reservationBouchon.getAll();
    }

}
