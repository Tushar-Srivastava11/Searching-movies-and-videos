package com.example.kiit.a1706182;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    ListView lv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        lv1=findViewById(R.id.lv1);
        String str[]={"VIDEOS","PLAYSTORE","GMAIL","INDEX/OF/MOVIES","INDEX/OF/SERIES","INDEX/OF/ANIME","HDPOPCORN"};
        final ArrayAdapter<String> stringArrayAdapter=new ArrayAdapter<>(
                this,android.R.layout.simple_list_item_1,str);
        lv1.setAdapter(stringArrayAdapter);
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent var6=new Intent(Main2Activity.this,Main3Activity.class);
                    startActivity(var6);
                }
                if(position==1){
                    Intent var7=new Intent(Intent.ACTION_VIEW,Uri.parse("http://play.google.com/store/apps/details?id=com.google.android.apps.maps"));
                    startActivity(var7);
                }
                if(position==2){
                    Intent var8=new Intent(Main2Activity.this,Main4Activity.class);
                    startActivity(var8);
                }
                if(position==3)
                {
                    Intent var9=new Intent(Intent.ACTION_VIEW,Uri.parse("http://9092.ultratv100.com:9090/movies/Batch219/"));
                    startActivity(var9);
                }
                if(position==4){
                    Intent var10= new Intent(Intent.ACTION_VIEW,Uri.parse("http://indexof.ir/series/"));
                    startActivity(var10);
                }
                if(position==5){
                    Intent var55= new Intent(Intent.ACTION_VIEW,Uri.parse("http://sr1.animelist1.ir/Anime/Ended/"));
                    startActivity(var55);
                }
                if(position==6){
                    Intent var56= new Intent(Intent.ACTION_VIEW,Uri.parse("http://hdpopcorns.co/"));
                    startActivity(var56);
                }
            }
        });


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.action_about:
                Toast.makeText(Main2Activity.this, "ABOUT", Toast.LENGTH_SHORT).show();
                Intent intt=new Intent(Main2Activity.this,Main5Activity.class);
                startActivity(intt);
                break;
            case R.id.logout:
                Intent itt=new Intent(Main2Activity.this,MainActivity.class);
                startActivity(itt);
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}
