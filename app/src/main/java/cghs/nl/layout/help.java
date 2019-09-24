package cghs.nl.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class help extends AppCompatActivity {

    private Button btn_home_help;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);



        btn_home_help = (Button) findViewById(R.id.btn_home_help);

        btn_home_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_home();
            }});











    }




    public void open_home() {
        Intent intent = new Intent(this, home_menu.class);
        startActivity(intent);
    }







}
