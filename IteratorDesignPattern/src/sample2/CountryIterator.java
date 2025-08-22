package sample2;

import java.util.Iterator;

public class CountryIterator implements Iterator<Country> {

    private final CountryCollection countryCollection;
    private int index;

    public CountryIterator(CountryCollection countryCollection) {
        this.countryCollection = countryCollection;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < countryCollection.getCountries().length;
    }

    @Override
    public Country next() {
        var countries = countryCollection.getCountries();
        if(hasNext()){
            return countries[index++];
        }else {
            return null;
        }
    }
}
