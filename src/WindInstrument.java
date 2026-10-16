public class WindInstrument extends Instrument{

    // Instance initialization block
    {
        System.out.println("S'ha creat la classe de vent");
    }

    // Static initialization block
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

    // Static method to demonstrate that accessing it can initialize the class
    public static void showMessage(){
        System.out.println("Aquest és un missatge des d'un mètode estàtic");
    }
}
