/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;

/**
 *
 * @author Name
 */
public interface IService <T>{
     public void ajouter(T u);
     public void modifier(T u);
     public List<T> getAll();
     public void ajouteradmin(T a);
}
