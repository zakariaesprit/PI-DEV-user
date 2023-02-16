/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import entities.User;
import util.Data;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Name
 */

public class ServiceUser implements IService<User> {
    Connection cnx = Data.getInstance().getCnx();

    public void ajouter(User u) {
        try {
            String req = "INSERT INTO `user` (`nom_u`, `prenom_u`, `email_u`, `numtel_u`, `type_user`) VALUES ('" + u.getNom() + "', '" + u.getPrenom() + "', '" + u.getEmail() + "', '" + u.getTel() + "', '" + u.getType() + "')";
            Statement st = cnx.createStatement();
            st.executeUpdate(req);
            System.out.println("Personne created !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void ajouter2(User u) {
        try {
            String req = "INSERT INTO `user` (`nom_u`, `prenom_u`, `email_u`, `numtel_u`, `type_user`) VALUESVALUES (?,?,?,?,?)";
            PreparedStatement ps = cnx.prepareStatement(req);
            ps.setString(2, u.getPrenom());
            ps.setString(1, u.getNom());
            ps.setString(3, u.getEmail());
            ps.setString(4, u.getTel());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void supprimer(int id) {
        try {
            String req = "DELETE FROM `user` WHERE id_u = " + id;
            Statement st = cnx.createStatement();
            st.executeUpdate(req);
            System.out.println("User deleted !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void modifier(User u) {
        try {
            String req = "UPDATE `user` SET `nom_u` = '" + u.getNom() + "', `prenom_u` = '" + u.getPrenom() + "', `prenom_u` = '" + u.getPrenom()+ "', `email_u` = '" + u.getEmail() + "', `numtel_u` = '" + u.getTel() + "', `type_user` = '" + u.getTel() + "' WHERE `user`.`id_u` = " + u.getId();
            Statement st = cnx.createStatement();
            st.executeUpdate(req);
            System.out.println("User updated !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public List<User> getAll() {
        List<User> list = new ArrayList<>();
        try {
            String req = "Select * from user";
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(req);
            while (rs.next()) {
                User u = new User(rs.getInt(1), rs.getString("nom_u"), rs.getString("prenom_u"), rs.getString("email_u"), rs.getString("numtel_u"), rs.getInt("type_user"));
                list.add(u);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return list;
    }
}
