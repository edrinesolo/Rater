package com.example.solo.solomone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class second extends AppCompatActivity {
   Button btn2;
   TextView ed1,ed2,ed4;
   String nam1,clas1,rat1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btn2 = (Button) findViewById(R.id.button2);
        ed1 = (TextView) findViewById(R.id.textView8);
        ed2 = (TextView) findViewById(R.id.textView7);
        ed4 = (TextView) findViewById(R.id.textView4);

        nam1 = getIntent().getExtras().getString("value");
        ed1.setText(nam1);

        clas1 = getIntent().getExtras().getString("value2");
        ed2.setText(clas1);
    }

    public void btn2click(View view){
        Intent s=new Intent(this,FirstActivity.class);
        startActivity(s);
        finish();
    }
}
