package zero.ruts.ac.th.lab1_basic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Second extends AppCompatActivity {
    Button button2,button3,button4;
    TextView textView5,textView6,textView7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button2=(Button)findViewById(R.id.button2Next);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Button2 = new Intent(Second.this,MainActivity.class);
                startActivity(Button2);
            }
        });
        button3 = (Button) findViewById(R.id.button3Home);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Button3 = new Intent(Second.this,MainActivity.class);
                startActivity(Button3);
            }
        });
        button4=(Button) findViewById(R.id.button4Next);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Button4 = new Intent(Second.this,Third.class);
                startActivity(Button4);
            }
        });
        textView5=(TextView)findViewById(R.id.textView5);
        textView6=(TextView)findViewById(R.id.textView6);
        textView7=(TextView)findViewById(R.id.textView7);

        textView5.setText(getIntent().getStringExtra("name"));
        textView6.setText(getIntent().getStringExtra("pass"));
        textView7.setText(getIntent().getStringExtra("phone"));
    }
}
