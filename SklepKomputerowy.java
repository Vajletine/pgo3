public class SklepKomputerowy {
    private Produkt[] produkty;
    private Klient[] klient;
    private Zamuwienie[] zamuwienie;
    private int liczbaProduktow;
    private int liczbaKlientow;
    private int liczbaZamuwien;

    public SklepKomputerowy(int maksProdukty, int maksKlienci, int maksZamowienia) {
        produkty = new Produkt[maksProdukty];
        klient = new Klient[maksKlienci];
        Zamuwienie = new Zamowienie[maksZamowienia];
        liczbaProduktow = 0;
        liczbaKlientow = 0;
        liczbaZamowien = 0;
    }

    public void dodajProdukt(Produkt produkt) {
        if (liczbaProduktow < produkty.length) {
            produkty[liczbaProduktow++] = produkt;
            System.out.println("Produkt " + produkt.getNazwa() + " został dodany do sklepu.");
        } else {
            System.out.println("Brak miejsca na dodanie produktu.");
        }
    }

    public void dodajKlienta(Klient klient) {
        if (liczbaKlientow < klienci.length) {
            klienci[liczbaKlientow++] = klient;
            System.out.println("Klient " + klient.getImie() + " " + klient.getNazwisko() + " został dodany do sklepu.");
        } else {
            System.out.println("Brak miejsca na dodanie klienta.");
        }
    }

    public void utworzZamowienie(Klient klient, Produkt[] produkty, int[] ilosci) {
        if (liczbaZamowien < zamowienia.length) {
            Zamowienie zamowienie = new Zamowienie(liczbaZamowien + 1, klient, produkty, ilosci, "2025-03-26", "Nowe");
            zamowienia[liczbaZamowien++] = zamowienie;
            System.out.println("Zamówienie nr " + zamowienie.getId() + " zostało utworzone.");
        } else {
            System.out.println("Brak miejsca na utworzenie nowego zamówienia.");
        }
    }


    public void aktualizujStanMagazynowy(Zamowienie zamowienie) {
        Produkt[] produkty = zamowienie.getProdukty();
        int[] ilosci = zamowienie.getIlosci();

        for (int i = 0; i < produkty.length; i++) {
            for (int j = 0; j < liczbaProduktow; j++) {
                if (produkty[i].getId() == produkty[j].getId()) {
                    produkty[j].setIloscWMagazynie(produkty[j].getIloscWMagazynie() - ilosci[i]);
                    System.out.println("Stan magazynowy produktu " + produkty[j].getNazwa() + " został zaktualizowany.");
                    break;
                }
            }
        }
    }

    public void zmienStatusZamowienia(int idZamowienia, String nowyStatus) {
        for (int i = 0; i < liczbaZamowien; i++) {
            if (zamowienia[i].getId() == idZamowienia) {
                zamowienia[i].setStatus(nowyStatus);
                System.out.println("Status zamówienia nr " + idZamowienia + " został zmieniony na: " + nowyStatus);
                return;
            }
        }
        System.out.println("Zamówienie o podanym identyfikatorze nie zostało znalezione.");
    }

    public void wyswietlProduktyWKategorii(String kategoria) {
        boolean znaleziono = false;
        System.out.println("Produkty w kategorii: " + kategoria);
        for (int i = 0; i < liczbaProduktow; i++) {
            if (produkty[i].getKategoria().equalsIgnoreCase(kategoria)) {
                produkty[i].wyswietlInformacje();
                znaleziono = true;
            }
        }
        if (!znaleziono) {
            System.out.println("Brak produktów w tej kategorii.");
        }
    }


    public void wyswietlZamowieniaKlienta(int idKlienta) {
        boolean znaleziono = false;
        System.out.println("Zamówienia klienta o ID: " + idKlienta);
        for (int i = 0; i < liczbaZamowien; i++) {
            if (zamowienia[i].getKlient().getId() == idKlienta) {
                zamowienia[i].wyswietlSzczegoly();
                znaleziono = true;
            }
        }
        if (!znaleziono) {
            System.out.println("Brak zamówień dla tego klienta.");
        }
    }


}

