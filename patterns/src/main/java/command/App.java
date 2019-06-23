package command;

public class App {
    public static void main(String[] args) {

        Crane crane = new Crane();
        Machinist machinist = new Machinist(new TurnCommand(crane), new LiftCommand(crane), new SignalCommand(crane));

        machinist.turnCrane();
        machinist.liftCargo();
        machinist.signalCrane();
    }
}