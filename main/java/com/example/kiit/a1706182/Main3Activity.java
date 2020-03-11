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

public class Main3Activity extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        lv = findViewById(R.id.lv);
        String str[] = {"video1", "video2", "video3", "video4", "video5", "video6", "video7", "video8", "video9", "video10"};
        final ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, str);
        lv.setAdapter(stringArrayAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent var = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=ZTZkwKzd7l0"));
                    startActivity(var);
                }
                if (position == 1) {
                    Intent var1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=uykOHAhId0Q"));
                    startActivity(var1);
                }
                if (position == 2) {
                    Intent var2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=aBvj7W9SX4M"));
                    startActivity(var2);
                }
                if (position == 3) {
                    Intent var3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=6hs0HUN83EU"));
                    startActivity(var3);
                }
                if (position == 4) {
                    Intent var4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=1iinjrFu2T0"));
                    startActivity(var4);
                }
                if (position == 5) {
                    Intent var5 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=nfs8NYg7yQM"));
                    startActivity(var5);
                }
                if (position == 6) {
                    Intent vari = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=oRZ0cfZ9SeU"));
                    startActivity(vari);
                }
                if (position == 7) {
                    Intent vart = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=0-xwTI8MKO8&t=0s&list=PLVMyq9xH2Q_eo0Ut56nB0P7KCW_L8o_D3&index=2"));
                    startActivity(vart);
                }
                if (position == 8) {
                    Intent varty = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=mbGNF4QXaEE&t=0s&list=PLVMyq9xH2Q_eo0Ut56nB0P7KCW_L8o_D3&index=3"));
                    startActivity(varty);
                }
                if (position == 9) {
                    Intent vartu = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=NjRRDE7gK4E"));
                    startActivity(vartu);
                }
                if (position == 10) {
                    Intent vartr = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=5nyFfZnsyNY"));
                    startActivity(vartr);
                }
                if (position == 11) {
                    Intent varte = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=8uJ-wOljP_s"));
                    startActivity(varte);
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
                    Toast.makeText(Main3Activity.this, "ABOUT", Toast.LENGTH_SHORT).show();
                    Intent intt=new Intent(Main3Activity.this,Main5Activity.class);
                    startActivity(intt);
                    break;
                case R.id.logout:
                    Intent itt=new Intent(Main3Activity.this,MainActivity.class);
                    break;
            }
            return super.onOptionsItemSelected(item);
        }

    }
