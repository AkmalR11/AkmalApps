package com.ar.akmalapps;
/* Tanggal Pengerjaan   : 05-06-2023
    NIM                 : 10119230
    Nama                : Akmal Rizqulloh
    Kelas               : IF6
*/

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public class dailyFragment extends Fragment{

    View v;
    private RecyclerView myRecycleView;
    private List<daily> listDaily;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_daily, container, false);
        myRecycleView = (RecyclerView) v.findViewById(R.id.daily_recyclerView);
        dailyAdapter dailyAdapter = new dailyAdapter(getContext(),listDaily);
        myRecycleView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myRecycleView.setAdapter(dailyAdapter);

        return v;

    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listDaily = new ArrayList<>();
        listDaily.add(new daily("Makan","Makan Tidak Boleh Dilewatkan", R.drawable.ic_breakfast));
        listDaily.add(new daily("Olahraga","Olahraga Agar Tubuh Tetap Sehat", R.drawable.ic_sports));
        listDaily.add(new daily("Belajar","Tetap Belajar Dan Eksplor Materi Saat Tidak Ada Tugas", R.drawable.ic_study));
        listDaily.add(new daily("Bermain Game","Bermain Game dengan Teman-teman", R.drawable.ic_gaming));
        listDaily.add(new daily("Mengerjakan Tugas","Mengerjakan Tugas", R.drawable.ic_homework));
        listDaily.add(new daily("Bersosialisasi","Berkumpul Bersama Teman Atau Keluarga", R.drawable.ic_group));
        listDaily.add(new daily("Beribadah","Beribadah Karena Itu Kewajiban Dan Berdoa Agar Mendapat Kekuatan dalam Menjalankan Kuliah", R.drawable.ic_mosque));
        listDaily.add(new daily("Istirahat", "Istirahat Yang Cukup Agar Badan Selalu Fresh", R.drawable.ic_sleep));
    }
}
