package ntu_63130273.cau2_curchange;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    //Create objects for all the widgets
    TextView tv_to,tv_from,tv_result;
    EditText edt_amount;
    Button btnusd,btngbp,btnaus,btncan,btneuro,btnjpy;
    String amount;
    int pkr,result;
