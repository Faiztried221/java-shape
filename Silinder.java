public class Silinder extends Lingkaran {
    private double tinggi;

    public Silinder(double tinggi, double radius, String warna){
        super(radius, warna);
        this.tinggi = tinggi;
    }

    public double getTinggi(){
        return tinggi;
    }

    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }

    public double HitungVolume(){
        return HitungLuas() * tinggi;
    }

    @Override 
    public void print(){
        System.out.printf("Silinder: " + getWarna() + ", Volume: " + HitungVolume());
    }
}
