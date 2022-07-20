public class BilgiI_islem extends Memur{
    private String gorev;

    public BilgiI_islem(String adSoyad, String telefon, String ePosta, String departman, String mesai,String gorev) {
        super(adSoyad, telefon, ePosta, departman, mesai);
        this.gorev= gorev;
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }

    public void networkKurulumu(){
        System.out.println(this.getAdSoyad() + " netwwork kurulumu yapti");
    }
}
