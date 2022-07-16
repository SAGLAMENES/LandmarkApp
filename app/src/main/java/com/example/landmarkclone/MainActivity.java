package com.example.landmarkclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.landmarkclone.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<LandMark> landMarkArrayList;
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        landMarkArrayList = new ArrayList<>();
        LandMark keops= new LandMark("Keops Pyramid","Egypt", R.drawable.kops);
        LandMark pisa= new LandMark("Pisa","Italy", R.drawable.peza);
        LandMark hasankeyf= new LandMark("Hasankeyf","Turkey", R.drawable.hasankeyf);
        LandMark kizkulesi= new LandMark("Maiden's Tower", "Turkey",R.drawable.kizlesi);
        LandMark ozgurlukHeykeli= new LandMark("Statue Of Liberty","Usa",R.drawable.oz);
        landMarkArrayList.add(keops);
        landMarkArrayList.add(pisa);
        landMarkArrayList.add(hasankeyf);
        landMarkArrayList.add(kizkulesi);
        landMarkArrayList.add(ozgurlukHeykeli);
        binding.recylerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdapter landmarkAdapter=new LandmarkAdapter(landMarkArrayList);
        binding.recylerView.setAdapter(landmarkAdapter);

        /*ArrayAdapter arrayAdapter =new ArrayAdapter(this, android.R.layout.simple_list_item_1,landsArrayList.stream().map(lands -> lands.name).collect(Collectors.toList()));
        binding.listView.setAdapter(arrayAdapter);
        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this,Details.class);
                intent.putExtra("Lands",landsArrayList.get(i));
                startActivity(intent);
            }
        });

         */


    }
}