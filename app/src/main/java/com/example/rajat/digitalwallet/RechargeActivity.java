package com.example.rajat.digitalwallet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RechargeActivity extends AppCompatActivity {

    private static Button bttn_mobilerech;
    private static Button bttn_electricity;
    private static Button bttn_landline;
    private static Button bttn_broadband;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recharge);

        onClickButtonMobilerechListner();
        onClickButtonElectricityListner();
        onClickButtonLandlineListner();
        onClickButtonBroadbandListner();
    }

    public void onClickButtonMobilerechListner(){
        bttn_mobilerech=(Button)findViewById(R.id.button);
        bttn_mobilerech.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent("com.example.rajat.digitalwallet.MobileRechargeActivity");
                        startActivity(intent);
                    }
                }
        );
    }
    public void onClickButtonElectricityListner(){
        bttn_electricity=(Button)findViewById(R.id.button2);
        bttn_electricity.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent("com.example.rajat.digitalwallet.ElectricityActivity");
                        startActivity(intent);
                    }
                }
        );
    }
    public void onClickButtonLandlineListner(){
        bttn_landline=(Button)findViewById(R.id.button3);
        bttn_landline.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent("com.example.rajat.digitalwallet.LandlineActivity");
                        startActivity(intent);
                    }
                }
        );
    }

    public void onClickButtonBroadbandListner(){
        bttn_broadband=(Button)findViewById(R.id.button4);
        bttn_broadband.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent("com.example.rajat.digitalwallet.BroadbandActivity");
                        startActivity(intent);
                    }
                }
        );
    }

}
