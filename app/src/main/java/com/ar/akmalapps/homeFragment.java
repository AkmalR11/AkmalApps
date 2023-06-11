package com.ar.akmalapps;
/* Tanggal Pengerjaan   : 03-06-2023
    NIM                 : 10119230
    Nama                : Akmal Rizqulloh
    Kelas               : IF6
*/
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ar.akmalapps.R;

public class homeFragment extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }
}
