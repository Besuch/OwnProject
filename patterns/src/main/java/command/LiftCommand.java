package command;

public class LiftCommand implements Command {
    Crane crane;

    public LiftCommand(Crane crane) {
        this.crane = crane;
    }

    @Override
    public String execute() {
        return crane.lift();
    }
}