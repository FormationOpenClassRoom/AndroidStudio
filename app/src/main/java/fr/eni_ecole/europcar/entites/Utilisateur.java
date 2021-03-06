package fr.eni_ecole.europcar.entites;

public class Utilisateur {
    private String userId;
    private String email;
    private String password;
    private String agenceId;
    private String token;

    /**
     * Constructeur par défaut
     */
    public Utilisateur() {
    }

    /**
     * Constructeur avec paramètres
     * @param email
     * @param password
     */
    public Utilisateur(String email, String password) {
        this.email = email;
        this.password = password;
    }

    /**
     * Constructeur avec paramètres
     * @param email
     * @param password
     * @param agenceId
     */
    public Utilisateur(String email, String password, String agenceId) {
        this.email = email;
        this.password = password;
        this.agenceId = agenceId;
    }

    /**
     * Constructeur avec paramètres
     * @param userId
     * @param email
     * @param password
     * @param agenceId
     * @param token
     */
    public Utilisateur(String userId, String email, String password, String agenceId, String token) {
        this.userId = userId;
        this.email = email;
        this.password = password;
        this.agenceId = agenceId;
    }

    /**
     * Getters et Setters
     */

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAgenceId() {
        return agenceId;
    }

    public void setAgenceId(String agenceId) {
        this.agenceId = agenceId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
