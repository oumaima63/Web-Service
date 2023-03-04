package entities;
public class Employe {

    private String cin;
    private String nom;
    private String prenom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    // constructeur
    public Employe(String cin, String nom, String prenom) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
    }

    // getters et setters
    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    //equals
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.cin != null ? this.cin.hashCode() : 0);
        return hash;
    }
    public  boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employe other = (Employe) obj;
        if ((this.cin == null) ? (other.cin != null) : !this.cin.equals(other.cin)) {
            return false;
        }
        return true;
    }
    // toString
    @Override
    public String toString() {
        return "Employe{" + "cin=" + cin + ", nom=" + nom + ", prenom=" + prenom + '}';
    }
}