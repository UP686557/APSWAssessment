/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GroupC.ctrl;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;

import GroupC.bus.PassengerService;
import GroupC.ent.Flight;
import GroupC.ent.Passenger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
/**
 *
 * @author G-ilberto
 */
public class Controller {
    private String firstName,userName, lastName, address, postcode, phoneNum, emailAddress, origin, flightNum, destination;
    private Date date;
    private ArrayList<Passenger> passengers;

    public Controller() {
    }
    
    private Passenger passenger;
    private Flight flights;

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight getFlights() {
        return flights;
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
    private String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public void addDetails(String userName, String firstName, String lastName, String address, String postcode, String phoneNum, String emailAddress, String flightNum, String origin, String destination, Date date, int duration,ArrayList<Passenger> passengers) {
        this.userName=userName;
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.postcode=postcode;
        this.phoneNum=phoneNum;
        this.emailAddress=emailAddress;
        Passenger p = new Passenger(userName, firstName, lastName, address, postcode, phoneNum,emailAddress);
        
        this.flightNum=flightNum;
        this.origin=origin;
        this.destination=destination;
        this.date=date;
        this.passengers=passengers;
        Flight f = new Flight(flightNum, origin, destination, date, passengers);
        
        ps.addBooking(p, f);
        

    }

    private PassengerService lookupPassengerServiceBean() {
        try {
            Context c = new InitialContext();
            return (PassengerService) c.lookup("java:global/com.mycompany_GroupCProject_war_1.0-SNAPSHOT/PassengerService!GroupC.bus.PassengerService");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }


}
