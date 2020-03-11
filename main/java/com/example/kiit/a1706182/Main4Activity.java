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

public class Main4Activity extends AppCompatActivity {
    ListView lv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        lv2=findViewById(R.id.lv2);
        String str[]={"CREATE ACCOUNT","LOGIN GMAIL"};
        final ArrayAdapter<String> stringArrayAdapter=new ArrayAdapter<>(
                this,android.R.layout.simple_list_item_1,str);
        lv2.setAdapter(stringArrayAdapter);
        lv2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent var11=new Intent(Intent.ACTION_VIEW,Uri.parse("https://support.google.com/mail/answer/56256?hl=en"));
                    startActivity(var11);
                }
                if(position==1){
                    Intent var12=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/gmail/"));
                    startActivity(var12);
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
                Toast.makeText(Main4Activity.this, "ABOUT", Toast.LENGTH_SHORT).show();
                Intent intt=new Intent(Main4Activity.this,Main5Activity.class);
                startActivity(intt);
                break;
            case R.id.logout:
                Intent itt=new Intent(Main4Activity.this,MainActivity.class);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}