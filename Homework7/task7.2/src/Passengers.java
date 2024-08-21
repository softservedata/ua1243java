import java.util.Objects;

public class Passengers implements Vehicle{
    private int passengers;

    public Passengers(int passengers) {
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
    public void fly(){

    }

    @Override
    public int hashCode() {
        return Objects.hashCode(passengers);
    }
    public String report(){
        return "Information ";
    }
}
