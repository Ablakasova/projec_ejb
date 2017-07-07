/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import entities.Applications;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Gulshat
 */
@Stateless
public class ApplicationsFacade extends AbstractFacade<Applications> {

    @PersistenceContext(unitName = "prjivy-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ApplicationsFacade() {
        super(Applications.class);
    }
    
}
