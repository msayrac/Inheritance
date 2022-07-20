public abstract class Asistan extends Akademisyen {
    private String officeSaati;

    public Asistan(String adSoyad, String telefon, String ePosta, String bolum, String unvan,String officeSaati) {
        super(adSoyad, telefon, ePosta, bolum, unvan);
        this.officeSaati = officeSaati;
    }

    public String getOfficeSaati() {
        return officeSaati;
    }

    public void setOfficeSaati(String officeSaati) {
        this.officeSaati = officeSaati;
    }

    public void quizYap(){
        System.out.println(this.getAdSoyad() + " quiz yapti");
    }
}
