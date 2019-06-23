package command;

public class TurnCommand implements Command {

    Crane crane;

    public TurnCommand(Crane crane) {
        this.crane = crane;
    }

    @Override
    public String execute() {
        return crane.turn();
    }
}