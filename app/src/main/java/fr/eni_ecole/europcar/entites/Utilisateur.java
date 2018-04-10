package fr.eni_ecole.europcar.entites;

public class Utilisateur {
    private int id;
    private String username;
    private String password;
    private String agence;

    public Utilisateur() {
    }

    public Utilisateur(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Utilisateur(String username, String password, String agence) {
        this.username = username;
        this.password = password;
        this.agence = agence;
    }

    public Utilisateur(int id, String username, String password, String agence) {
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

    public String getAgence() {
        return agence;
    }

    public void setAgence(String agence) {
        this.agence = agence;
    }
}
