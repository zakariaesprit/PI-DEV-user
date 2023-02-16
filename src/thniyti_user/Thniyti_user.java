/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thniyti_user;

import entities.User;
import Service.ServiceUser;
import util.Data;
/**
 *
 * @author Name
 */
public class Thniyti_user {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        User p1 = new User(3,"Abdelaziz", "M","sa@sa","123",1);
        User p2 = new User("Abdelaziz", "M","sa@sa","123",1);
        User p3 = new User("Abdelaziz", "M","sa@sa","123",1);
        User p4 = new User("Abdelaziz", "M","sa@sa","123",1);

        ServiceUser sp = new ServiceUser();
        
        //sp.ajouter(p1);
        /*sp.ajouter(p2);
        sp.ajouter2(p3);
        sp.ajouter2(p4);*/
        
        /*update
        User pm = new User(5,"yaaaay", "M","sa@sa","123",1);
        sp.modifier(pm);*/
        
        /*affichage
        sp.getAll();
        System.out.println(sp.getAll());*/
    }
    
}
