package ua.goit.gojavaonline.core_3.groupe_02.sidorenko.module05;

public class Array {
    public static void main(String[] args){
        int [] arrayOfints = {13, 44, 2, 54, 91, 7, 1, 155, -10 };

        int maxOfArray = arrayOfints[1];
        int minOfArray = arrayOfints[1];

        for(int i = 0; i < arrayOfints.length; i ++){
            if(arrayOfints[i] > maxOfArray){
                maxOfArray = arrayOfints[i];
            }
            if(arrayOfints[i] < minOfArray){
                minOfArray = arrayOfints[i];
            }
        }
        System.out.println("The minimum number of array is  " + minOfArray);
        System.out.println("The maximum number of array is  " + maxOfArray);
    }
}



