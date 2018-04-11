package fr.eni_ecole.europcar.dao;

import android.content.Context;

import java.util.List;

import fr.eni_ecole.europcar.entites.Reservation;

public class ReservationSql implements IReservationDao {

    public ReservationSql(Context context) {

    }

    @Override
    public List<Reservation> getAll() {
        return null;
    }

    @Override
    public Reservation getResaById(String resaId) {
        return null;
    }

    @Override
    public Reservation add(Reservation resa) {
        return null;
    }

    @Override
    public Reservation update(Reservation resa) {
        return null;
    }

    @Override
    public boolean delete(Reservation resa) {
        return false;
    }
}
