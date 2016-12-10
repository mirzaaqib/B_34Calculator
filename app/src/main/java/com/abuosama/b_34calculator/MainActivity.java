package com.abuosama.b_34calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText1,editText2;

    Button add,sub,multi,divi;

   // int str1,str2;
    double str1,str2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.text1);

        editText2= (EditText) findViewById(R.id.text2);

         add = (Button) findViewById(R.id.add);

         sub = (Button) findViewById(R.id.sub);

        multi = (Button) findViewById(R.id.multi);

        divi = (Button) findViewById(R.id.divi);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,Second.class);

               // String str1=editText1.getText().toString();

               // String str2=editText2.getText().toString();

                 str1=Integer.parseInt(editText1.getText().toString());
                str2=Integer.parseInt(editText2.getText().toString());
//                str1=Double.parseDouble(editText1.getText().toString());
//                str2=Double.parseDouble(editText2.getText().toString());
               //int x = 1;

                 intent.putExtra("add1",str1);
                 intent.putExtra("add2",str2);
                intent.putExtra("x",1);


                startActivity(intent);


            }
        });

           sub.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {

                   Intent intent=new Intent(MainActivity.this,Second.class);

                   //String sub1=editText1.getText().toString();
                  // String sub2=editText2.getText().toString();
                 double  sub=Double.parseDouble(editText1.getText().toString());
                  double sub1=Double.parseDouble(editText2.getText().toString());
                    //int x=2;
                   intent.putExtra("sub1",sub);
                   intent.putExtra("sub2",sub1);
                   intent.putExtra("x",2);

                   startActivity(intent);



               }
           });

          multi.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  //int x =3;

                  Intent intent=new Intent(MainActivity.this,Second.class);

                  double mult1= Double.parseDouble(editText1.getText().toString());
                  double mult2= Double.parseDouble(editText2.getText().toString());

                  intent.putExtra("multi",mult1);
                  intent.putExtra("multi1",mult2);
                  intent.putExtra("x",3);

                  startActivity(intent);

              }
          });

          divi.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {

                  Intent intent=new Intent(MainActivity.this,Second.class);

                  double dev= Double.parseDouble(editText1.getText().toString());
                  double dev2= Double.parseDouble(editText2.getText().toString());

                  intent.putExtra("dev",dev);
                  intent.putExtra("dev2",dev2);
                  intent.putExtra("x",4);

                  startActivity(intent);

              }
          });



    }
}
