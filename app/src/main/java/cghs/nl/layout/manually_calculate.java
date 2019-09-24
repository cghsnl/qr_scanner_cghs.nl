package cghs.nl.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class manually_calculate extends AppCompatActivity {





    private Button btn_home_man_calc;
    private Button btn_copy_man_calc;
    private Button btn_delete_man_calc;
    private Button btn_new_manually_man_calc;
    private Button btn_history_man_calc;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manually_calculate);



        btn_home_man_calc = (Button) findViewById(R.id.btn_home_man_calc);
        btn_copy_man_calc = (Button) findViewById(R.id.btn_copy_man_calc);
        btn_delete_man_calc = (Button) findViewById(R.id.btn_delete_man_calc);
        btn_new_manually_man_calc = (Button) findViewById(R.id.btn_new_manually_man_calc);
        btn_history_man_calc = (Button) findViewById(R.id.btn_history_man_calc);



        btn_home_man_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_home();
            }});

        btn_copy_man_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //copy butn here ();

                Toast.makeText(manually_calculate.this,
                        "Copy", Toast.LENGTH_LONG).show();
            }});

        btn_delete_man_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             //delete from list    //open_btn_delete_man_calc();

                Toast.makeText(manually_calculate.this,
                        "Delete", Toast.LENGTH_LONG).show();
            }});

        btn_new_manually_man_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_manually();
            }});

        btn_history_man_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_man_hist();
            }});







    }





    public void open_home(){
        Intent intent = new Intent(this, home_menu.class);
        startActivity(intent);
    }
//    public void btn_copy_man_calc(){
//        Intent intent = new Intent(this, copy.class);
//        startActivity(intent);
//    }
//    public void btn_delete_man_calc(){
//        Intent intent = new Intent(this, delete.class);
//        startActivity(intent);
//    }
    public void open_manually(){
        Intent intent = new Intent(this, manually.class);
        startActivity(intent);
    }
    public void open_man_hist(){
        Intent intent = new Intent(this, manually_history.class);
        startActivity(intent);
    }








}
