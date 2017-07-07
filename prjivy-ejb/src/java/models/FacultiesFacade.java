/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import entities.Faculties;
import entities.Universities;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Gulshat
 */
@Stateless
public class FacultiesFacade extends AbstractFacade<Faculties> {

    @PersistenceContext(unitName = "prjivy-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FacultiesFacade() {
        super(Faculties.class);
    }
    
 
    
    
}
