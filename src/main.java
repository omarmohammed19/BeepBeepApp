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

        do {
            System.out.println("Choose a number ");
            System.out.println("1:Register User");
            System.out.println("2:Register Driver");
            System.out.println("3:User Login");
            System.out.println("4:Driver Login");
            System.out.println("5:Verify Drivers");
            int choice;
            choice = s.nextInt();
            if (choice == 1)
            {
                String newuser, newpass, newmail, newphone;
                System.out.println("Enter Username");
                newuser = s.next();
                System.out.println("Enter Password");
                newpass = s.next();
                System.out.println("Enter Email");
                newmail = s.next();
                System.out.println("Enter Phone");
                newphone = s.next();
                newUser = new Passenger(Type, newuser, newmail, newpass, newphone);
                u1.registerUser(newUser);
                System.out.println("All registered Passengers");

                for (int i = 0; i < u1.passengers.size(); i++)
                {
                    System.out.println(i + 1 + "-" + u1.passengers.get(i).username);
                }
            }
            else if(choice == 2)
            {
                String newdriver , newpassdriver , newmaildriver , newphonedriver , newlicense , newnationalid;
                System.out.println("Enter Username");
                newdriver = s.next();
                System.out.println("Enter Password");
                newpassdriver = s.next();
                System.out.println("Enter Email");
                newmaildriver = s.next();
                System.out.println("Enter Phone");
                newphonedriver = s.next();
                System.out.println("Enter Licenseid");
                newlicense = s.next();
                System.out.println("Enter nationalid");
                newnationalid = s.next();
                newDriver = new Driver(Type,newdriver,newmaildriver,newpassdriver,newphonedriver,newlicense,newnationalid,verified);
                u1.registerDriver(newDriver);
                System.out.println("All registered drivers");

                for (int i = 0; i < u1.drivers.size(); i++)
                {
                    System.out.println(u1.drivers.get(i).username);
                }
            }
            else if(choice == 3)
            {
                String passwordo ;
                boolean goes = true;
                for (int i = 0; i < u1.passengers.size(); i++) {
                    System.out.println(i+1+"-"+u1.passengers.get(i).username);
                }
                System.out.println("Choose the user to login with");
                int loggeduser = s.nextInt();
                if(loggeduser == 1)
                {
                    System.out.println("Enter Password");
                    passwordo = s.next();
                    if (user.login(u1.passengers.get(loggeduser-1).username,passwordo))
                    {
                        do {
                            System.out.println("Choose a number ");
                            System.out.println("1:User RequestRide");
                            System.out.println("3:exit");
                            int choicey;
                            choicey = s.nextInt();
                            if (choicey == 1)
                            {
                                String source , destination;
                                System.out.println("Enter source");
                                source = s.nextLine();
                                source = s.nextLine();
                                System.out.println("Enter destination");
                                destination = s.nextLine();
                                user.r1.requestrides(source, destination);
                                rideManager.addRide(user);
                                goes=false;
                            }
                            else if (choicey == 2)
                            {
                                System.exit(0);
                            }
                        }while(goes);
                    }
                    else
                    {
                        System.out.println("Login Failed choose another user or check your password");
                        //return;
                    }

                }
                else if(loggeduser == 2)
                {
                    System.out.println("Enter Password");
                    passwordo = s.next();
                    if (userq.login(u1.passengers.get(loggeduser-1).username,passwordo))
                    {
                        do {
                            System.out.println("Choose a number ");
                            System.out.println("1:User RequestRide");
                            System.out.println("2:exit");
                            int choicey;
                            choicey = s.nextInt();
                            if (choicey == 1)
                            {
                                String source , destination;
                                System.out.println("Enter source");
                                source = s.nextLine();
                                source = s.nextLine();
                                System.out.println("Enter destination");
                                destination = s.nextLine();
                                userq.r1.requestrides(source, destination);
                                rideManager.addRide(userq);
                                goes=false;
                            }
                            else if (choicey == 2)
                            {
                                System.exit(0);
                            }
                        }while(goes);
                    }
                    else
                    {
                        System.out.println("Login Failed choose another user or check your password");
                    }

                }
                else if(loggeduser == 3)
                {
                    System.out.println("Enter Password");
                    passwordo = s.next();
                    if (newUser.login(u1.passengers.get(loggeduser-1).username,passwordo))
                    {
                        do {
                            System.out.println("Choose a number ");
                            System.out.println("1:User RequestRide");
                            System.out.println("3:exit");
                            int choicey;
                            choicey = s.nextInt();
                            if (choicey == 1)
                            {
                                String source , destination;
                                System.out.println("Enter source");
                                source = s.nextLine();
                                source = s.nextLine();
                                System.out.println("Enter destination");
                                destination = s.nextLine();
                                newUser.r1.requestrides(source, destination);
                                rideManager.addRide(newUser);
                                goes=false;
                            }
                            else if (choicey == 2)
                            {
                                System.exit(0);
                            }
                        }while(goes);
                    }
                    else
                    {
                        System.out.println("Login Failed choose another user or check your password");
                        //return;
                    }

                }
            }
            else if (choice == 4)
            {
                String passwordo;
                boolean goes = true;
                for (int i = 0; i < u1.drivers.size(); i++) {
                    System.out.println(i+1+"-"+u1.drivers.get(i).username);
                }
                System.out.println("Choose the user to login with");
                int loggeduser = s.nextInt();
                if(loggeduser == 1)
                {
                    boolean flag1 = true;
                    System.out.println("Enter Password");
                    passwordo = s.next();
                    if (driver.login(u1.drivers.get(loggeduser-1).username,passwordo))
                    {
                        do {
                            System.out.println("Choose a number ");
                            System.out.println("1:Add Favourite areas");
                            System.out.println("2:Set Offer");
                            System.out.println("3:Return to main menu");
                            System.out.println("4:exit");
                            int choicey;
                            boolean flag = true;
                            choicey = s.nextInt();
                            if (choicey == 1)
                            {
                                int num;
                                String area;
                                do{
                                    System.out.println("Enter the Area : ");
                                    area =  s.next();
                                    driver.addFavoriteAreas(area);
                                    System.out.println("Do u want to enter another one ?  (y/n) ");
                                    String opt = s.next();
                                    if (opt.equals("y"))
                                    {
                                        continue;
                                    }
                                    else if (opt.equals("n"))
                                    {
                                        flag = false;
                                        break;
                                    }
                                }while(flag);
                                System.out.println(driver.ListFavAreasRides());
                            }
                            else if (choicey==2) {

                                if(rideManager.driverMactchedRides(driver))
                                {
                                    for (int i = 0; i < rideManager.matchedride.size(); i++) {
                                        System.out.println(i + 1 + " - " + rideManager.rides.get(rideManager.matchedride.get(i)));
                                    }

                                    System.out.println("Choose a ride to add an offer on");
                                    int rideno = s.nextInt();
                                    System.out.println("Please enter the offer");
                                    int offer = s.nextInt();
                                    driver.p.registerObserver(u1.passengers.get(rideno - 1));
                                    driver.p.SetOffer(offer);
                                    driver.r.Offers.add(offer);
                                }
                                else
                                {
                                    flag1 = false;
                                }
                            }
                            else if (choicey == 3)
                            {
                                flag1 = false;
                            }
                            else if (choicey == 4)
                            {
                                System.exit(0);
                            }
                        }while(flag1);
                    }
                    else
                    {
                        System.out.println("Login Failed choose another user or check your password");
                        //return;
                    }

                }
                else if (loggeduser == 2)
                {
                    boolean flag1 = true;
                    System.out.println("Enter Password");
                    passwordo = s.next();
                    if (driverz.login(u1.drivers.get(loggeduser-1).username,passwordo))
                    {
                        do {
                            System.out.println("Choose a number ");
                            System.out.println("1:Add Favourite areas");
                            System.out.println("2:Set Offer");
                            System.out.println("3:Return to main menu");
                            System.out.println("4:exit");
                            int choicey;
                            boolean flag = true;
                            choicey = s.nextInt();
                            if (choicey == 1)
                            {
                                int num;
                                String area;
                                do{
                                    System.out.println("Enter the Area : ");
                                    area =  s.next();
                                    driverz.addFavoriteAreas(area);
                                    System.out.println("Do u want to enter another one ?  (y/n) ");
                                    String opt = s.next();
                                    if (opt.equals("y"))
                                    {
                                        continue;
                                    }
                                    else if (opt.equals("n"))
                                    {
                                        flag = false;
                                        break;
                                    }
                                }while(flag);
                                System.out.println(driverz.ListFavAreasRides());
                            }
                            else if (choicey==2) {

                                if(rideManager.driverMactchedRides(driverz))
                                {
                                    for (int i = 0; i < rideManager.matchedride.size(); i++) {
                                        System.out.println(i + 1 + " - " + rideManager.rides.get(rideManager.matchedride.get(i)));
                                    }

                                    System.out.println("Choose a ride to add an offer on");
                                    int rideno = s.nextInt();
                                    System.out.println("Please enter the offer");
                                    int offer = s.nextInt();
                                    driverz.p.registerObserver(u1.passengers.get(rideno - 1));
                                    driverz.p.SetOffer(offer);
                                    driverz.r.Offers.add(offer);
                                }
                                else
                                {
                                    flag1 = false;
                                }
                            }
                            else if (choicey == 3)
                            {
                                flag1 = false;
                            }
                            else if (choicey == 4)
                            {
                                System.exit(0);
                            }
                        }while(flag1);
                    }
                    else
                    {
                        System.out.println("Login Failed choose another user or check your password");
                        //return;
                    }
                }
                else if (loggeduser == 3)
                {
                    boolean flag1 = true;
                    System.out.println("Enter Password");
                    passwordo = s.next();
                    if (newDriver.login(u1.drivers.get(loggeduser-1).username,passwordo))
                    {
                        do {
                            System.out.println("Choose a number ");
                            System.out.println("1:Add Favourite areas");
                            System.out.println("2:Set Offer");
                            System.out.println("3:Return to main menu");
                            System.out.println("4:exit");
                            int choicey;
                            boolean flag = true;
                            choicey = s.nextInt();
                            if (choicey == 1)
                            {
                                int num;
                                String area;
                                do{
                                    System.out.println("Enter the Area : ");
                                    area =  s.next();
                                    newDriver.addFavoriteAreas(area);
                                    System.out.println("Do u want to enter another one ?  (y/n) ");
                                    String opt = s.next();
                                    if (opt.equals("y"))
                                    {
                                        continue;
                                    }
                                    else if (opt.equals("n"))
                                    {
                                        flag = false;
                                        break;
                                    }
                                }while(flag);
                                System.out.println(newDriver.ListFavAreasRides());
                            }
                            else if (choicey==2) {

                                if(rideManager.driverMactchedRides(newDriver))
                                {
                                    for (int i = 0; i < rideManager.matchedride.size(); i++) {
                                        System.out.println(i + 1 + " - " + rideManager.rides.get(rideManager.matchedride.get(i)));
                                    }

                                    System.out.println("Choose a ride to add an offer on");
                                    int rideno = s.nextInt();
                                    System.out.println("Please enter the offer");
                                    int offer = s.nextInt();
                                    newDriver.p.registerObserver(u1.passengers.get(rideno - 1));
                                    newDriver.p.SetOffer(offer);
                                    newDriver.r.Offers.add(offer);
                                }
                                else
                                {
                                    flag1 = false;
                                }
                            }
                            else if (choicey == 3)
                            {
                                flag1 = false;
                            }
                            else if (choicey == 4)
                            {
                                System.exit(0);
                            }
                        }while(flag1);
                    }
                    else
                    {
                        System.out.println("Login Failed choose another user or check your password");
                        //return;
                    }
                }

            }
            else if (choice ==5)
            {
                if(admin.getPendingList(u1))
                {
                    System.out.println("Enter number of driver to verify");
                    driverno = s.nextInt();
                    admin.verifyDriver(driverno, u1);
                }
                else
                {
                    System.out.println("The pending list is empty");
                }
            }


        } while (status);
    }
}
