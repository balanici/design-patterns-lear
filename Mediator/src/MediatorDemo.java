public class MediatorDemo {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        Light bedroomLight = new Light("Bedroom");
        Light kitchenLight = new Light("Kitchen");

        mediator.registerLights(bedroomLight);
        mediator.registerLights(kitchenLight);

        Command turnAllLightsCommand = new TurnOnLightCommand(mediator);

        turnAllLightsCommand.execute();

        Command turnOffAllLightsCommand = new TurnOffLightCommand(mediator);

        turnOffAllLightsCommand.execute();
    }
}
