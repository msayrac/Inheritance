public class Akademisyen extends Calisan {

    private String bolum;
    private String unvan;

    public Akademisyen(String adSoyad, String telefon, String ePosta,String bolum, String unvan) {
        super(adSoyad, telefon, ePosta);
        this.bolum=bolum;
        this.unvan  =unvan;


    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public void derseGir(){
        System.out.println(this.getAdSoyad() + " ders girdi");
    }

    public void senatoToplanti(){
        System.out.println(this.getAdSoyad() + " senato toplantisi yapti");
    }

    public void sinavYap(){
        System.out.println(this.getAdSoyad() + " sinav yapti");
    }
}
