public class FanLowState extends State {
    private Fan fan;

    public FanLowState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void handleRequest() {
        System.out.println("Turning fan into med.");
        fan.setState(fan.getFanMedState());
    }

    @Override
    public String toString() {
        return "Fan is low.";
    }
}
