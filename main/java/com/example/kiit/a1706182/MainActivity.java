package com.example.kiit.a1706182;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button,button1;
    EditText et1,et2;
    TextView tx1;
    int counter = 5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        button1=findViewById(R.id.button2);
        et1=findViewById(R.id.editText);
        et2=findViewById(R.id.editText2);
        tx1 = (TextView)findViewById(R.id.textView);
        tx1.setVisibility(View.GONE);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et1.getText().toString().equals("TUSHAR") &&
                        et2.getText().toString().equals("E-LABS")) {
                    Toast.makeText(getApplicationContext(),
                            "Redirecting...",Toast.LENGTH_SHORT).show();
                     Intent in=new Intent(MainActivity.this,Main2Activity.class);
                     startActivity(in);
                }else{
                    Toast.makeText(getApplicationContext(), "Wrong Credintial",Toast.LENGTH_SHORT).show();

                            tx1.setVisibility(View.VISIBLE);
                    tx1.setBackgroundColor(Color.RED);
                    counter--;
                    tx1.setText(Integer.toString(counter));

                    if (counter == 0) {
                        button.setEnabled(false);
                    }
                }
            }
        });
              button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    System.exit(0);
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
                Toast.makeText(MainActivity.this, "ABOUT", Toast.LENGTH_SHORT).show();
                Intent intt=new Intent(MainActivity.this,Main5Activity.class);
                startActivity(intt);
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}
