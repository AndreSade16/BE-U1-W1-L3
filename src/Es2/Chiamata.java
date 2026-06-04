package Es2;

public class Chiamata {
    private String calledNumber;
    private double duration;

    public Chiamata(String calledNumber, double duration) {
        this.calledNumber = calledNumber;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Chiamata{" +
                "calledNumber='" + calledNumber + '\'' +
                ", duration=" + duration +
                '}';
    }
}
