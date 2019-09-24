package cghs.nl.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class settings extends AppCompatActivity {



    private Button btn_back_to_terms_of_use;
    private Button btn_save;
    private Button btn_contact;
    private Switch swi_settings1;
    private Switch swi_settings2;
    private Switch swi_settings3;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


        btn_save = (Button) findViewById(R.id.btn_save);
        btn_contact = (Button) findViewById(R.id.btn_contact);
        btn_back_to_terms_of_use = (Button) findViewById(R.id.btn_back_to_terms_of_use);
        swi_settings1 = (Switch) findViewById(R.id.swi_settings1);
        swi_settings2 = (Switch) findViewById(R.id.swi_settings2);
        swi_settings3 = (Switch) findViewById(R.id.swi_settings3);



        btn_back_to_terms_of_use.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_MainActivity();
            }});

        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_home_menu();
            }});

        btn_contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_contact();
            }});





    }                //kut haakje niet vergeten


    public void open_MainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void open_home_menu(){
        Intent intent = new Intent(this, home_menu.class);
        startActivity(intent);
    }

    public void open_contact(){
        Intent intent = new Intent(this, contact.class);
        startActivity(intent);
    }






}
