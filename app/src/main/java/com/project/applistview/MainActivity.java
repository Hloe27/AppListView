package com.project.applistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;
    private ListView lv1;


    private String nombre[] = {"Carlos", "Luis", "Diego", "Matias", "Percy", "Jhon", "Junior", "Jean", "Sayumi", "Karen"};
    private String edades[] = {"32", "15", "18", "20", "11", "13", "21", "14", "15", "24"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.txtv1);
        lv1 = findViewById(R.id.lv1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_itm_goes, nombre);
        lv1.setAdapter(adapter);
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                tv1.setText("La edad de " + lv1.getItemAtPosition(i)+ " de " + edades[i] + " años");
            }
        });
    }

}