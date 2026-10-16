public class Main {

    public static void main (String[] args){
        // Demonstrate class initialization through static member access
        WindInstrument.showMessage();

        PercussionInstrument percussionInstrument = new PercussionInstrument("Conga", 66.70);
        StringInstrument stringInstrument = new StringInstrument("Violí", 400.00);
        WindInstrument windInstrument = new WindInstrument("Saxofon", 500.00);

        percussionInstrument.play();
        stringInstrument.play();
        windInstrument.play();
    }
}
