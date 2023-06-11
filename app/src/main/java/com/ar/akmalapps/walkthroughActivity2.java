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

public class walkthroughActivity2 extends AppCompatActivity{

    private Button lanjut2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walkthrough2);

        lanjut2=findViewById(R.id.buttonLanjut2);
        lanjut2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(walkthroughActivity2.this, walkthroughActivity3.class);
                startActivity(intent);
            }
        });
    }
}
