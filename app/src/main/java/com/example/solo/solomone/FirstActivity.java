package com.example.solo.solomone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;

public class FirstActivity extends AppCompatActivity {
   Button btn1;
   EditText edt;
   EditText edt2;
   RatingBar rate;
    float rat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        btn1=(Button)findViewById(R.id.button);
        edt=(EditText)findViewById(R.id.editText);
        edt2=(EditText)findViewById(R.id.editText2);
        rate=(RatingBar)findViewById(R.id.ratingBar);
    }
    public void btnClick(View view){
        Intent s=new Intent(this,second.class);
        String nam=edt.getText().toString();
        String clas=edt2.getText().toString();
        rat=rate.getRating();
        s.putExtra("value",nam);
        s.putExtra("value2",clas);
        startActivity(s);
        finish();
    }
}
