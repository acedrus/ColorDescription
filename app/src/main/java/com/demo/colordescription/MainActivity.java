package com.demo.colordescription;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Spinner colorSpin;
    private TextView showDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        colorSpin=findViewById(R.id.spinnerColor);
        showDescription=findViewById(R.id.textViewShowDescription);
    }

    public void showDescription(View view) {
        showDescription.setText(description(colorSpin.getSelectedItemPosition()));
    }

    private String description (int position) {
        String[] descriptionAge = getResources().getStringArray(R.array.age_description);
        return descriptionAge[position];
    }
}