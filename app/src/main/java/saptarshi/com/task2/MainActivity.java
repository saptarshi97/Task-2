package saptarshi.com.task2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
     int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textOne = (TextView) findViewById(R.id.edit_message);
        Button B1 = (Button) findViewById(R.id.button_send1);

        B1.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                if(i%2==0)
                {
                    textOne.setText(getResources().getString(R.string.message2));
                  i++;
                }
                else
                {
                    textOne.setText(getResources().getString(R.string.message1));
                    i++;
                }
            }
        });
    }
}

