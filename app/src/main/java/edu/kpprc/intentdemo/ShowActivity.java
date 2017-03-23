package edu.kpprc.intentdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class ShowActivity extends AppCompatActivity {
    TextView ipAddrText, subnetMaskText;
    Button returnButton;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        Bundle bundle = getIntent().getExtras();
        String ip = bundle.getString("IP");
        String subnet = bundle.getString("SubnetMask");
        ipAddrText = (TextView) findViewById(R.id.ipText);
        subnetMaskText = (TextView) findViewById(R.id.subnetText);
        returnButton = (Button) findViewById(R.id.returnBtn);
        ipAddrText.setText(ip);
        subnetMaskText.setText(subnet);
        returnButton.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShowActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
