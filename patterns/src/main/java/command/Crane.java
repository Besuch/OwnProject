package command;

class Crane {
    private String color = "Silver";
    private String stamp = "DAF";

    public Crane() {
    }

    public Crane(String color, String stamp) {
        this.color = color;
        this.stamp = stamp;
    }

    String turn() {
        return "Turn";
    }

    String lift() {
        return "Lift";
    }

    String signal() {
        return "Signal";
    }
}