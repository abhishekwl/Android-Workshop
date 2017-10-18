package io.github.abhishekwl.app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

int count = 0;
Button minusButton;
Button plusButton;
TextView textCountView;

@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);

minusButton = (Button) findViewById(R.id.minusButton);
plusButton = (Button) findViewById(R.id.plusButton);
textCountView = (TextView) findViewById(R.id.countTextView);

minusButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        count--;
        textCountView.setText(Integer.toString(count));

    }
});

plusButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        count++;
        textCountView.setText(Integer.toString(count));

    }
});

    }
}
