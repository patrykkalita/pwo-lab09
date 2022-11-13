package pwo.lab09.factory;

public class Sunday implements MessageFactory{
    
    @Override
    public String createIntroMessage() {
        return "Dzień dobry Niedziela.";
    }

    @Override
    public String createMainMessage() {
        return "Niedzielna praca powoli się rozkręca";
    }

    @Override
    public String createClosingMessage() {
        return "Koniec niedzielnej zmiany";
    }
}
