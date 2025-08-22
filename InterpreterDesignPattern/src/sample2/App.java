package sample2;

public class App {

    public static void main(String args[]){

        var sentence = "hello world";
        var sentenceShouldEndWithPeriod = new SentenceShouldEndWithPeriod();
        var result = sentenceShouldEndWithPeriod.interpret(sentence);
        System.out.println(result); // Output: Hello world.

    }
}
