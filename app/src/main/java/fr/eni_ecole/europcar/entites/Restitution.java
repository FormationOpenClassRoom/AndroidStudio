package fr.eni_ecole.europcar.entites;

public class Restitution {
    private String retourId;
    private String locationId;
    private boolean isEndommage;
    private boolean isPleinEffectue;
    private int nbKmEffectues;
    private String photo;

    public Restitution() {
    }

    public Restitution(String retourId, String locationId, boolean isEndommage, boolean isPleinEffectue, int nbKmEffectues, String photo) {
        this.retourId = retourId;
        this.locationId = locationId;
        this.isEndommage = isEndommage;
        this.isPleinEffectue = isPleinEffectue;
        this.nbKmEffectues = nbKmEffectues;
        this.photo = photo;
    }

    public String getRetourId() {
        return retourId;
    }

    public void setRetourId(String retourId) {
        this.retourId = retourId;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public boolean isEndommage() {
        return isEndommage;
    }

    public void setEndommage(boolean endommage) {
        isEndommage = endommage;
    }

    public boolean isPleinEffectue() {
        return isPleinEffectue;
    }

    public void setPleinEffectue(boolean pleinEffectue) {
        isPleinEffectue = pleinEffectue;
    }

    public int getNbKmEffectues() {
        return nbKmEffectues;
    }

    public void setNbKmEffectues(int nbKmEffectues) {
        this.nbKmEffectues = nbKmEffectues;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
