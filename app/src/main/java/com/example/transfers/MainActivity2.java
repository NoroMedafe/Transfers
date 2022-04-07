package com.example.transfers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    EditText editText_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editText_2 = findViewById(R.id.editTextActivity_2);


        Intent intentFromActivity1 = getIntent();

        String strActivity = intentFromActivity1.getStringExtra("transmittedString");
        editText_2.setText(strActivity);

    }

    public void OnOk_Click(View v)
    {
        Intent intent = new Intent();

        String s = editText_2.getText().toString();

        intent.putExtra("stringTo", s);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void OnCancel_Click(View v)
    {
        setResult(RESULT_CANCELED);
        finish();
    }
}