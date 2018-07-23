package com.odiebat.elham.metasolutions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        description = findViewById(R.id.description);
        String next = getResources().getString(R.string.desc);
        String first = "<font color='#DF9C9D'>WE </font>";
        description.setText(Html.fromHtml(first + " " + next));
    }
}
