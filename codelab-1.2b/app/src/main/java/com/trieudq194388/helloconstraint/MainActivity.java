package com.trieudq194388.helloconstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    private Button zeroBtn, countBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        zeroBtn = findViewById(R.id.button_zero);
        countBtn = findViewById(R.id.button_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
        toast.show();
    }


    @SuppressLint({"ResourceAsColor", "UseCompatLoadingForColorStateLists"})
    public void countUp(View view) {
        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
            if(mCount % 2 == 0) view.setBackgroundTintList(getResources().getColorStateList(R.color.teal_200));
            else view.setBackgroundTintList(getResources().getColorStateList(R.color.orange));
            zeroBtn.setBackgroundTintList(getResources().getColorStateList(R.color.pink));
        }
    }

    @SuppressLint({"ResourceAsColor", "UseCompatLoadingForColorStateLists"})
    public void countZero(View view) {
        if(mCount != 0){
            mCount = 0;
            mShowCount.setText(Integer.toString(mCount));
            zeroBtn.setBackgroundTintList(getResources().getColorStateList(R.color.gray));
            countBtn.setBackgroundTintList(getResources().getColorStateList(R.color.purple_200));
        }
    }
}