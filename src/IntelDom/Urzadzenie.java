package IntelDom;

public abstract class Urzadzenie {
    private String idUrzadzenia;
    private String NazwaPrzyjazna;
    private String StatusUrzadzenia;

    public Urzadzenie(String idUrzadzenia, String NazwaPrzyjazna, String StatusUrzadzenia) {
        this.idUrzadzenia = idUrzadzenia;
        this.NazwaPrzyjazna = NazwaPrzyjazna;
        this.StatusUrzadzenia = StatusUrzadzenia;
    }

    public Urzadzenie(String idUrzadzenia, String nazwaPrzyjazna) {
    }

    public String getIdUrzadzenia() {
        return idUrzadzenia;
    }

    public String getNazwaPrzyjazna() {
        return NazwaPrzyjazna;
    }

    public String getStatusUrzadzenia() {
        return StatusUrzadzenia;
    }

    protected void setStatusUrzadzenia(String status) {
        this.StatusUrzadzenia = status;
    }

    public abstract String pobierzSzczegolowyOpis();

    @Override
    public String toString() {
        return "Urzadzenie{" +
                "idUrzadzenia='" + idUrzadzenia + '\'' +
                ", NazwaPrzyjazna='" + NazwaPrzyjazna + '\'' +
                ", StatusUrzadzenia=" + StatusUrzadzenia +
                '}';
    }

}
