public class UserManager extends DataSaver {
    public void registerUser(Passenger passenger) {
        passengers.add(passenger);

    }

    public void registerDriver(Driver driver) {
        drivers.add(driver);
    }
}
