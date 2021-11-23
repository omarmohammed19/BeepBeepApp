import java.util.ArrayList;
import java.util.List;

public class Ride {
    String source;
    String destination;
    List<Integer> Offers = new ArrayList<Integer>();
    public Ride() {

    }
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
    public void requestrides(String source, String destination)
    {
        this.source=source;
        this.destination=destination;
        System.out.println("Ride requested from " + source +  " to " + destination);

    }
}
