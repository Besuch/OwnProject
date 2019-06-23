package command;

public class Machinist {
    private Command turn;
    private Command lift;
    private Command signal;

    public Machinist(Command turn, Command lift, Command signal) {
        this.turn = turn;
        this.lift = lift;
        this.signal = signal;
    }

    void turnCrane() {
        System.out.println(turn.execute());
    }

    void liftCargo() {
        System.out.println(lift.execute());
    }

    void signalCrane() {
        System.out.println(signal.execute());
    }
}