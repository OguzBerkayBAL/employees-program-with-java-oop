public class yonetici extends calisan {
    private int sorumluKisiSayisi;
    public yonetici(String ad,String soyad,int id,int sorumluKisiSayisi){
        super(ad,soyad,id);
        this.sorumluKisiSayisi = sorumluKisiSayisi;
    }
    public void bilgileriGoster(){
        super.bilgileriGoster();
        System.out.println("yoneticinin sorumlu oldugu kisi sayisi : "+sorumluKisiSayisi);
    }
    public void zamYap(int zamMiktari){
        System.out.println(getAd()+ " calisanlara "+zamMiktari+" kadar zam yapiyor..");
    }
}
