package sg.edu.rp.c346.id20024466.l05demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView tvQ1;
    TextView tvQ2;
    Button btnRevealQ1;
    Button btnRevealQ2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRevealQ1=findViewById(R.id.RevealQ1);
        tvQ1=findViewById(R.id.tVQ1);

        btnRevealQ2=findViewById(R.id.RevealQ2);
        tvQ2=findViewById(R.id.tVQ2);

        btnRevealQ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,AnswerActivity1.class);
                i.putExtra("Question","Q1");
                i.putExtra("Value",1);
                startActivity(i);
            }
        });

        btnRevealQ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(MainActivity.this,AnswerActivity2.class);
                j.putExtra("Question","Q2");
                j.putExtra("Value",2);
                startActivity(j);
            }
        });



    }



}