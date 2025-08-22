package sample1;

public class FirstLetterShouldBeLowerCase implements Expression {

    private final NoWhiteSpaces noWhiteSpaces = new NoWhiteSpaces();

    @Override
    public String interpret(String context) {
        context = context.substring(0, 1).toLowerCase() + context.substring(1);
        return noWhiteSpaces.interpret(context);
    }
}
