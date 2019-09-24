package cghs.nl.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class scanned_tab extends AppCompatActivity {


    private Button btn_home_scan;
    private Button btn_copy_scan;
    private Button btn_delete_scan;
    private Button btn_new_scan_scan;
    private Button btn_history_scan;
//text
  public static  TextView txt_scan_output;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanned_tab);


        btn_home_scan = (Button) findViewById(R.id.btn_home_scan);
        btn_copy_scan = (Button) findViewById(R.id.btn_copy_scan);
        btn_delete_scan = (Button) findViewById(R.id.btn_delete_scan);
        btn_new_scan_scan = (Button) findViewById(R.id.btn_new_scan_scan);
        btn_history_scan = (Button) findViewById(R.id.btn_history_scan);

        //text
        txt_scan_output = (TextView) findViewById(R.id.txt_scan_output);





        btn_home_scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_home();
            }});

        btn_copy_scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //copy butn here ();


                Toast.makeText(scanned_tab.this,
                        "Copy", Toast.LENGTH_LONG).show();
            }});

        btn_delete_scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //delete from list    //open_btn_delete_man_calc();

                Toast.makeText(scanned_tab.this,
                        "Delete", Toast.LENGTH_LONG).show();
            }});

        btn_new_scan_scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_scan();
            }});

        btn_history_scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_scan_hist();
            }});




    }






    public void open_home(){
        Intent intent = new Intent(this, home_menu.class);
        startActivity(intent);
    }
    //    public void btn_copy_scan(){
//        Intent intent = new Intent(this, settings.class);
//        startActivity(intent);
//    }
//    public void btn_delete_scan(){
//        Intent intent = new Intent(this, qr_camera.class);
//        startActivity(intent);
//    }
    public void open_scan(){
        Intent intent = new Intent(this, qr_camera.class);
        startActivity(intent);
    }
    public void open_scan_hist(){
        Intent intent = new Intent(this, scanned_history.class);
        startActivity(intent);
    }






}
