package GroupC.ent;

import GroupC.ent.Flight;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-12-09T16:04:47")
@StaticMetamodel(Passenger.class)
public class Passenger_ { 

    public static volatile SingularAttribute<Passenger, String> firstName;
    public static volatile SingularAttribute<Passenger, String> lastName;
    public static volatile SingularAttribute<Passenger, Flight> flightNum;
    public static volatile SingularAttribute<Passenger, String> emailAddress;
    public static volatile SingularAttribute<Passenger, String> address;
    public static volatile SingularAttribute<Passenger, String> postcode;
    public static volatile SingularAttribute<Passenger, String> phoneNum;
    public static volatile SingularAttribute<Passenger, Long> id;
    public static volatile SingularAttribute<Passenger, String> userName;

}