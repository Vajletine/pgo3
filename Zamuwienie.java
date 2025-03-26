public class Zamuwienie {
    private int id;
    private Klient klient;
    private Produkt [] produkty;
    private int[] ilosc;
    private String dataZamuwienia;
    private String status;

    public Zamowienie(int id, Klient klient, Produkt[] produkty, int[] ilosci, String dataZamowienia, String status) {
        this.id = id;
        this.klient = klient;
        this.produkty = produkty;
        this.ilosc = ilosci;
        this.dataZamuwienia = dataZamowienia;
        this.status = status;
    }

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
            double wartość = 0 ;
            wartosc += produkty[i].getCena() * ilosc[i];
        }

        return wartosc;
    }
    public void zastosujZnizke() {
        if (klient.isCzyStaly()) {
            double wartosc = obliczWartoscZamuwienia();
            double zniżka = wartosc * 0.10;
            System.out.println("Zniżka dla stałego klienta: " + zniżka + " PLN");
            System.out.println("Nowa wartość zamówienia: " + (wartosc - zniżka) + " PLN");
        } else {
            System.out.println("Brak zniżki dla tego klienta.");
        }
    }
    public void wyswietlSzczegoly() {
        System.out.println("Zamówienie ID: " + id);
        System.out.println("Klient: " + klient.getImie() + " " + klient.getNazwisko());
        System.out.println("Data zamówienia: " + dataZamowienia);
        System.out.println("Status zamówienia: " + status);

        System.out.println("Produkty w zamówieniu:");
        for (int i = 0; i < produkty.length; i++) {
            System.out.println("- " + produkty[i].getNazwa() + " x" + ilosci[i] + " | Cena: " + produkty[i].getCena() + " PLN");
        }
        System.out.println("Łączna wartość zamówienia: " + obliczWartoscZamowienia() + " PLN");
    }





    }
