package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int n;
    String message;


    public void adivinha() {
        Random rand = new Random();
        n = rand.nextInt(20)+ 1;
        String stringn=  Integer.toString(n);
        Log.d("Info", stringn);



    }
    public void Guess (View view){
        EditText editText = (EditText) findViewById(R.id.editText);
//        Log.i("Info", editText.getText().toString());
//        Toast.makeText(this, editText.getText().toString(), Toast.LENGTH_SHORT).show();
        int Guess = Integer.parseInt(editText.getText().toString());

        if(n<Guess){
            message = "Less";
            Toast.makeText(this, message , Toast.LENGTH_SHORT).show();
        }
        else if(n>Guess){
            message = "More";
            Toast.makeText(this, message , Toast.LENGTH_SHORT).show();
        }
        else{
            message = "You guessed it right.Try again";
            Toast.makeText(this, message , Toast.LENGTH_SHORT).show();
            adivinha();
        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adivinha();
    }
}