public class PercussionInstrument extends Instrument {

    static {
        System.out.println("S'ha carregat la classe percussió");
    }

    public PercussionInstrument (String name, double price){
        super(name, price);
    }
    @Override
    public void play(){
        System.out.println("Està sonant un instrument de percussió");
    }
}
