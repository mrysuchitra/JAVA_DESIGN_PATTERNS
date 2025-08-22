package sample1;

public class NoWhiteSpaces implements Expression {

    @Override
    public String interpret(String context) {
        return context.replaceAll("\\s+", "");
    }

}
