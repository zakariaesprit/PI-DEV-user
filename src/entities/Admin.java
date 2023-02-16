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
public class Admin {
    private int idadmin,iduser;
    public Admin() {
    }
    
    public Admin(int iduser) {
        this.iduser = iduser;
    }

    public Admin(int idadmin, int iduser) {
        this.idadmin = idadmin;
        this.iduser = iduser;
    }

    public int getId() {
        return idadmin;
    }

    public int GetUser() {
        return iduser;
    }
}
