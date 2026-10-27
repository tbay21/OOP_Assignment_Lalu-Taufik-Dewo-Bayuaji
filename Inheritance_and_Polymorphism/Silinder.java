
public class Silinder extends Lingkaran {
    private double tinggi;

    public Silinder(double tinggi, double radius, String warna) {
        super(radius, warna);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double t) {
        tinggi = t;
    }

    @Override
    public double hitung() {
        return super.hitung() * tinggi;
    }

    @Override
    public void printInfo() {
        System.out.println(
            "Silinder warna " + getWarna()
            + ", volume = " + hitung()
        );
    }
}
