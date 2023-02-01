package com.example.myapplications;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import soup.neumorphism.NeumorphButton;

public class a7 extends AppCompatActivity {

    CheckBox b1,b2,b3,b4,b5;
    NeumorphButton order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a7);

        b1 = findViewById(R.id.checkBox1);
        b2 = findViewById(R.id.checkBox2);
        b3 = findViewById(R.id.checkBox3);
        b4 = findViewById(R.id.checkBox4);
        b5 = findViewById(R.id.checkbox5);
        order = findViewById(R.id.order);

        Intent intent = getIntent();
        String received = intent.getStringExtra("t");


        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int totalAmount = 0;
                StringBuilder result = new StringBuilder();
                result.append("Table No."+received);
                result.append("\nSelected Item");

                if(b1.isChecked()) {
                    result.append("\nNormal Salad");
                    totalAmount += 50;
                }
                if(b2.isChecked()) {
                    result.append("\nCaesar Salad");
                    totalAmount += 60;
                }
                if(b3.isChecked()) {
                    result.append("\nGreek Salad");
                    totalAmount += 65;
                }
                if(b4.isChecked()) {
                    result.append("\nFattoush");
                    totalAmount += 60;
                }
                if(b5.isChecked()) {
                    result.append("\nMesclun");
                    totalAmount += 70;
                }

                Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_SHORT).show();

                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT,result.toString());
                intent.setType("text/plain");

                if (intent.resolveActivity(getPackageManager()) != null)
                {
                    startActivity(intent);
                }

            }
        });

    }
}