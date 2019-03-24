package lv.javaguru.tests7;

public class LookupArrayServiceTest {

    public static void main(String[] args) {

        LookupArrayService lookupArrayService = new LookupArrayService();
        int[] array= {-5, -3, 0, 2, 5, 8, 12};

        System.out.println(lookupArrayService.findMax(array));
        System.out.println(lookupArrayService.findMin(array));
        System.out.println(lookupArrayService.indexOfMax(array));
        System.out.println(lookupArrayService.indexOfMin(array));
        System.out.println(lookupArrayService.indexOf(array, 5));
    }
}
