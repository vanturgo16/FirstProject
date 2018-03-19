package id.co.tutta.firstproject;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HalamanUtamaActivity extends AppCompatActivity {


    //TODO 1 Variable Global
    //private Button btnPindahSatu;
    //private Button btnPindahDua;
    //private Button btnPindahTiga;

    private Button btnPindahSatu, btnPindahDua, btnPindahTiga;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_utama);

        //TODO Casting/Inisialisai/Gunakan */
        btnPindahSatu = findViewById(R.id.btn_pindah1);
        btnPindahDua = findViewById(R.id.btn_pindah2);
        btnPindahTiga = findViewById(R.id.btn_pindah3);


        //TODO 3 Tombol Melakukan Aksi / Event Click
        btnPindahSatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahSatu = new Intent(HalamanUtamaActivity.this, PindahSatu.class);
                startActivity(pindahSatu);
            }
        });
        //TODO 4 Tombol Menekan Tombol 2
        btnPindahDua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahDua = new Intent(HalamanUtamaActivity.this, PindahDua.class);
                startActivity(pindahDua);
            }
        });

        btnPindahTiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahTiga = new Intent(HalamanUtamaActivity.this, PindahTiga.class);
                startActivity(pindahTiga);
            }
        });











    }
}
