package fr.eni_ecole.europcar.entites;

public class Utilisateur {
    private int id;
    private String username;
    private String password;
    private Agence agence;

    public Utilisateur() {
    }

    public Utilisateur(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Utilisateur(String username, String password, Agence agence) {
        this.username = username;
        this.password = password;
        this.agence = agence;
    }

    public Utilisateur(int id, String username, String password, Agence agence) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.agence = agence;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Agence getAgence() {
        return agence;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }
}
