package cghs.nl.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class scanned_history extends AppCompatActivity {



    private Button btn_home_scan_his;
    private Button btn_new_scan_scan_his;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanned_history);


        btn_home_scan_his = (Button) findViewById(R.id.btn_home_scan_his);
        btn_new_scan_scan_his = (Button) findViewById(R.id.btn_new_scan_scan_his);




        btn_new_scan_scan_his.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_scan();
            }});


        btn_home_scan_his.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_home_menu();
            }});



    }




    public void open_home_menu(){
        Intent intent = new Intent(this, home_menu.class);
        startActivity(intent);
    }

    public void open_scan(){
        Intent intent = new Intent(this, qr_camera.class);
        startActivity(intent);
    }







}
