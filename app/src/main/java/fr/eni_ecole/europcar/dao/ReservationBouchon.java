package fr.eni_ecole.europcar.dao;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import fr.eni_ecole.europcar.entites.Reservation;

public class ReservationBouchon implements IReservationDao {

    private List<Reservation> resas;

    public ReservationBouchon() {
        resas = new ArrayList<>();
        resas.add(new Reservation("1","1","1",1517559697000l,1517646097000l,30.0f,true,false));
        resas.add(new Reservation("2","2","1",1517559697000l,1517646097000l,40.0f,true,false));
        resas.add(new Reservation("3","3","1",1517559697000l,1517646097000l,33.0f,true,false));
        resas.add(new Reservation("5","5","1",1517559697000l,1517646097000l,33.0f,true,false));
        resas.add(new Reservation("4","4","1",1517559697000l,1517646097000l,52.0f,true,false));
        resas.add(new Reservation("6","6","1",1517559697000l,1517646097000l,22.0f,true,false));
        resas.add(new Reservation("7","7","1",1517559697000l,1517646097000l,80.0f,true,false));
        resas.add(new Reservation("8","8","1",1517559697000l,1517646097000l,75.0f,true,false));
        resas.add(new Reservation("9","9","1",1517559697000l,1517646097000l,60.0f,true,false));
        resas.add(new Reservation("10","10","1",1517559697000l,1517646097000l,50.0f,true,false));
        resas.add(new Reservation("11","11","1",1517559697000l,1517646097000l,55.0f,true,false));
        resas.add(new Reservation("12","12","1",1517559697000l,1517646097000l,58.0f,true,false));
    }

    @Override
    public List<Reservation> getAll() {
        return this.resas;
    }

    @Override
    public Reservation getResaById(String resaId) {
        Reservation resa = null;
        if(resaId != null){
            for(int i = 0; i < this.resas.size(); i++){
                if(resas.get(i).getReservationId().equals(resaId)){
                    resa = resas.get(i);
                }
            }
        }
        return resa;
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
