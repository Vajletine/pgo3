public class Produkt {
    private int id;
    private String nazwa;
    private String kategorie;
    private double cena;
    private int iloscWMagazynie;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKategorie() {
        return kategorie;
    }

    public void setKategorie(String kategorie) {
        this.kategorie = kategorie;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getIloscWMagazynie() {
        return iloscWMagazynie;
    }

    public void setIloscWMagazynie(int iloscWMagazynie) {
        this.iloscWMagazynie = iloscWMagazynie;
    }
    public void wyswietlInformacje(){
        System.out.println("id :" + id +
                "nazwa :"+ nazwa +
                "kategoria:"+ kategorie +
                "cena:" + cena +
                "ilość w magazynie: "+ iloscWMagazynie);
    }

}
