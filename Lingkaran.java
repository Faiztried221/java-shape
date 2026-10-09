public class Lingkaran extends Bentuk {
    private double radius;
    public static final double PHI = Math.PI;

    public Lingkaran(double radius, String warna){
        super(warna);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void seetRadius(double radius){
        this.radius = radius;
    }

    public double HitungLuas(){
        return PHI*radius*radius;
    }

    @Override 
    public void print(){
        System.out.println("Lingkaran: " + getWarna() + ", Luas: " + HitungLuas());
    }
}
