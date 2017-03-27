package com.stem.iets;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LastScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last_screen);

        Integer[] finalArray = new Integer[Stem.userInputArray.size()];
        Stem.userInputArray.toArray(finalArray);

        int vijftigPlusScore = Stem.getAgreementScore(Stem.vijftigPlus, finalArray);
        int cdaScore = Stem.getAgreementScore(Stem.cda, finalArray);
        int christenUnieScore = Stem.getAgreementScore(Stem.christenUnie, finalArray);
        int dZesEnZestigScore = Stem.getAgreementScore(Stem.dZesEnZestig, finalArray);
        int denkScore = Stem.getAgreementScore(Stem.denk, finalArray);
        int groenLinksScore = Stem.getAgreementScore(Stem.groenLinks, finalArray);
        int pvdAScore = Stem.getAgreementScore(Stem.pvdA, finalArray);
        int pvdDScore = Stem.getAgreementScore(Stem.pvdD, finalArray);
        int pvvScore = Stem.getAgreementScore(Stem.pvv, finalArray);
        int sgpScore = Stem.getAgreementScore(Stem.sgp, finalArray);
        int spScore = Stem.getAgreementScore(Stem.sp, finalArray);
        int voorNederlandScore = Stem.getAgreementScore(Stem.voorNederland, finalArray);
        int vvdScore = Stem.getAgreementScore(Stem.vvd, finalArray);

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("50Plus", vijftigPlusScore);
        map.put("CDA", cdaScore);
        map.put("ChristenUnie", christenUnieScore);
        map.put("D66", dZesEnZestigScore);
        map.put("Denk", denkScore);
        map.put("GroenLinks", groenLinksScore);
        map.put("PvdA", pvdAScore);
        map.put("PvdD", pvdDScore);
        map.put("PVV", pvvScore);
        map.put("SGP", sgpScore);
        map.put("SP", spScore);
        map.put("VoorNederland", voorNederlandScore);
        map.put("VVD", vvdScore);

        Map<String, Integer> sortedMap = sortByValue(map);

        List<Integer> valueList = new ArrayList<Integer>(sortedMap.values());
        List<String> keyList = new ArrayList<String>(sortedMap.keySet());

        ArrayList<Double> partyScorePercentage = new ArrayList<>();
        for (int i = 0; i < sortedMap.size(); i++) {
            partyScorePercentage.add(Stem.getAgreementLevelPercentage(valueList.get(i)));
        }


        TextView textview1 = (TextView) findViewById(R.id.firstParty);
        textview1.setText("U heeft een overeenstemming van " + String.valueOf(partyScorePercentage.get(12)) + " procent met: " + keyList.get(12));
        TextView textview2 = (TextView) findViewById(R.id.secondParty);
        textview2.setText("U heeft een overeenstemming van " + String.valueOf(partyScorePercentage.get(11)) + " procent met: " + keyList.get(11));
        TextView textview3 = (TextView) findViewById(R.id.thirdParty);
        textview3.setText("U heeft een overeenstemming van " + String.valueOf(partyScorePercentage.get(10)) + " procent met: " + keyList.get(10));
        TextView textview4 = (TextView) findViewById(R.id.fourthParty);
        textview4.setText("U heeft een overeenstemming van " + String.valueOf(partyScorePercentage.get(9)) + " procent met: " + keyList.get(9));
        TextView textview5 = (TextView) findViewById(R.id.fifthParty);
        textview5.setText("U heeft een overeenstemming van " + String.valueOf(partyScorePercentage.get(8)) + " procent met: " + keyList.get(8));

        }

    private static Map<String, Integer> sortByValue(Map<String, Integer> unsortMap) {

        // 1. Convert Map to List of Map
        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(unsortMap.entrySet());

        // 2. Sort list with Collections.sort(), provide a custom Comparator
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        // 3. Loop the sorted list and put it into a new insertion order Map LinkedHashMap
        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }
}
