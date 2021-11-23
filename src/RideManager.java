import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RideManager extends DataSaver{
    List <Integer> matchedride = new ArrayList<>();
    public void addRide(User user) {
        List<String> fullride = new ArrayList<String>(Arrays.asList(user.username, user.r1.getSource(), user.r1.getDestination()));
        rides.add(fullride);
    }
    public boolean driverMactchedRides(Driver D) {
        boolean z=false;

        for (int i = 0; i < rides.size(); i++){
            for (int j = 0; j < D.favouritaAreas.size(); j++) {
                if (rides.get(i).get(1).contains(D.favouritaAreas.get(j)))
                {
                    System.out.println(D.username+" has the following ride request:" +rides.get(i));
                    z=true;
                    matchedride.add(i);
                }
            }

        }
        if(z==false)
        {
            System.out.println("No requested rides from your favourite areas ");
            return false;
        }
        return true;
    }
}
