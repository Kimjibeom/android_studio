 package org.techtown.myapplication;

 import androidx.appcompat.app.AppCompatActivity;

 import android.content.Intent;
 import android.os.Bundle;
 import android.view.View;
 import android.widget.Button;
 import com.google.zxing.integration.android.IntentIntegrator;

 public class MainActivity extends AppCompatActivity {

     private Button createQRBtn;
     private Button scanQRBtn;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);

         createQRBtn = (Button) findViewById(R.id.createQR);

         createQRBtn.setOnClickListener(new View.OnClickListener(){
             public void onClick(View v){
                 Intent intent = new Intent(MainActivity.this, CreateQR.class);
                 startActivity(intent);
             }
         });

         scanQRBtn = (Button) findViewById(R.id.scanQR);

         scanQRBtn.setOnClickListener(new View.OnClickListener(){
             public void onClick(View v){
                 Intent intent = new Intent(MainActivity.this, ScanQR.class);
                 startActivity(intent);
             }
         });



     }
 }