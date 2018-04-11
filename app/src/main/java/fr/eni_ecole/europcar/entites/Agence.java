package fr.eni_ecole.europcar.entites;

public class Agence {
    private String AgenceId;
    private String raisonSociale;
    private String siret;
    private String voie;
    private String codePostal;
    private String ville;

    /**
     * Constructeur par défaut
     */
    public Agence() {

    }

    /**
     * Constructeur avec paramètres
     * @param agenceId
     * @param raisonSociale
     * @param siret
     * @param voie
     * @param codePostal
     * @param ville
     */
    public Agence(String agenceId, String raisonSociale, String siret, String voie, String codePostal, String ville) {
        AgenceId = agenceId;
        this.raisonSociale = raisonSociale;
        this.siret = siret;
        this.voie = voie;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    /**
     * Getters et Setters
     */
    public String getAgenceId() {
        return AgenceId;
    }

    public void setAgenceId(String agenceId) {
        AgenceId = agenceId;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public String getSiret() {
        return siret;
    }

    public void setSiret(String siret) {
        this.siret = siret;
    }

    public String getVoie() {
        return voie;
    }

    public void setVoie(String voie) {
        this.voie = voie;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
