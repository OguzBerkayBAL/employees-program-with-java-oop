public class yazilimci extends calisan {
    private String diller;

    public yazilimci(String ad,String soyad,int id,String diller){
        super(ad,soyad,id);
        this.diller = diller;
    }
    public void formatAt(String isletimSistemi){
        System.out.println(getAd()+" "+isletimSistemi+" ni yukluyor...");
    }
    public void bilgileriGoster(){
        super.bilgileriGoster();
        System.out.println("yazilimcinin bildigi diller: "+diller);
    }
}
