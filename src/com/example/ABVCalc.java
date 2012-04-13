package com.example;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class ABVCalc extends Activity
{
    Beer b=new Beer();
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button calculate=(Button)findViewById(R.id.calculate);

        calculate.setOnClickListener(onCalculate);
    }

    private View.OnClickListener onCalculate=new View.OnClickListener(){
        public void onClick(View v){
            EditText og=(EditText)findViewById(R.id.og);
            EditText fg=(EditText)findViewById(R.id.fg);
            TextView abv=(TextView)findViewById(R.id.abv);
            double abvDouble;
            DecimalFormat fmt=new DecimalFormat("0.00%");

            b.setOG(Double.parseDouble(og.getText().toString()));
            b.setFG(Double.parseDouble(fg.getText().toString()));

            abvDouble=b.calcABV();

            abv.setText(fmt.format(abvDouble));
        }
    };
}
