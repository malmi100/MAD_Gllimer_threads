package com.example.mad_gllimer_threads;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    Button startbtn;








    public void onClick(View view) {
        Intent intent = new Intent(this,DeliveryInfo.class);


        startActivity(intent);

    }
}



