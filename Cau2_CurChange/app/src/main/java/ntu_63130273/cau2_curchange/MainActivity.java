package ntu_63130273.cau2_curchange;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

import tiil.edu.cau2_curchange.R;

public class MainActivity extends AppCompatActivity {
    //Create objects for all the widgets
    TextView tv_to,tv_from,tv_result;
    EditText edt_amount;
    Button btnusd,btngbp,btnaus,btncan,btneuro,btnjpy;
    String amount;
    int pkr,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        Clicklisteners();
    }
    //Initialize all the widgets and do view binding
    public void init(){
        tv_to=findViewById(R.id.tv_to);
        tv_from=findViewById(R.id.tv_from);
        tv_result=findViewById(R.id.tvresult);
        edt_amount=findViewById(R.id.edt_amount);
        btnusd=findViewById(R.id.btnusd);
        btngbp=findViewById(R.id.btngbp);
        btnaus=findViewById(R.id.btnaus);
        btncan=findViewById(R.id.btncan);
        btneuro=findViewById(R.id.btneur);
        btnjpy=findViewById(R.id.btnjpy);
    }

    //Now We will create click listeners for each button
    public void Clicklisteners(){
        btnusd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //here we get user input into this variable
                amount=edt_amount.getText().toString();
                pkr=178;
                //integer.parse used to convert string value into integer for calculcatin purpose
                result=Integer.parseInt(amount)*(pkr);
                //again converted integer value into string because android system works with strings
                tv_result.setText(String.valueOf(result));
                tv_to.setText("USD");
                tv_from.setText("US$ = 178Pkr");
            }
        });
        btngbp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount=edt_amount.getText().toString();
                pkr=239;
                result=Integer.parseInt(amount)*(pkr);
                tv_result.setText(String.valueOf(result));
                tv_to.setText("GBP");
                tv_from.setText("GBP = 239Pkr");
            }
        });
        btnaus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount=edt_amount.getText().toString();
                pkr=127;
                result=Integer.parseInt(amount)*(pkr);
                tv_result.setText(String.valueOf(result));
                tv_to.setText("AUS$");
                tv_from.setText("AUS$ = 127Pkr");
            }
        });
        btncan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount=edt_amount.getText().toString();
                pkr=139;
                result=Integer.parseInt(amount)*(pkr);
                tv_result.setText(String.valueOf(result));
                tv_to.setText("CAN$");
                tv_from.setText("CAN$ = 139Pkr");
            }
        });
        btneuro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount=edt_amount.getText().toString();
                pkr=199;
                result=Integer.parseInt(amount)*(pkr);
                tv_result.setText(String.valueOf(result));
                tv_to.setText("EURO");
                tv_from.setText("EURO = 199Pkr");
            }
        });
        btnjpy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount=edt_amount.getText().toString();
                //here we used double data type instead of int bcz the value is in float form
                double pkrr=1.52;
                double resultt=Double.parseDouble(amount)*(pkrr);
                tv_result.setText(String.valueOf(resultt));
                tv_to.setText("JPY");
                tv_from.setText("JPY = 1.52Pkr");
            }
        });
    }


}