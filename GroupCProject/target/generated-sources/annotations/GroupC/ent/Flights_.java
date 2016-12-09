package GroupC.ent;

import GroupC.ent.Passenger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-12-09T11:00:16")
@StaticMetamodel(Flights.class)
public class Flights_ { 

    public static volatile SingularAttribute<Flights, Integer> duration;
    public static volatile ListAttribute<Flights, Passenger> passengers;
    public static volatile SingularAttribute<Flights, String> flightNum;
    public static volatile SingularAttribute<Flights, String> origin;
    public static volatile SingularAttribute<Flights, String> destination;
    public static volatile SingularAttribute<Flights, Date> dated;
    public static volatile SingularAttribute<Flights, Long> id;

}