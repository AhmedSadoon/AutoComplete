package com.example.autocomplete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView;
    String[] fruits;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        autoCompleteTextView=findViewById(R.id.fruit);
        fruits=getResources().getStringArray(R.array.fruits);
        //ArrayAdapter<String> adapter=new ArrayAdapter<String>(this.android.R.layout.simple_list_item_1.fruits);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(R.layout.support_simple_spinner_dropdown_item);
        autoCompleteTextView.setAdapter(adapter);
    }
}
