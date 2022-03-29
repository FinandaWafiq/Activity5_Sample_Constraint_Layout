package com.example.sampleconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class LihatData extends AppCompatActivity {

    TextView tvnama, tvnomor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);

        tvnama = findViewById(R.id.tvnama);
        tvnomor = findViewById(R.id.tvnomor);

        Bundle bundle = getIntent().getExtras();

        String nama = bundle.getString("a");

        switch (nama)
        {
            case "Finanda":
                tvnama.setText("Finanda W");
                tvnomor.setText("0895638898891");
                break;
            case "Dhiasti":
                tvnama.setText("Dhiasti P");
                tvnomor.setText("082230624668");
                break;
            case "Reza":
                tvnama.setText("Reza R");
                tvnomor.setText("081274283750");
                break;
            case "Atta":
                tvnama.setText("Atta F");
                tvnomor.setText("081366352757");
                break;
            case "Ari":
                tvnama.setText("Ari P");
                tvnomor.setText("082353356678");
                break;
            case "Askar":
                tvnama.setText("Askar K");
                tvnomor.setText("081123356771");
                break;
            case "Rani":
                tvnama.setText("Rani A");
                tvnomor.setText("085383445491");
                break;
            case "Firman":
                tvnama.setText("Firman C");
                tvnomor.setText("089972278190");
                break;
            case "Alif":
                tvnama.setText("Alif G");
                tvnomor.setText("081235578221");
                break;
            case "Amel":
                tvnama.setText("Amel F");
                tvnomor.setText("089583387256");
                break;
            default:
        }
    }
}