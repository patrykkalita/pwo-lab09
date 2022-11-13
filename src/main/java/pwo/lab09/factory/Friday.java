package pwo.lab09.factory;

public class Friday implements MessageFactory{
    
    @Override
    public String createIntroMessage() {
        return "Dzień dobry Piątek.";
    }

    @Override
    public String createMainMessage() {
        return "Piątkowa praca powoli się rozkręca";
    }

    @Override
    public String createClosingMessage() {
        return "Koniec piątkowej zmiany";
    }
}
