package com.e.bmi__sandis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtheight,txtweight,display;
    Button btncalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtheight=findViewById(R.id.txtheight);
        txtweight=findViewById(R.id.txtweight);
        btncalculate=findViewById(R.id.btncalculate);
        display=findViewById(R.id.display);


        btncalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double h,w,result;
                h=Double.parseDouble(txtheight.getText().toString());
                w=Double.parseDouble(txtweight.getText().toString());


                BmiSandis bmi=new BmiSandis(h,w);

                result=bmi.calculate();

                display.setText(""+result);

                if (result<18.5){
                    Toast.makeText(MainActivity.this, "Under weight", Toast.LENGTH_SHORT).show();
                }
                else if(result>18.5 && result<24.9){
                    Toast.makeText(MainActivity.this, "Normal weight", Toast.LENGTH_SHORT).show();
                }
                else if(result>25 && result<29.9){
                    Toast.makeText(MainActivity.this, "Over weight", Toast.LENGTH_SHORT).show();
                }
                else if(result>30){
                    Toast.makeText(MainActivity.this, "Obesity", Toast.LENGTH_SHORT).show();
                }

            }
        });



    }
}
