
public class Bentuk {
    protected String warna;

    public Bentuk(String warna) {
        this.warna = warna;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public double hitung() {
        return 0;
    }

    public void printInfo() {
        System.out.println("Bentuk berwarna " + warna);
    }
}
