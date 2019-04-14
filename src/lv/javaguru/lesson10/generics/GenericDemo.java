package lv.javaguru.lesson10.generics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GenericDemo {

    public static void main(String[] args) {

        List currencies = new ArrayList();
        currencies.add("EUR");
        currencies.add("USD");
        currencies.add("JPY");
        currencies.add(new IOException("Exception object"));
        currencies.add(Integer.valueOf(1));
        currencies.add(new char[]{'q', '2'});

        for (int i=0; i<currencies.size(); i++) {
            System.out.println(currencies.get(i));
        }

        List<String> currenciez = new ArrayList<>();
        currenciez.add("EUR");
        currenciez.add("USD");
        currenciez.add("JPY");

    }

}
