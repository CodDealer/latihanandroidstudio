package com.example.latihanandroidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class kalkulator extends AppCompatActivity {
    EditText txtangka1;
    EditText txtangka2;
    Spinner spopertator;
    TextView tvhasil;
    Button btnhitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);
        txtangka1 = findViewById(R.id.txtangka1);
        txtangka2 = findViewById(R.id.txtanka2);
        spopertator = findViewById(R.id.spoperator);
        tvhasil = findViewById(R.id.tvhasil);
        btnhitung = findViewById(R.id.btnhitung);
        btnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = spopertator.getSelectedItem().toString();
               int angka1 = Integer.parseInt(txtangka1.getText().toString());
               int angka2 = Integer.parseInt(txtangka2.getText().toString());
               int hasil = 0;

                switch (text){
                    case "tambah":
                        hasil = angka1 + angka2;
                        tvhasil.setText(hasil+"");

                        break;
                    case "kurang":
                        hasil = angka1 - angka2;
                        tvhasil.setText(hasil+"");

                        break;
                        case "kali":
                        hasil = angka1 * angka2;
                        tvhasil.setText(hasil+"");
                        break;
                    case "bagi":
                        double angka1double = Double.parseDouble(txtangka1.getText().toString());
                        double angka2double = Double.parseDouble(txtangka2.getText().toString());
                        double hasilDouble  = angka1double/angka2double;
                        tvhasil.setText(hasil+"");
                        break;


                }


            }
        });
    }
}