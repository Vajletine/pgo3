public class Klient {
    private int id;
    private String imie;
    private String nazwisko;
    private String adresEmail;
    private boolean czyStaly;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getAdresEmail() {
        return adresEmail;
    }

    public void setAdresEmail(String adresEmail) {
        this.adresEmail = adresEmail;
    }

    public boolean isCzyStaly() {
        return czyStaly;
    }

    public void setCzyStaly(boolean czyStaly) {
        this.czyStaly = czyStaly;
    }
    public void wyswietlInformacje(){
        System.out.println("id:"+ id +
                "imie:" + imie +
                "nazwisko:" + nazwisko +
                "email:" + adresEmail +
                "czy to stały klient:" + czyStaly);
    }

    public Klient(int id, String imie, String nazwisko, String email, boolean czyStaly) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.czyStaly = czyStaly;
    }
    public static void main(String[] args) {

        Klient klient = new Klient(1, "Jan", "Kowalski", "jan.kowalski@example.com", true);


        klient.wyswietlInformacje();
    }


}
