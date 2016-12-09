package GroupC.ent;

import GroupC.ent.Flights;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-12-09T12:50:45")
@StaticMetamodel(Passenger.class)
public class Passenger_ { 

    public static volatile SingularAttribute<Passenger, Date> date;
    public static volatile SingularAttribute<Passenger, String> firstName;
    public static volatile SingularAttribute<Passenger, String> lastName;
    public static volatile SingularAttribute<Passenger, Flights> flightNum;
    public static volatile SingularAttribute<Passenger, String> emailAddress;
    public static volatile SingularAttribute<Passenger, String> address;
    public static volatile SingularAttribute<Passenger, String> postcode;
    public static volatile SingularAttribute<Passenger, String> phoneNum;
    public static volatile SingularAttribute<Passenger, Long> id;
    public static volatile SingularAttribute<Passenger, String> userName;

}