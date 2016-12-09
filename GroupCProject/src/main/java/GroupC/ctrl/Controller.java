/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GroupC.ctrl;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import GroupC.bus.BusinessException;
import GroupC.bus.PassengerService;
import GroupC.ent.Flights;
import GroupC.ent.Passenger;
/**
 *
 * @author G-ilberto
 */
public class Controller{
    public Controller() {
    }

    private Passenger passenger;
    private Flights flights;

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flights getFlights() {
        return flights;
    }

    public void setAddress(Flights flight) {
        this.flights = flights;
    }

    @EJB
    private PassengerService ps;

/*    public String doChangeAddress() {
        try {
            ps.changeHome(passenger, flights);
        } catch (BusinessException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage("", new FacesMessage("something went wrong"));
        }
        return "";
    }*/
}
