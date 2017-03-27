package com.stem.iets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //When start_button is pressed go to @FirstQuestion.class

        Button button = (Button) findViewById(R.id.start_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, FirstQuestion.class);
                startActivity(i);
            }
        });

        //Finds a TextView and edits that to contain a HTML 'a' tag
        //This 'a' tag makes the text link to kieskompas.nl

        TextView textView =(TextView)findViewById(R.id.kieskompas_link);
        textView.setClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='https://www.kieskompas.nl'> Klik hier om naar hun website te gaan! </a>";
        textView.setText(Html.fromHtml(text));

    }
}
