package IntelDom;
public class Main {
    public static void main(String[] args) {

        InteligentnyDom mojDom = new InteligentnyDom("Moj Inteligentny Dom");


        Termostat termostatSalon = new Termostat("T001", "Termostat w Salonie", 21.5);
        Lampa lampaSypialnia = new Lampa("L002", "Lampa Nocna w Sypialni");
        Lampa lampaKuchnia = new Lampa("L003", "Lampa Glowna w Kuchni");
        CzujnikRuchu czujnikPrzedpokoj = new CzujnikRuchu("C004", "Czujnik Ruchu w Przedpokoju");



        System.out.println("\n--- Interakcja z urzadzeniami ---");
        termostatSalon.ustawWartosc(22.0);
        lampaSypialnia.wlacz();
        lampaSypialnia.ustawJasnosc(75);
        czujnikPrzedpokoj.symulujWykrycieRuchu();
        czujnikPrzedpokoj.symulujUstanieRuchu();
        lampaSypialnia.wylacz();

    }
}