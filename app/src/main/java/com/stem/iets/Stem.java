package com.stem.iets;


import java.util.ArrayList;
import java.util.List;

class Stem {

    //A new list that will append all input from the user to an arraylist
    static List<Integer> userInputArray = new ArrayList<>();

    //The array's of the opinions of all of the party's
    static int[] vijftigPlus = {1, 0, 1, -1, -1, 1, 0, 1, -1, 0, -1, -1, 0, 1, -1, 0};
    static int[] cda = {-1, 1, 1, -1, 0, -1, -1, 0, -1, -1, -1, -1, 0, 1, -1, 0};
    static int[] christenUnie = {-1, 1, 1, -1, -1, 1, -1, 1, -1, -1, -1, 0, 1, 1, -1, -1};
    static int[] dZesEnZestig = {-1, 1, 1, -1, -1, 1, 1, 1, -1, -1, -1, -1, 1, 1, -1, 1};
    static int[] denk = {1, 1, 1, -1, -1, 1, -1, 1, 0, -1, -1, -1, 1, 1, 0, 1};
    static int[] groenLinks = {1, 1, 1, -1, -1, 1, 0, 1, -1, 0, 1, -1, 1, 1, 0, 0};
    static int[] pvdA = {-1, 1, 1, -1, -1, 1, 1, 1, -1, -1, 1, -1, 1, 1, 0, 1};
    static int[] pvdD = {1, 1, 1, -1, -1, 1, 1, 1, -1, -1, -1, 1, 1, 1, 1, 1};
    static int[] pvv = {-1, -1, -1, 1, 1, -1, -1, -1, -1, -1, -1, -1, 1, 1, -1, -1};
    static int[] sgp = {-1, 1, 1, -1, 0, 0, -1, 0, -1, -1, -1, -1, 1, 1, 0, -1};
    static int[] sp = {-1, 1, 1, -1, -1, 1, 1, 1, -1, 1, 0, -1, 1, 1, -1, 0};
    static int[] voorNederland = {-1, -1, -1, 1, 0, -1, -1, 0, -1, -1, -1, -1, 1, 0, 0, -1};
    static int[] vvd = {-1, 1, 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, 1, 0, -1};

    /**
     * This method compares two array's and checks how many are equal to each other
     * @param partyArray Takes in one of the above partyarray's
     * @param inputArray Takes in the userinputarray
     * @return The amount of numbers in the array's that are equal to each other
     */
    static int getAgreementScore(int[] partyArray, Integer[] inputArray){
        int agreementScore = 0;
        if (partyArray.length != inputArray.length) {
            return agreementScore;
        }

        for (int i = 0;i < partyArray.length;i++)
        {
            if (partyArray[i] == inputArray[i])
            {
                agreementScore++;
            }
        }
        return agreementScore;
    }

    /**
     * This method calculates the percentage of opinions that are the same according to the getAgreementScore method
     * @param agreementScore The number that the getAgreementScore method returns should be entered
     * @return The percentage of opinions that are the same according to the getAgreementScore method
     */
    static double getAgreementLevelPercentage(int agreementScore){
        double agreement = (double) agreementScore;
        return ((agreement / userInputArray.size()) * 100);

    }


}
