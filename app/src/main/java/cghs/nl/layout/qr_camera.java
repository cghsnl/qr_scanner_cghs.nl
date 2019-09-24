package cghs.nl.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.zxing.Result;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class qr_camera extends AppCompatActivity implements ZXingScannerView.ResultHandler {

    private Button btn_stop_qr;
    private Button btn_scan;



    //zxing
//    ZXingScannerView ScannerView;
private ZXingScannerView scannerView;
    public static  TextView txt_qr_scan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //scanner
        //ScannerView = new ZXingScannerView(this);
        //scanner
        setContentView(R.layout.activity_qr_camera);

        scannerView = (ZXingScannerView) findViewById(R.id.zxscan);
        txt_qr_scan = (TextView) findViewById(R.id.txt_qr_scan);


        Dexter.withActivity(this)
                .withPermission(Manifest.permission.CAMERA)
                .withListener(new PermissionListener() {
                    @Override
                    public void onPermissionGranted(PermissionGrantedResponse response) {
                            scannerView.setResultHandler(qr_camera.this);
                            scannerView.startCamera();
                    }

                    @Override
                    public void onPermissionDenied(PermissionDeniedResponse response) {
                        Toast.makeText(qr_camera.this,"accept",Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onPermissionRationaleShouldBeShown(PermissionRequest permission, PermissionToken token) {

                    }
                })
                .check();



        btn_scan = (Button) findViewById(R.id.btn_scan);
        btn_stop_qr = (Button) findViewById(R.id.btn_stop_qr);

        btn_stop_qr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_home_menu();
            }});

        btn_scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_scanned_tab();
            }});




    }


    public void open_home_menu(){
        Intent intent = new Intent(this, home_menu.class);
        startActivity(intent);
    }

    public void open_scanned_tab(){
        Intent intent = new Intent(this, scanned_tab.class);
        startActivity(intent);
    }


//    @Override
//    public void handleResult(Result rawResult) {
//        scanned_tab.txt_scan_output.setText(rawResult.getText());
//        onBackPressed();
//    }


    @Override
    protected void onPause() {
        super.onPause();
        scannerView.stopCamera();
    }


    @Override
    protected void onPostResume() {
        super.onPostResume();
        scannerView.setResultHandler(this);
        scannerView.startCamera();
    }

    @Override
    public void handleResult (Result rawResult){
        txt_qr_scan.setText(rawResult.getText());
    }

}
