package lv.javaguru.leson4HomeWork;

public class DogAgeCalculator {

    public int convertHumanAgeToDogAge (int humanAge) {
        if (humanAge < 15) {return 0;}
        if ((humanAge >=15) && (humanAge <24)) {return 1;}
        if ((humanAge >=24) && (humanAge <28)) {return 2;}
        else {return ((humanAge-24)/4 + 2);}
    }

    public int convertDogAgeToHumanAge (int dogAge) {
        if (dogAge == 1) {return 15;}
        if (dogAge == 2) {return (15 + 9);}
        else {return ((dogAge - 2)*4 + 15 + 9);}
    }
}
