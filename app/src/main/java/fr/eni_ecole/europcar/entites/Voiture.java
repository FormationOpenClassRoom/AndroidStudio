package fr.eni_ecole.europcar.entites;

public class Voiture {
    private String vehiculeId;
    private int nbPlaces;
    private int locationMin;
    private int locationMax;
    private float tarifMin;
    private float tarifMax;
    private float tarifMoyen;
    private boolean isDisponible;
    private String libelle;
    private boolean sync;

    /**
     * Constructeur par défaut
     */
    public Voiture() {
    }

    /**
     * Constructeur avec paramètres
     * @param vehiculeId
     * @param nbPlaces
     * @param locationMin
     * @param locationMax
     * @param tarifMin
     * @param tarifMax
     * @param tarifMoyen
     * @param isDisponible
     * @param libelle
     * @param sync
     */
    public Voiture(String vehiculeId, int nbPlaces, int locationMin, int locationMax, float tarifMin, float tarifMax, float tarifMoyen, boolean isDisponible, String libelle, boolean sync) {
        this.vehiculeId = vehiculeId;
        this.nbPlaces = nbPlaces;
        this.locationMin = locationMin;
        this.locationMax = locationMax;
        this.tarifMin = tarifMin;
        this.tarifMax = tarifMax;
        this.tarifMoyen = tarifMoyen;
        this.isDisponible = isDisponible;
        this.libelle = libelle;
        this.sync = sync;
    }

    /**
     * Getters et Setters
     */

    public String getVehiculeId() {
        return vehiculeId;
    }

    public void setVehiculeId(String vehiculeId) {
        this.vehiculeId = vehiculeId;
    }

    public int getNbPlaces() {
        return nbPlaces;
    }

    public void setNbPlaces(int nbPlaces) {
        this.nbPlaces = nbPlaces;
    }

    public int getLocationMin() {
        return locationMin;
    }

    public void setLocationMin(int locationMin) {
        this.locationMin = locationMin;
    }

    public int getLocationMax() {
        return locationMax;
    }

    public void setLocationMax(int locationMax) {
        this.locationMax = locationMax;
    }

    public float getTarifMin() {
        return tarifMin;
    }

    public void setTarifMin(float tarifMin) {
        this.tarifMin = tarifMin;
    }

    public float getTarifMax() {
        return tarifMax;
    }

    public void setTarifMax(float tarifMax) {
        this.tarifMax = tarifMax;
    }

    public float getTarifMoyen() {
        return tarifMoyen;
    }

    public void setTarifMoyen(float tarifMoyen) {
        this.tarifMoyen = tarifMoyen;
    }

    public boolean isDisponible() {
        return isDisponible;
    }

    public void setDisponible(boolean disponible) {
        isDisponible = disponible;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public boolean isSync() {
        return sync;
    }

    public void setSync(boolean sync) {
        this.sync = sync;
    }
}
