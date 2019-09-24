package cghs.nl.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home_menu extends AppCompatActivity {

    private Button btn_help_home;
    private Button btn_settings_home;
    private Button btn_new_scan_home;
    private Button btn_manually_home;
    private Button btn_open_website_home;
    private Button btn_manually_history_home;
    private Button btn_scan_history_home;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_menu);


        btn_help_home = (Button) findViewById(R.id.btn_help_home);
        btn_settings_home = (Button) findViewById(R.id.btn_settings_home);
        btn_new_scan_home = (Button) findViewById(R.id.btn_new_scan_home);
        btn_manually_home = (Button) findViewById(R.id.btn_manually_home);
        btn_open_website_home = (Button) findViewById(R.id.btn_open_website_home);
        btn_manually_history_home = (Button) findViewById(R.id.btn_manually_history_home);
        btn_scan_history_home = (Button) findViewById(R.id.btn_scan_history_home);


        btn_help_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_help();
            }});

        btn_settings_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_settings();
            }});

        btn_new_scan_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_qr_camera();
            }});

        btn_manually_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_manually();
            }});

        btn_open_website_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_website();
            }});

        btn_manually_history_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_manually_history();
            }});

        btn_scan_history_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_scan_history();
            }});


    }


    public void open_help(){
        Intent intent = new Intent(this, help.class);
        startActivity(intent);
    }
    public void open_settings(){
        Intent intent = new Intent(this, settings.class);
        startActivity(intent);
    }
    public void open_qr_camera(){
        Intent intent = new Intent(this, qr_camera.class);
        startActivity(intent);
    }
    public void open_manually(){
        Intent intent = new Intent(this, manually.class);
        startActivity(intent);
    }
    public void open_website(){
        Intent intent = new Intent(this, website.class);
        startActivity(intent);
    }
    public void open_manually_history(){
        Intent intent = new Intent(this, manually_history.class);
        startActivity(intent);
    }
    public void open_scan_history(){
        Intent intent = new Intent(this, scanned_history.class);
        startActivity(intent);
    }



}
