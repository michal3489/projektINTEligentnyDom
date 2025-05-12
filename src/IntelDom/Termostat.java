package IntelDom;
public class Termostat extends Urzadzenie implements IRegulowalne {
    private double temperaturaDocelowa;
    private IntelDom.StatusUrzadzenia status;

    public Termostat(String idUrzadzenia, String nazwaPrzyjazna, double temperaturaPoczatkowa) {
        super(idUrzadzenia, nazwaPrzyjazna);
        this.temperaturaDocelowa = temperaturaPoczatkowa;
        setStatus(StatusUrzadzenia.DZIALA);
    }

    @Override
    public String pobierzSzczegolowyOpis() {
        return "Termostat: Temperatura docelowa = " + temperaturaDocelowa + "°C";
    }

    @Override
    public void ustawPoziom(int poziom) {
        System.out.println("Termostat '" + getNazwaPrzyjazna() + "': Ustawianie poziomu na " + poziom + " (metoda ustawPoziom)");
    }

    @Override
    public void ustawWartosc(double wartosc) {
        System.out.println("Termostat '" + getNazwaPrzyjazna() + "': Ustawianie temperatury docelowej na " + wartosc + "°C (metoda ustawWartosc)");
        this.temperaturaDocelowa = wartosc;
        setStatus(StatusUrzadzenia.DZIALA);
    }

    public double getTemperaturaDocelowa() {
        return temperaturaDocelowa;
    }

    public void setStatus(IntelDom.StatusUrzadzenia status) {
        this.status = status;
    }

    public IntelDom.StatusUrzadzenia getStatus() {
        return status;
    }

}