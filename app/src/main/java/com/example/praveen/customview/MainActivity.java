package com.example.praveen.customview;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



import static android.view.View.INVISIBLE;
import static android.view.View.VISIBLE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final Button a =(Button)findViewById(R.id.button);
       final Button b = (Button)findViewById(R.id.button3);
       final Button c = (Button) findViewById(R.id.button4);
       final Button d = (Button) findViewById(R.id.button2);




      a.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {

              if(b.getVisibility()== View.INVISIBLE){

                  d.animate().translationX(-125);
                  b.setVisibility(View.VISIBLE);
                  a.setVisibility(View.INVISIBLE);

                   d.setBackgroundResource(R.drawable.rebak2);
                   d.setText("OFF");
              }
              else{

                  d.animate().translationX(-125);
                  a.setVisibility(View.INVISIBLE);
                  c.setVisibility(VISIBLE);
                  d.setBackgroundResource(R.drawable.rebak2);
                  d.setText("OFF");

              }



          }
      });


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(a.getVisibility()== View.INVISIBLE){

                    d.animate().translationX(4);
                    a.setVisibility(View.VISIBLE);
                    b.setVisibility(View.INVISIBLE);
                    d.setBackgroundResource(R.drawable.but4);
                    d.setText("");

                }

                if(c.getVisibility()== INVISIBLE )
                {

                    d.animate().translationX(-4);
                    c.setVisibility(VISIBLE);
                    b.setVisibility(INVISIBLE);
                    d.setBackgroundResource(R.drawable.but4);
                    d.setText("");


                }



            }
        });



        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(b.getVisibility()== View.INVISIBLE){

                    d.animate().translationX(125);
                    b.setVisibility(View.VISIBLE);
                    c.setVisibility(View.INVISIBLE);
                    d.setBackgroundResource(R.drawable.rebak3);
                    d.setText("ON");

                }
                else{

                    d.animate().translationX(125);
                    a.setVisibility(VISIBLE);
                    c.setVisibility(View.INVISIBLE);
                    d.setBackgroundResource(R.drawable.rebak3);
                    d.setText("ON");

                }



            }
        });









    }

}
