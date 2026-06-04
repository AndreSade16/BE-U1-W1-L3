package Es1;

public class Rettangolo {
    private double w;
    private double h;

    public Rettangolo(double w, double h) {
        this.w = w;
        this.h = h;
    }

//    Metodi

    public static void stampaRettangolo(Rettangolo rett) {
        if (rett != null) {
            System.out.println("Area: " + rett.getArea());
            System.out.println("Perimeter: " + rett.getPerimeter());
        } else {
            System.out.println("Rettangolo non esistente.");
        }
    }

    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        if (r1 != null && r2 != null) {
            System.out.println("Area primo rettangolo: " + r1.getArea());
            System.out.println("Perimetro primo rettangolo: " + r1.getPerimeter());
            System.out.println("Area secondo rettangolo: " + r2.getArea());
            System.out.println("Perimetro secondo rettangolo: " + r2.getPerimeter());
            System.out.println("Somma perimetri: " + (r1.getPerimeter() + r2.getPerimeter()));
            System.out.println("Somma aree: " + (r1.getArea() + r2.getArea()));

        } else {
            System.out.println("Rettangoli non esistenti.");
        }
    }

    public double getArea() {
        return w * h;
    }

    public double getPerimeter() {
        return (h + w) * 2;
    }

}
