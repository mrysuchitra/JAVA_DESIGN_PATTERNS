package sample1;

public class FirstLetterShouldNotBeUnderscore implements Expression {

    private final FirstLetterShouldBeLowerCase firstLetterShouldBeLowerCase =
            new FirstLetterShouldBeLowerCase();

    @Override
    public String interpret(String context) {
        if(context.charAt(0) == '_') {
            context = context.substring(1);
        }
        return firstLetterShouldBeLowerCase.interpret(context);
    }
}
