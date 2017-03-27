package com.stem.iets;


import java.util.ArrayList;
import java.util.List;

public class Stem {


    public Stem() {

    }



    static List<Integer> userInputArray = new ArrayList<>();
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
     *
     * @param agreementScore De score die uit getAgreementLevel komt rollen wordt hier ingevoerd
     * @return Deel de behaalde score door de lengte van de @userInputArray en vermenigvuldig met 100 voor het percentage
     */
    static double getAgreementLevelPercentage(int agreementScore){
        double agreement = (double) agreementScore;
        return ((agreement / userInputArray.size()) * 100);

    }


}
