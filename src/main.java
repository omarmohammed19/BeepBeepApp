import java.util.Scanner;
import java.util.*;

public class main {

    static Passenger newUser;
    static Driver newDriver;
    static UserManager u1;
    static RideManager rideManager;

    public static void main(String[] args) {

        int driverno;
        Scanner s = new Scanner(System.in);
        rideManager = new RideManager();
        Admin admin = new Admin();
        String Type = null;
        int verified = 0;
        u1 = new UserManager();

        String username = "Omar";
        String email = "omer@gmail.com";
        String pass = "omer123456";
        String phone = "123456789";

        String usernamey = "Ahmed";
        String emaily = "ahmed@gmail.com";
        String passy = "ahmed123456";
        String phoney = "123456789";

        String usernames = "Adham";
        String emails = "adham@gmail.com";
        String passs = "adham123456";
        String phones = "123456789";
        String licenseid = "1539241";
        String nationalid = "86129125";

        String usernamest = "Adel";
        String emailst = "Adel@gmail.com";
        String passst = "adel123456";
        String phonest = "123456789";
        String licenseidt = "1539241";
        String nationalidt = "86129125";

        Passenger user = new Passenger(Type, usernamey, emaily, passy, phoney);

        Passenger userq = new Passenger(Type, username, email, pass, phone);

        Driver driver = new Driver(Type, usernames, emails, passs, phones, licenseid, nationalid, 1);

        Driver driverz = new Driver(Type, usernamest, emailst, passst, phonest, licenseidt, nationalidt, 1);


        u1.registerUser(user);
        u1.registerUser(userq);
        u1.registerDriver(driver);
        u1.registerDriver(driverz);
        boolean status = true;

    }
}
