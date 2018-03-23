package com.collegedude.cabulario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addButton = findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText firstNumberEditText = findViewById(R.id.firstNumberEditText),
                         secondNumberEditText = findViewById(R.id.secondNumbereEditText);
                TextView resultTextView = findViewById(R.id.resultTextView);

                try {
                    int first = Integer.parseInt(firstNumberEditText.getText().toString());
                    int second = Integer.parseInt(secondNumberEditText.getText().toString());

                    resultTextView.setText(String.format(Locale.ROOT,"%d",first+second));

                } catch (NumberFormatException e) {
                    resultTextView.setText("0");
                }
            }
        });
    }
}
