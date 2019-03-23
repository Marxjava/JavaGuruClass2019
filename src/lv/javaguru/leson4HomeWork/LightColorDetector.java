package lv.javaguru.leson4HomeWork;

public class LightColorDetector {

    public String detect (int waveLength){
        if ((waveLength >= 380) && (waveLength < 450)) { return "Violēta krāsa";}
        if ((waveLength >= 450) && (waveLength < 495)) { return "Zilā krāsa";}
        if ((waveLength >= 495) && (waveLength < 570)) { return "Zaļā krāsa";}
        if ((waveLength >= 570) && (waveLength < 590)) { return "Dzeltenā krāsa";}
        if ((waveLength >= 590) && (waveLength < 620)) { return "Oranžā krāsa";}
        if ((waveLength >= 620) && (waveLength < 750)) { return "Sarkanā krāsa";}
        else {return "Gaisma nav redazma";}
    }
}
