/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import entities.Universities;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Gulshat
 */
@Stateless
public class UniversitiesFacade extends AbstractFacade<Universities> {

    @PersistenceContext(unitName = "prjivy-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UniversitiesFacade() {
        super(Universities.class);
    }
    
}
