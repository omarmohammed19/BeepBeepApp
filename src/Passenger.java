public class Passenger extends User implements Observer {
    public Passenger(String Type ,String user, String mail, String pass, String mobile)
    {
        this.Type="p";
        this.username=user;
        this.password=pass;
        this.email=mail;
        this.phone=mobile;
    }
    public boolean login(String loginname, String loginpass) {
        //for (int i = 0; i < passengers.size(); i++) {
        if (loginname.equals(username)) {
            if (loginpass.equals(password)) {
                System.out.println("Passenger Login Successful");
                return true;
            } else {
                System.out.println("Password Incorrect Login failed");
                return false;
            }
        }
        else
        {
            System.out.println("Username Incorrect Login failed");
            return false;
        }
    }

    @Override
    public void update(int offer) {
        System.out.println("Driver's offer is " + offer );
    }
}
