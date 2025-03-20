public class Zamuwienie {
    private int id;
    private Klient klient;
    private Produkt [] produkty;
    private int[] ilosc;
    private String dataZamuwienia;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }

    public Produkt[] getProdukty() {
        return produkty;
    }

    public void setProdukty(Produkt[] produkty) {
        this.produkty = produkty;
    }

    public int[] getIlosc() {
        return ilosc;
    }

    public void setIlosc(int[] ilosc) {
        this.ilosc = ilosc;
    }

    public String getDataZamuwienia() {
        return dataZamuwienia;
    }

    public void setDataZamuwienia(String dataZamuwienia) {
        this.dataZamuwienia = dataZamuwienia;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public double obliczWartoscZamuwienia(){
        for (int i = 0; i < produkty.length; i++) {
            double produkty =
        }

        return 0.0;
    }


}
