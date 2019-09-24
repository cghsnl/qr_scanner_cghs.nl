package cghs.nl.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_decline;
    private Button btn_accept;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_decline = (Button) findViewById(R.id.btn_decline);
        btn_accept = (Button) findViewById(R.id.btn_accept);

        btn_accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_settings();
            }});

        btn_decline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_terms_of_use_decline();
            }});
    }


    public void open_terms_of_use_decline(){
        Intent intent = new Intent(this, terms_of_use_decline.class);
        startActivity(intent);
    }
    public void open_settings(){
        Intent intent = new Intent(this, settings.class);
        startActivity(intent);
    }





}
