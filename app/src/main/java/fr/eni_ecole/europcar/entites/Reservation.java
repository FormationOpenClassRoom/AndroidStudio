package fr.eni_ecole.europcar.entites;

public class Reservation {
    private String reservationId;
    private String vehiculeId;
    private String agenceId;
    private int dateDebut;
    private int dateFin;
    private float tarifJournalier;
    private boolean isEncours;

    public Reservation() {
    }

    public Reservation(String reservationId, String vehiculeId, String agenceId, int dateDebut, int dateFin, float tarifJournalier, boolean isEncours) {
        this.reservationId = reservationId;
        this.vehiculeId = vehiculeId;
        this.agenceId = agenceId;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.tarifJournalier = tarifJournalier;
        this.isEncours = isEncours;
    }

    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public String getVehiculeId() {
        return vehiculeId;
    }

    public void setVehiculeId(String vehiculeId) {
        this.vehiculeId = vehiculeId;
    }

    public String getAgenceId() {
        return agenceId;
    }

    public void setAgenceId(String agenceId) {
        this.agenceId = agenceId;
    }

    public int getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(int dateDebut) {
        this.dateDebut = dateDebut;
    }

    public int getDateFin() {
        return dateFin;
    }

    public void setDateFin(int dateFin) {
        this.dateFin = dateFin;
    }

    public float getTarifJournalier() {
        return tarifJournalier;
    }

    public void setTarifJournalier(float tarifJournalier) {
        this.tarifJournalier = tarifJournalier;
    }

    public boolean isEncours() {
        return isEncours;
    }

    public void setEncours(boolean encours) {
        isEncours = encours;
    }
}
