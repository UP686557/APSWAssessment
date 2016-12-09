/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GroupC.bus;

import GroupC.ent.Booking;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import GroupC.ent.Flight;
import GroupC.ent.Passenger;
import GroupC.pers.PassengerFacade;
import GroupC.pers.FlightFacades;


@Stateless
public class PassengerService {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @EJB
    private PassengerFacade pf;
    @EJB
    private FlightFacades af;
    @EJB
    private Booking bt;

    public void addBooking(Passenger p, Flight f) {
        p = pf.edit(p);
        f = af.edit(f);
        Booking b = new Booking(p, f);
        //bt.create(b);
    }

    public Flight removeFromFlight(Passenger p, Flight f) {
        p = pf.edit(p);
        f = af.edit(f);
        f.getPassengers().remove(p);
        return f;
    }

    public Passenger changeAddress(Passenger p, String address) throws BusinessException {
        p = pf.edit(p);
        p.setAddress(address);
        return p;
    }

    public Passenger changeFlight(Passenger p, Flight f) throws BusinessException {
        //marry up
        p = pf.edit(p);
        f = af.edit(f);
        //business logic
        p.setFlightNum(f);
        //return something
        return p;
    }
    /*    public Passenger changeHome (Passenger p, Flight a) throws BusinessException {
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
