package Es2;

import java.util.Arrays;

public class Sim {
    private String number;
    private double credit;
    private Chiamata[] callsList;

    public Sim(String number) {
        this.number = number;
        credit = 0;
        callsList = new Chiamata[]{};
    }

    public void setCallsList(Chiamata[] calls) {
        this.callsList = calls;
    }

    @Override
    public String toString() {
        return "Sim{" +
                "number='" + number + '\'' +
                ", credit=" + credit +
                ", callsList=" + Arrays.toString(callsList) +
                '}';
    }

    public void printSimData() {
        System.out.println(this);
    }
}
