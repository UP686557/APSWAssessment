package GroupC.ent;

import GroupC.ent.Passenger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-12-09T16:04:47")
@StaticMetamodel(Flight.class)
public class Flight_ { 

    public static volatile SingularAttribute<Flight, Date> date;
    public static volatile SingularAttribute<Flight, Integer> duration;
    public static volatile ListAttribute<Flight, Passenger> passengers;
    public static volatile SingularAttribute<Flight, String> flightNum;
    public static volatile SingularAttribute<Flight, String> origin;
    public static volatile SingularAttribute<Flight, String> destination;
    public static volatile SingularAttribute<Flight, Long> id;
    public static volatile SingularAttribute<Flight, Passenger> userName;

}