public class TurnOnLightCommand implements Command {

    private Mediator mediator;

    public TurnOnLightCommand(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.tornOnAllLights();
    }
}
