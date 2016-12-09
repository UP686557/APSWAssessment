package GroupC.ent;

import GroupC.ent.Flight;
import GroupC.ent.Passenger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-12-09T16:04:47")
@StaticMetamodel(Booking.class)
public class Booking_ { 

    public static volatile SingularAttribute<Booking, Date> date;
    public static volatile SingularAttribute<Booking, String> firstName;
    public static volatile SingularAttribute<Booking, Flight> flightNum;
    public static volatile SingularAttribute<Booking, String> origin;
    public static volatile SingularAttribute<Booking, String> destination;
    public static volatile SingularAttribute<Booking, Long> id;
    public static volatile SingularAttribute<Booking, Passenger> userName;

}