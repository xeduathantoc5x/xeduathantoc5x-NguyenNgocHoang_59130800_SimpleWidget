package vn.edu.ntu.nguyenngochoang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editName, editBorn, editHob;
    CheckBox cb1, cb2, cb3, cb4, cb5;
    Button btnClick;
    RadioGroup rdbGr1, rdbGr2;
    String txtText = " ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addView();
        addAction();
    }
    public void addView(){
        editName = findViewById(R.id.editName);
        editBorn = findViewById(R.id.editBorn);
        rdbGr1 = findViewById(R.id.rdbGr1);
        rdbGr2 = findViewById(R.id.rdbGr2);

        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);
        cb4 = findViewById(R.id.cb4);
        cb5 = findViewById(R.id.cb5);

        editHob = findViewById(R.id.editSoThich);

        btnClick = findViewById(R.id.btnClick);

    }
    void addAction(){
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtText += editName.getText().toString();
                txtText += "\nNgày Sinh" + editBorn.getText().toString();

                switch (rdbGr1.getCheckedRadioButtonId()){
                    case R.id.rbNam: txtText += "\nGiới tính: Nam"; break;
                    case R.id.rbNu: txtText += "\nGiới tính: Nữ"; break;
                }
                txtText += "\n Sở thích :";
                if (cb1.isChecked())
                    txtText += cb1.getText().toString() + ";";
                if (cb2.isChecked())
                    txtText += cb2.getText().toString() + ";";
                if (cb3.isChecked())
                    txtText += cb3.getText().toString() + ";";
                if (cb4.isChecked())
                    txtText += cb4.getText().toString() + ";";
                if (cb5.isChecked())
                    txtText += cb5.getText().toString() + ";";

                txtText += editBorn.getText().toString();

                Toast.makeText(getApplicationContext(),txtText,Toast.LENGTH_LONG).show();
            }
        });
    }
}
