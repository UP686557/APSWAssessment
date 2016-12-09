/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GroupC.pers;

import GroupC.ent.Passenger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author up687444
 */
@Stateless
public class BookingFacade extends AbstractFacade<Passenger> {

    @PersistenceContext(unitName = "com.mycompany_GroupCProject_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BookingFacade() {
        super(Passenger.class);
    }

}