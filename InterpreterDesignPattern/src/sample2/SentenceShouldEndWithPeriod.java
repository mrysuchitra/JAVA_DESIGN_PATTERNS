package sample2;

public class SentenceShouldEndWithPeriod implements Expression{

    private final FirstLetterShouldBeCapital firstLetterShouldBeCapital =
            new FirstLetterShouldBeCapital();

    @Override
    public String interpret(String context) {
        if(context.charAt(context.length() - 1) != '.') {
            context += '.';
        }
        return firstLetterShouldBeCapital.interpret(context);
    }
}
