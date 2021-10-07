package com.example.pertemuan1_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Segitiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        final EditText alas = (EditText)findViewById(R.id.input_alas);
        final EditText tinggi = (EditText)findViewById(R.id.input_tinggi);
        final Button tampil = (Button)findViewById((R.id.button3));
        final EditText hasil = (EditText)findViewById((R.id.input_luas));

        tampil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //Cek apakah kosong/tidak
                if(alas.length()==0 && tinggi.length()==0){
                    Toast.makeText(getApplicationContext(),"Alas atau Tinggi tidak boleh Kosong!", Toast.LENGTH_LONG).show();
                }
                else{
/*                    String isialas = a.getText().toString();
                    String isitinggi = t.getText().toString();*/
                    double a = Double.parseDouble(alas.getText().toString());
                    double t = Double.parseDouble(tinggi.getText().toString());
                    double hsl = HitungLuas(a, t);
                    String output = String.valueOf(hsl);
                    hasil.setText(output.toString());
                }
            }
        });
    }
    public double HitungLuas(double a, double t){
        return (a*t)/2;
    }
}