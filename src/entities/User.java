/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Name
 */
public class User {
     private int id,type;
    private String nom, prenom,email,tel;

    public User() {
    }
    
    public User(String nom, String prenom, String email, String tel, int type) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tel = tel;
        this.type = type;
    }

    public User(int id, String nom, String prenom, String email, String tel,int type) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tel = tel;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getTel() {
        return tel;
    }
    
    public int getType() {
        return type;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setTel(String tel) {
        this.tel = tel;
    }
    
    public void setType(int type) {
        this.type = type;
    }
    
    
    @Override
    public String toString() {
        return "user{" + "nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", email=" + email + ", tel=" + tel + ", type=" + type + "}";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
}
