package com.ar.akmalapps;
/* Tanggal Pengerjaan   : 10-06-2023
    NIM                 : 10119230
    Nama                : Akmal Rizqulloh
    Kelas               : IF6
*/
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import android.view.MenuItem;
import com.ar.akmalapps.R;
public class homeActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    homeFragment homeFragment = new homeFragment();
    dailyFragment activityFragment = new dailyFragment();
    galleryFragment galleryFragment = new galleryFragment();
    musicFragment musicFragment = new musicFragment();
    profileFragment profileFragment = new profileFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        bottomNavigationView = findViewById(R.id.bottom_nav);

        getSupportFragmentManager().beginTransaction().replace(R.id.container,homeFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {

                if (item.getItemId() == R.id.home) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, homeFragment).commit();
                    return true;
                } else if (item.getItemId() == R.id.activity) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, activityFragment).commit();
                    return true;
                } else if (item.getItemId() == R.id.gallery) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, galleryFragment).commit();
                    return true;
                } else if (item.getItemId() == R.id.music) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, musicFragment).commit();
                    return true;
                } else if (item.getItemId() == R.id.profile) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, profileFragment).commit();
                    return true;
                }
                return false;
                }

        });
    }
}