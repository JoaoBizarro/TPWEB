/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Fernando
 */
@Local
public interface UtilizadorFacadeLocal {

    List<TUtilizador> getAll();

    TUtilizador getUser();

    void createNew(String username, String nome, String morada, String password);    

}