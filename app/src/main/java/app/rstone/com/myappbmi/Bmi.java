package app.rstone.com.myappbmi;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Bmi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmi);
        final Context this__ = Bmi.this;
        final EditText height = findViewById(R.id.height);
        final EditText weight = findViewById(R.id.weight);
        final TextView result = findViewById(R.id.result);
        final class Calc{
            double height, weight, result;
            String message = "";
            public void exe(){
                height = height / 100;
                result = weight / (height*height);
                if(result < 18.5){
                    message = "Low";
                }else if(result >= 18.5 && result < 23){
                    message = "normal";
                }else if(result >= 23 && result < 25){
                    message = "before fat";
                }else if(result >= 25 && result < 30){
                    message = "first fat";
                }else if(result >= 30 && result < 35){
                    message = "second fat";
                }else{
                    message = "thrid fat";
                }
            }

        }


        findViewById(R.id.result_btn).setOnClickListener(
                (View v)->{
                    //getter, setter는 다른 클래스로 넘어갈 때 보안에 대한 우려가 생긴다
                    /*c.setHeight(Double.parseDouble(height.getText().toString()));
                    c.setWeight(Double.parseDouble(weight.getText().toString()));
                    c.exe();*/
                    //result.setText("결과 " + c.getMessage());
                    Calc c = new Calc();
                    c.height = Double.parseDouble(height.getText().toString());
                    c.weight = Double.parseDouble(weight.getText().toString());
                    c.exe();
                    result.setText("결과 " + c.message);
                }
        );
    }
}




/*
        new View.OnClickListener() {
@Override
public void onClick(View v) {
        c.setHeight(Double.parseDouble(height.getText().toString()));
        c.setWeight(Double.parseDouble(weight.getText().toString()));
        c.exe();
        result.setText("결과 " + c.getMessage());
        }
        }*/







        /* BMI
        high = high / 100;
        double result = weight/(high*high);
        String message = "";
        if(result < 18.5){
        message = "low";
        }else if(result >= 18.5 && result < 23){
        message = "normal";
        }else if(result >= 23 && result < 25){
        message = "before fat";
        }else if(result >= 25 && result < 30){
        message = "first fat";
        }else if(result >= 30 && result < 35){
        message = "second fat";
        }else{
        message = "thrid fat";
        }
        */



