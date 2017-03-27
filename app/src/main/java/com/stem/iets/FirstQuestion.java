package com.stem.iets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FirstQuestion extends AppCompatActivity {
    //Creates an array of the all the theses there are
    int stringList[] = {R.string.stelling1, R.string.stelling2, R.string.stelling3, R.string.stelling4,
                          R.string.stelling5, R.string.stelling6, R.string.stelling7, R.string.stelling8,
                          R.string.stelling9, R.string.stelling10, R.string.stelling11, R.string.stelling12,
                          R.string.stelling13, R.string.stelling14, R.string.stelling15, R.string.stelling16};

    int stringListCounter = 0;

    TextView thesis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_question);

        //Find's the thesis TextView
        thesis = (TextView) findViewById(R.id.thesis);
    }

    // Get's called if one of the agree buttons is pressed
    // If the stringListCounter is smaller than the total theses than it adds a 1 to the userInputArray located in @Stem.java
    // After that the text get's changed to the next thesis
    // If the stringListCounter is equal to the length of the thesis it starts the last screen
    public void agreeButton(View view) {
        if (stringListCounter < stringList.length - 1) {
            Stem.userInputArray.add(1);
            stringListCounter++;
        }
        else if (stringListCounter == stringList.length - 1){
            Stem.userInputArray.add(1);
            Intent i = new Intent(FirstQuestion.this, LastScreen.class);
            startActivity(i);

        }
        thesis.setText(stringList[stringListCounter]);

    }

    // Get's called if neutral button is pressed
    // If the stringListCounter is smaller than the total theses than it adds a 0 to the userInputArray located in @Stem.java
    // After that the text get's changed to the next thesis
    // If the stringListCounter is equal to the length of the thesis it starts the last screen
    public void neutralButton(View view) {
        if (stringListCounter < stringList.length - 1) {
            Stem.userInputArray.add(0);
            stringListCounter++;
        }
        else if (stringListCounter == stringList.length - 1){
            Stem.userInputArray.add(0);
            Intent i = new Intent(FirstQuestion.this, LastScreen.class);
            startActivity(i);

        }

        thesis.setText(stringList[stringListCounter]);

    }

    // Get's called if one of the disagree buttons is pressed
    // If the stringListCounter is smaller than the total theses than it adds a -1 to the userInputArray located in @Stem.java
    // After that the text get's changed to the next thesis
    // If the stringListCounter is equal to the length of the thesis it starts the last screen
    public void disagreeButton(View view) {
        if (stringListCounter < stringList.length - 1) {
            Stem.userInputArray.add(-1);
            stringListCounter++;
        }
        else if (stringListCounter == stringList.length - 1){
            Stem.userInputArray.add(-1);
            Intent i = new Intent(FirstQuestion.this, LastScreen.class);
            startActivity(i);

        }

        thesis.setText(stringList[stringListCounter]);

    }
}
