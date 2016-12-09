package GroupC.ent;

import GroupC.ent.Flights;
import GroupC.ent.Passenger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-12-09T12:50:45")
@StaticMetamodel(Bookings.class)
public class Bookings_ { 

    public static volatile SingularAttribute<Bookings, Date> date;
    public static volatile SingularAttribute<Bookings, String> firstName;
    public static volatile SingularAttribute<Bookings, Flights> flightNum;
    public static volatile SingularAttribute<Bookings, String> origin;
    public static volatile SingularAttribute<Bookings, String> destination;
    public static volatile SingularAttribute<Bookings, Long> id;
    public static volatile SingularAttribute<Bookings, Passenger> userName;

}