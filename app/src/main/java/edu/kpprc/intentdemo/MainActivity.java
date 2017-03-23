package edu.kpprc.intentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button sendBtn;
    EditText ipAddr;
    EditText subnetMask;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sendBtn = (Button) findViewById(R.id.sendButton);
        ipAddr = (EditText) findViewById(R.id.ipInput);
        subnetMask = (EditText) findViewById(R.id.subnetInput);
        sendBtn.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, ShowActivity.class);
                String ip = ipAddr.getText().toString();
                String subnet = subnetMask.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("IP", ip);
                bundle.putString("SubnetMask", subnet);
                intent.putExtras(bundle);
                startActivity(intent);
                finish();
            }
        });
    }
}
