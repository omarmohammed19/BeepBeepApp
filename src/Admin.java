import java.util.ArrayList;
import java.util.List;

public class Admin extends UserManager {
    private List<Observer> observers = new ArrayList<>();
    public boolean getPendingList(UserManager u1)
    {
        boolean flag = false;
        for (int i = 0 ;i<u1.drivers.size();i++)
        {
            if(u1.drivers.get(i).verified == 0)
            {
                flag = true;
                System.out.println(i+1 + " - " + u1.drivers.get(i).username + " " );

            }

        }
        return flag;
    }
    public void verifyDriver(int driver,UserManager u1 )
    {
        u1.drivers.get(driver-1).verified = 1;

    }


}

