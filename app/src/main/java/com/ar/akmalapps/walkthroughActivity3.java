package com.ar.akmalapps;
/* Tanggal Pengerjaan   : 03-06-2023
    NIM                 : 10119230
    Nama                : Akmal Rizqulloh
    Kelas               : IF6
*/
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class walkthroughActivity3 extends AppCompatActivity{

    private Button lanjut3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walkthrough3);

        lanjut3=findViewById(R.id.buttonLanjut3);
        lanjut3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(walkthroughActivity3.this, homeActivity.class);
                startActivity(intent);
            }
        });

    }
}
