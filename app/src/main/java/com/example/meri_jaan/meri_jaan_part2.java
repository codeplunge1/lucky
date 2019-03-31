package com.example.meri_jaan;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class meri_jaan_part2 extends AppCompatActivity {
   private Button b1;
   private EditText e11;
   private EditText e22;
   private TextView t;
   @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_meri_jaan_part2);
       Toolbar toolbar = findViewById(R.id.toolbar);
       setSupportActionBar(toolbar);

       FloatingActionButton fab = findViewById(R.id.fab);
       fab.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                       .setAction("Action", null).show();
           }
       });
        e11= (EditText) findViewById(R.id.e1);
        e22 = (EditText) findViewById(R.id.e2);
       TextView t = (TextView) findViewById(R.id.log);
       t.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               check(e11.getText().toString(),e22.getText().toString());
           }
       });
   }
       private void check (String u,String p)
     {
           if (u.equals("Tanishka") && p.equals("1234"))
           {
                       Intent intent = new Intent(meri_jaan_part2.this, meri_jaan3.class);
                       startActivity(intent);
                   }}
               };









