package Es1;


public class Main {
    static void main(String[] args) {
        Rettangolo rett1 = new Rettangolo(10, 3);
        Rettangolo rett2 = new Rettangolo(15, 3);
        Rettangolo.stampaRettangolo(rett1);
        Rettangolo.stampaDueRettangoli(rett1, rett2);
    }
}
