package sample2;

public class App {

    public static void main(String args[]) {
        var india = new Country("India");
        var poland = new Country("Poland");
        var nigeria = new Country("Nigeria");
        var canada = new Country("Canada");
        var argentina = new Country("Argentina");

        var countryCollection = new CountryCollection(india, poland, nigeria, canada, argentina);
        var iterator = countryCollection.iterator();
        while (iterator.hasNext()) {
            var country = iterator.next();
            System.out.println(country.getName());
        }
    }
}
