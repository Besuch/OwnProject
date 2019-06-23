package command;

public class SignalCommand implements Command {
    Crane crane;

    public SignalCommand(Crane crane) {
        this.crane = crane;
    }

    @Override
    public String execute() {
        return crane.signal();
    }
}