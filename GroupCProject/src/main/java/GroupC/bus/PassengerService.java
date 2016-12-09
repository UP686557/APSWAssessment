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

    public Passenger changeFlight (Passenger p, Flights f) throws BusinessException {
        //marry up
        p = pf.edit(p);
        f = af.edit(f);
        //business logic
        p.setFlightNum(f);
        //return something
        return p;
    }
    
    public Passenger changeAddress(Passenger p, String address) throws BusinessException{
        p = pf.edit(p);
        p.setAddress(address);
        return p;
    }
    
    public Flights removeFromFlight(Passenger p, Flights f){
        p = pf.edit(p);
        f = af.edit(f);
        
        f.getPassengers().remove(p);
        return f;
    }
}
