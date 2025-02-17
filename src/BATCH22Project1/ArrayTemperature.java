package BATCH22Project1;

import javax.sound.midi.Soundbank;

public class ArrayTemperature {
    public static void main(String[] args) {
        int[] temperatures= {20, 18, 12, 25, 19, 13, 24};

        int highestTemperature=temperatures[0];
        int lowestTemperature=temperatures[0];

        for (int i=1; i<temperatures.length; i++){
            if (temperatures[i]>highestTemperature){
                highestTemperature =temperatures[i];

            }
            if (temperatures[i]<lowestTemperature){
                lowestTemperature=temperatures[i];

        }


        }
        System.out.println("Heighest temperature: " + highestTemperature);
        System.out.println("Lowest Temperature: " + lowestTemperature);


    }
}

