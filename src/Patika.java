public class Patika {
    public static void main(String[] args) {

        Calisan c1 = new Calisan("Mustafa","13245678","info@patika");

        Akademisyen a1 = new Akademisyen("Patika","123456","bili@patika","fizik","dr");
        Calisan m1 = new Memur("Ali", "123456","a@memur","bilgi islem","9-5");

        OgretimGorevlisi o1 = new OgretimGorevlisi("Mahtmut", "234","mahmut@","CENG","Dr","102");

        Asistan as1 = new Asistan("Asistan Ahmet","13245","asista@","fizik","asistan","9-5");

        BilgiI_islem b1 = new BilgiI_islem("Bigl islem ali","234567","bilgiilsme@","network kuurlunu","9-5","kurulum bakim");


        GuvenlikGorevlisi g1 = new GuvenlikGorevlisi("guvenlik mehmet","234567","g@","koruma","8-6","kayit");

        g1.nobet();



    }

}
