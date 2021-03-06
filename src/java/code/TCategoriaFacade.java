/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Fernando
 */
@Stateless
public class TCategoriaFacade extends AbstractFacade<TCategoria> {

    @PersistenceContext(unitName = "TPWEBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TCategoriaFacade() {
        super(TCategoria.class);
    }
    
}
