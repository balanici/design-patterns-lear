public class TurnOffLightCommand implements Command {

    private Mediator mediator;

    public TurnOffLightCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.tornOfAllLights();
    }
}
