/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GroupC.bus;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import GroupC.ent.Flights;
import GroupC.ent.Passenger;
import GroupC.pers.PassengerFacade;
import GroupC.pers.FlightsFacade;


@Stateless
public class PassengerService {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @EJB
    private PassengerFacade pf;
    @EJB
    private FlightsFacade af;

/*    public Passenger changeHome (Passenger p, Flights a) throws BusinessException {
        //marry up
        p = pf.edit(p);
        a = af.edit(a);

        //business logic
        p.getHome().getOccupants().remove(p);
        p.setHome(a);
        a.getOccupants().add(p);

        //return something
        return p;
    }*/
}
