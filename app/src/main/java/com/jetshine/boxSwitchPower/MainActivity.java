package com.jetshine.boxSwitchPower;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.jieshine.box_switch_power.BoxSwitchPowerUtil;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BoxSwitchPowerUtil.getInstance().synSystemTime(2021,7,5,12,1,50);
        mHandler.sendEmptyMessageDelayed(0,3000);
        mHandler.sendEmptyMessageDelayed(0,3000);
    }

    private Handler mHandler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            BoxSwitchPowerUtil.getInstance().setStartTime(MainActivity.this,"2021-07-05 12:03:00");
            BoxSwitchPowerUtil.getInstance().setCloseTime(MainActivity.this,"2021-07-05 12:02:00");
        }
    };
}
