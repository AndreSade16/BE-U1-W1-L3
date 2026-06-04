package Es2;

public class Main {
    static void main(String[] args) {
        Sim sim1 = new Sim("3467484563");
        Chiamata[] calls = {
                new Chiamata("3467484563", 3.24),
                new Chiamata("3467484563", 5.10),
                new Chiamata("3467484563", 2.45),
                new Chiamata("3467484563", 8.00),
                new Chiamata("3467484563", 1.75)
        };

        sim1.setCallsList(calls);
        sim1.printSimData();
        

    }

}
