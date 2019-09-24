package cghs.nl.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class manually extends AppCompatActivity {

    private Button btn_home_manually;
    private Button btn_calculate_manually;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manually);




        btn_home_manually = (Button) findViewById(R.id.btn_home_manually);
        btn_calculate_manually = (Button) findViewById(R.id.btn_calculate_manually);


        btn_calculate_manually.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_mannually_calculate();
            }});
        btn_home_manually.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_home_menu();
            }});


    }


    public void open_mannually_calculate(){
        Intent intent = new Intent(this, manually_calculate.class);
        startActivity(intent);
    }
    public void open_home_menu(){
        Intent intent = new Intent(this, home_menu.class);
        startActivity(intent);
    }

}
