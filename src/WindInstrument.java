public class WindInstrument extends Instrument{

    {
        System.out.println("S'ha creat la classe de vent");
    }

    static {
        System.out.println("S'ha carregat la classe vent");
    }

    public WindInstrument(String name, double price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("Està sonant un instrument de vent");
    }

    public static void showMessage(){
        System.out.println("Aquest és un missatge del mètode estatic showMessage de la classe vent");
    }
}
