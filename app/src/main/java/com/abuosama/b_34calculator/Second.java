package com.abuosama.b_34calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Second extends AppCompatActivity {


    TextView textView;

    //  int x;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = (TextView) findViewById(R.id.text);

        Intent intent = getIntent();
        Bundle b = intent.getExtras();
        // int  sum=Integer.parseInt(String.valueOf(b.getInt("add1")));
        // int  sum1=Integer.parseInt(String.valueOf(b.getInt("add2")));
        //int add=sum+sum1;
         double sum = Double.parseDouble(String.valueOf(b.getDouble("add1")));
        double sum1 = Double.parseDouble(String.valueOf(b.getDouble("add2")));


        double sub = Double.parseDouble(String.valueOf(b.getDouble("sub1")));
        double sub1 = Double.parseDouble(String.valueOf(b.getDouble("sub2")));


        double multi = Double.parseDouble(String.valueOf(b.getDouble("multi")));
        double multi1 = Double.parseDouble(String.valueOf(b.getDouble("multi1")));

        double dev = Double.parseDouble(String.valueOf(b.getDouble("dev")));
        double dev2 = Double.parseDouble(String.valueOf(b.getDouble("dev2")));
        //  if(x==1) {



          //  int sum = b.getInt("add1");
            //int sum1 = b.getInt("add2");
            int w = b.getInt("x");
            double add = sum + sum1;
            double subtraction = sub - sub1;
            double multiplication = multi * multi1;
             double devi = (dev / dev2);
           // textView.setText(Double.toString(add));
          //  textView.setText(Integer.toString(w));
         switch(w) {
            case 1:

                 textView.setText(Double.toString(add));
                break;
            case 2:
                    textView.setText(Double.toString(subtraction));
                    break;
            case 3:
                    textView.setText(Double.toString(multiplication));
                    break;

             case 4:
                 textView.setText(Double.toString(devi) );
                 break;

        }




















        }
        //  }
        //  else {'


            // int  sum=Integer.parseInt(String.valueOf(b.getInt("sub1")));
//            // int  sum1=Integer.parseInt(String.valueOf(b.getInt("add2")));
//            //int add=sum+sum1;
//            double sub = Double.parseDouble(String.valueOf(b.getDouble("sub1")));
//            double sub1 = Double.parseDouble(String.valueOf(b.getDouble("sub2")));
//            double subtract = sub - sub1;
//
//            textView.setText(Double.toString(subtract));
//
//        }
//
//
//        //textView.setText(Integer.toString(add));


    }
//}
