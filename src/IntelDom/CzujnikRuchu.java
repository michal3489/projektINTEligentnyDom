package IntelDom;

public class CzujnikRuchu extends Urzadzenie {
    private boolean czyWykrytoRuch;

    public CzujnikRuchu(String idUrzadzenia, String nazwaPrzyjazna) {
        super(idUrzadzenia, nazwaPrzyjazna);
        this.czyWykrytoRuch = false;
        setStatus(StatusUrzadzenia.AKTYWNY);
    }

    private void setStatus(IntelDom.StatusUrzadzenia statusUrzadzenia) {
    }


    @Override
    public String pobierzSzczegolowyOpis() {
        return "Czujnik Ruchu: Wykryto ruch? " + (czyWykrytoRuch ? "TAK" : "NIE");
    }


    public void symulujWykrycieRuchu() {
        if (!this.czyWykrytoRuch) {
            System.out.println("Czujnik Ruchu '" + getNazwaPrzyjazna() + "': WYKRYTO RUCH!");
            this.czyWykrytoRuch = true;

        }
    }


    public void symulujUstanieRuchu() {
        if (this.czyWykrytoRuch) {
            System.out.println("Czujnik Ruchu '" + getNazwaPrzyjazna() + "': Ruch ustał.");
            this.czyWykrytoRuch = false;
        }
    }


    public boolean isCzyWykrytoRuch() {
        return czyWykrytoRuch;
    }
}

