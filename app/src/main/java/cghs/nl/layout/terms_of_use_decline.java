package cghs.nl.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class terms_of_use_decline extends AppCompatActivity {




    private Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_of_use_decline);



        button = (Button) findViewById(R.id.btn_back_to_terms_of_use);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();
            }
        });
    }


        public void openMainActivity(){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);


    }
}
