package lv.javaguru.lesson9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayWithArrayList {

    public static void main(String[] args) {

        List<String> cryptoCurrencies = new ArrayList<>();
        cryptoCurrencies.add("LightCoin");
        cryptoCurrencies.add("Wase");
        cryptoCurrencies.add("BitCoin");
        cryptoCurrencies.add("Etherium");

        System.out.println("Size: " + cryptoCurrencies.size());
        System.out.println("Contains Wase: " + cryptoCurrencies.contains("Wase"));
        System.out.println("Contains 15: " + cryptoCurrencies.contains(15));
        System.out.println(cryptoCurrencies);

        Collections.sort(cryptoCurrencies);
        System.out.println(cryptoCurrencies);

        Collections.reverse(cryptoCurrencies);
        System.out.println(cryptoCurrencies);

        cryptoCurrencies.add("Wase");
        System.out.println(cryptoCurrencies);

        cryptoCurrencies.remove("Wase");
        System.out.println(cryptoCurrencies);

        cryptoCurrencies.remove(1);
        System.out.println(cryptoCurrencies);



    }

}
