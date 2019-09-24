package cghs.nl.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class contact extends AppCompatActivity {


    private Button btn_home_menu;
    private Button btn_contact_send;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);




        btn_home_menu = (Button) findViewById(R.id.btn_home_menu);
        btn_contact_send = (Button) findViewById(R.id.btn_contact_send);



        btn_home_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_home();
            }});
        btn_contact_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(contact.this,
                        "Send", Toast.LENGTH_LONG).show();


                //   open_home();
            }});


    }



    public void open_home() {
        Intent intent = new Intent(this, home_menu.class);
        startActivity(intent);

    }


}
