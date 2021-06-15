package com.example.customlistview;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView lv1;

    int[] image = {R.drawable.netflix, R.drawable.amazonprime, R.drawable.disneyplus, R.drawable.sonyliv, R.drawable.hbomax};
    String []name = {"Netflix ", "Amazon Prime ", "Disney plus ", "Sony Liv ", "Hbo Max "};

    //Images and other things

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv1=findViewById(R.id.lv1);
        MyAdapter myAdapter=new MyAdapter(MainActivity.this, image, name);
        lv1.setAdapter(myAdapter);






    }



}
