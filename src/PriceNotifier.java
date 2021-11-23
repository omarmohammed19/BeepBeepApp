import java.util.ArrayList;

public class PriceNotifier implements Notifier {
    int offer;
    ArrayList observers = new ArrayList();

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        int i=0;
        Observer observer = (Observer) observers.get(i);
        observer.update(offer);
        i++;

    }
    public void PriceChanged() {
        notifyObservers();
    }
    public void SetOffer( int offer)
    {
        this.offer=offer;
        PriceChanged();

    }
}
