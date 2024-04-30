package com.example.unitconvertorapplication;
// Code written by Saurabh Patel
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.unitconvertorapplication.R;

public class MainActivity extends AppCompatActivity {

    private EditText editTextValue;
    private Spinner spinnerFromUnit, spinnerToUnit;
    private Button buttonConvert;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextValue = findViewById(R.id.editTextValue);
        spinnerFromUnit = findViewById(R.id.spinnerFromUnit);
        spinnerToUnit = findViewById(R.id.spinnerToUnit);
        buttonConvert = findViewById(R.id.buttonConvert);
        textViewResult = findViewById(R.id.textViewResult);

        // Define the units for conversion
        // Code written by Saurabh Patel
        String[] units = {"Centimeters", "Meters", "Kilometers", "Inches", "Feet", "Yards"};

        // Create ArrayAdapter for spinners
        // Code written by Saurabh Patel
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, units);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerFromUnit.setAdapter(adapter);
        spinnerToUnit.setAdapter(adapter);

        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertUnits();
            }
        });
    }

    private void convertUnits() {
        try {
            double inputValue = Double.parseDouble(editTextValue.getText().toString());
            double result;
            String fromUnit = spinnerFromUnit.getSelectedItem().toString();
            String toUnit = spinnerToUnit.getSelectedItem().toString();

            // Perform conversion
            // Code written by Saurabh Patel
            if (fromUnit.equals(toUnit)) {
                result = inputValue; // No conversion needed // Code written by Saurabh Patel
            } else if (fromUnit.equals("Centimeters") && toUnit.equals("Meters")) {
                result = inputValue / 100;
            } else if (fromUnit.equals("Centimeters") && toUnit.equals("Kilometers")) {
                result = inputValue / 100000;
            } else if (fromUnit.equals("Meters") && toUnit.equals("Centimeters")) {
                result = inputValue * 100;
            } else if (fromUnit.equals("Meters") && toUnit.equals("Kilometers")) {
                result = inputValue / 1000;
            } else if (fromUnit.equals("Kilometers") && toUnit.equals("Centimeters")) {
                result = inputValue * 100000;
            } else if (fromUnit.equals("Kilometers") && toUnit.equals("Meters")) {
                result = inputValue * 1000;
            } else if (fromUnit.equals("Inches") && toUnit.equals("Feet")) {
                result = inputValue / 12;
            } else if (fromUnit.equals("Inches") && toUnit.equals("Yards")) {
                result = inputValue / 36;
            } else if (fromUnit.equals("Feet") && toUnit.equals("Inches")) {
                result = inputValue * 12;
            } else if (fromUnit.equals("Feet") && toUnit.equals("Yards")) {
                result = inputValue / 3;
            } else if (fromUnit.equals("Yards") && toUnit.equals("Inches")) {
                result = inputValue * 36;
            } else if (fromUnit.equals("Yards") && toUnit.equals("Feet")) {
                result = inputValue * 3;
            } else {
                throw new UnsupportedOperationException("Conversion not supported");
            }
            // Code written by Saurabh Patel
            textViewResult.setText(String.format("%.2f %s = %.2f %s", inputValue, fromUnit, result, toUnit));
        } catch (NumberFormatException e) {
            textViewResult.setText("Invalid input");
        } catch (UnsupportedOperationException e) {
            textViewResult.setText("Conversion not supported");
        }
    }
}
