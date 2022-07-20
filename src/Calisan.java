public  abstract class Calisan {

    private String adSoyad;
    private String telefon;
    private String ePosta;

    public Calisan(String adSoyad, String telefon, String ePosta) {
        this.adSoyad = adSoyad;
        this.telefon = telefon;
        this.ePosta = ePosta;
    }

    public void giris(){
        System.out.println(this.getAdSoyad() + " universiteye giris yapti.");
    }

    public void giris(String girisSaati){
        System.out.println(this.getAdSoyad() + " "+ girisSaati + " universiteye giris yapti");
    }



    public  void cikis(){
        System.out.println(this.getAdSoyad() + " universiteden cikis yapti.");
    }

    public void yemekHane(){
        System.out.println(this.getAdSoyad() + " yemekhaneye giris yapti.");
    }

    public static void girisYapanlar(Calisan[] loginUsers){

        for(Calisan c : loginUsers){
            c.giris();

        }

    }









    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getePosta() {
        return ePosta;
    }

    public void setePosta(String ePosta) {
        this.ePosta = ePosta;
    }
}
