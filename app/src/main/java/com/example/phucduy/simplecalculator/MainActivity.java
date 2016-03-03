package com.example.phucduy.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText so1,so2;
    TextView ketQua;
    Button btnCong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCong = (Button)findViewById(R.id.btnCong);
        so1 = (EditText)findViewById(R.id.editTextSo1);
        so2 = (EditText)findViewById(R.id.editTextSo2);
        ketQua = (TextView)findViewById(R.id.textViewKetQua);

        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String strSo1 = so1.getText().toString();
                    String strSo2 = so2.getText().toString();
                    Float dSo1   = Float.parseFloat(strSo1);
                    Float dSo2   = Float.parseFloat(strSo2);

                    Float dKetQua = dSo1 + dSo2;
                    String strKetQua = String.valueOf(dKetQua);
                    ketQua.setText(strKetQua);
                }catch (Throwable e){
                    ketQua.setText("");
                    so1.setText("");
                    so2.setText("");
                    Toast toaseMessage = Toast.makeText(MainActivity.this,"Invalid Input",Toast.LENGTH_SHORT);
                    toaseMessage.setGravity(Gravity.CENTER,0,0);
                    toaseMessage.show();
                }
            }
        });
    }

}
