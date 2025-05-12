package IntelDom;

public class Lampa extends Urzadzenie implements IPrzelaczalne {
    private int poziomJasnosci;
    private String Status;
    public Lampa(String idUrzadzenia, String nazwaPrzyjazna) {
        super(idUrzadzenia, nazwaPrzyjazna);
        this.poziomJasnosci = 0;
        setStatus(StatusUrzadzenia.WYLACZONE);
    }
    private StatusUrzadzenia pobierzStatus() {
        return StatusUrzadzenia.WYLACZONE;}

    private IntelDom.StatusUrzadzenia setStatus(StatusUrzadzenia statusUrzadzenia) {
        return StatusUrzadzenia.WYLACZONE;
    }

    @Override
    public String pobierzSzczegolowyOpis() {
        return "Lampa: Poziom jasnosci = " + poziomJasnosci + "%";
    }

    @Override
    public void wlacz() {
        if (pobierzStatus() == StatusUrzadzenia.WYLACZONE || poziomJasnosci == 0) {
            System.out.println("Lampa '" + getNazwaPrzyjazna() + "': Wlaczanie...");
            this.poziomJasnosci = 100;
            setStatus(StatusUrzadzenia.WLACZONE);
        } else {
            System.out.println("Lampa '" + getNazwaPrzyjazna() + "': Już wlaczona.");
        }
    }

    @Override
        public void wylacz() {
            if (pobierzStatus() == StatusUrzadzenia.WLACZONE || poziomJasnosci > 0) {
                System.out.println("Lampa '" + getNazwaPrzyjazna() + "': Wylaczanie...");
                this.poziomJasnosci = 0;
                setStatus(StatusUrzadzenia.WYLACZONE);
            } else {
                System.out.println("Lampa '" + getNazwaPrzyjazna() + "': Już wylaczona.");
            }
        }

    public void ustawJasnosc(int procent) {
            if (procent < 0) procent = 0;
            if (procent > 100) procent = 100;
            this.poziomJasnosci = procent;
            if (procent > 0) {
                setStatus(StatusUrzadzenia.WLACZONE);
                System.out.println("Lampa '" + getNazwaPrzyjazna() + "': Ustawiono jasnosc na " + procent + "%.");
            } else {
                setStatus(StatusUrzadzenia.WYLACZONE);
                System.out.println("Lampa '" + getNazwaPrzyjazna() + "': Wylaczono (jasnosc 0%).");
            }
        }

    public int getPoziomJasnosci() {
            return poziomJasnosci;
        }
}







