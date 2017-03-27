package com.stem.iets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FirstQuestion extends AppCompatActivity {

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
        thesis = (TextView) findViewById(R.id.thesis);
    }

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
