import java.util.ArrayList;
import java.util.List;

public class Driver extends User{
    public String licenseid;
    public String nationalid;
    public int verified;
    List<String> favouritaAreas = new ArrayList<>();


    public Driver(String Type, String user, String mail, String pass, String mobile , String licenseid , String nationalid , int verified)
    {
        this.Type="d";
        this.verified=0;
        this.username=user;
        this.password=pass;
        this.email=mail;
        this.phone=mobile;
        this.licenseid=licenseid;
        this.nationalid=nationalid;
        this.verified=verified;


    }
    public boolean login(String loginname, String loginpass) {
        if (verified == 1) {
            if (loginname.equals(username)) {
                if (loginpass.equals(password)) {
                    System.out.println("Driver Login Successful");
                    return true;
                } else {
                    System.out.println("Password Incorrect Login failed");
                    return false;
                }
            } else {
                System.out.println("Username Incorrect Login failed");
                return false;
            }
        }
        else {
            System.out.println("Account not verified");
            return false;
        }
    }

    public void addFavoriteAreas(String fav)
    {
        favouritaAreas.add(fav);
    }
    public List ListFavAreasRides()
    {
        return favouritaAreas;
    }
}