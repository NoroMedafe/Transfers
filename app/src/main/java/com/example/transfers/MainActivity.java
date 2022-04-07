package com.example.transfers;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editTextActivity_1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data)
    {
        Log.e("TEST", " Method onActivity result initializing");
        if (requestCode == 1) {
            if (data !=null) {

                String s = data.getStringExtra("stringTo");
                Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
                editText.setText(s);
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    public void onDialog_Click(View v)
    {
        String s = editText.getText().toString();

        intent = new Intent(this, MainActivity2.class);
        intent.putExtra("transmittedString",s);

        startActivityForResult(intent, 1);
    }
    public void OnExit_Click (View v)
    {
        finish();
    }
}