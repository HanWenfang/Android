package com.example.misc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button);

        buttonContainer = (LinearLayout) findViewById(R.id.layout_button_id);
        clickme = (Button) findViewById(R.id.button_click);

        clickme.setOnClickListener(new clickListener());
    }

    public class clickListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
           if(view.getId() == R.id.button_click) {
               ImageButton temp = new ImageButton(MyActivity.this);
               temp.setImageResource(android.R.drawable.btn_radio);
               temp.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
               buttonContainer.addView(temp);
            }
        }
    }

    private Button clickme;
    private LinearLayout buttonContainer;
}
