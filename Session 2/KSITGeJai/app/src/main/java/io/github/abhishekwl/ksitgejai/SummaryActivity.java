package io.github.abhishekwl.ksitgejai;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SummaryActivity extends AppCompatActivity {

    TextView summaryTextView, supportTextView;
    Button confirmButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        summaryTextView = (TextView) findViewById(R.id.summaryTextView);
        supportTextView = (TextView) findViewById(R.id.supportTextView);
        confirmButton = (Button) findViewById(R.id.confirmButton);

        String dataFromMain = getIntent().getStringExtra("DATA");
        summaryTextView.setText(dataFromMain);

        supportTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent dialerIntent = new Intent(Intent.ACTION_DIAL);
                dialerIntent.setData(Uri.parse("tel:9663265931"));
                startActivity(dialerIntent);



            }
        });

    }
}
