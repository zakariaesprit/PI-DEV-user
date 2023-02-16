/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;
import entities.User;
import entities.Admin;
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
public class ServiceAdmin implements IService<Admin> {
    Connection cnx = Data.getInstance().getCnx();

    public void ajouteradmin(Admin a) {
        try {
            String req = "INSERT INTO `admin` (`id_admin`, `id_u`) VALUES ('" + a.getId() + "', '" + a.GetUser() + "')";
            Statement st = cnx.createStatement();
            st.executeUpdate(req);
            System.out.println("Personne created !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
