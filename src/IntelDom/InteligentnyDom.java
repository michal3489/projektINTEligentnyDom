package IntelDom;

import java.util.ArrayList;
import java.util.List;


public class InteligentnyDom {
    private String nazwaDomu;
    private List<Urzadzenie> urzadzenia;

    public InteligentnyDom(String nazwaDomu) {
        this.nazwaDomu = nazwaDomu;
        this.urzadzenia = new ArrayList<>();
    }

    public String getNazwaDomu() {
        return nazwaDomu;
    }

    public void dodajUrzadzenie(Urzadzenie urzadzenie) {
        if (urzadzenie != null) {
            this.urzadzenia.add(urzadzenie);
            System.out.println("Dodano urzadzenie: " + urzadzenie.getNazwaPrzyjazna());
        }
    }

    public void wyswietlStatusWszystkichUrzadzen() {
        System.out.println("\n--- Status urzadzen w domu '" + nazwaDomu + "' ---");
        if (urzadzenia.isEmpty()) {
            System.out.println("Brak urzadzen w domu.");
            return;
        }
        for (Urzadzenie urzadzenie : urzadzenia) {
            System.out.println(urzadzenie.getNazwaPrzyjazna() + " [" + urzadzenie.getIdUrzadzenia() + "]:");
            System.out.println("  Status: " + urzadzenie.getStatusUrzadzenia());
            System.out.println("  Szczegoly: " + urzadzenie.pobierzSzczegolowyOpis());
            System.out.println("---");
        }
    }

    public void wlaczWszystkiePrzelaczalne() {
        System.out.println("\nWlaczanie wszystkich urzadzen przelaczalnych w domu '" + nazwaDomu + "'...");
        for (Urzadzenie urzadzenie : urzadzenia) {
            // Sprawdzamy, czy urzadzenie implementuje interfejs IPrzelaczalne
            if (urzadzenie instanceof IPrzelaczalne) {
                IPrzelaczalne przelaczalneUrzadzenie = (IPrzelaczalne) urzadzenie;
                przelaczalneUrzadzenie.wlacz();
            }
        }
        System.out.println("Zakonczono probę wlaczenia urzadzen przelaczalnych.");
    }

    public Urzadzenie znajdzUrzadzeniePoId(String id) {
        for (Urzadzenie urzadzenie : urzadzenia) {
            if (urzadzenie.getIdUrzadzenia().equals(id)) {
                return urzadzenie;
            }
        }
        return null;
    }

    public <T extends Urzadzenie> List<T> znajdzUrzadzeniaTypu(Class<T> type) {
        List<T> listaTypu = new ArrayList<>();
        for (Urzadzenie urzadzenie : urzadzenia) {
            if (type.isInstance(urzadzenie)) {
                listaTypu.add(type.cast(urzadzenie));
            }
        }
        return listaTypu;
    }
}