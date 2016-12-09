/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GroupC.ent;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;

/**
 *
 * @author up687444
 */
@Entity
public class Bookings implements Serializable {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private static final long serialVersionUID = 1L;
    private String origin, destination, firstName;
    private Date date;     
    
   @ManyToOne
    private Flights flightNum;
    private Passenger userName;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Passenger getUserName() {
        return userName;
    }

    public void setUserName(Passenger userName) {
        this.userName = userName;
    }
    
    
    


    public Flights getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(Flights flightNum) {
        this.flightNum = flightNum;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bookings)) {
            return false;
        }
        Bookings other = (Bookings) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GroupC.ent.Bookings[ id=" + id + " ]";
    }
    
}
