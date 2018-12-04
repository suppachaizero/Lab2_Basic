package zero.ruts.ac.th.lab1_basic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Third extends AppCompatActivity {

    ImageView Img;
    ImageView Img2;
    ImageView Img3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Img=(ImageView) findViewById(R.id.imageView2Next);
        Img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Img = new Intent(Third.this,LOGIN.class);
                startActivity(Img);
            }
        });
        Img2=(ImageView) findViewById(R.id.imageView3Back);
        Img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Img2 = new Intent(Third.this,Second.class);
                startActivity(Img2);
            }
        });
        Img3=(ImageView) findViewById(R.id.imageView4Home);
        Img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Img3 = new Intent(Third.this,MainActivity.class);
                startActivity(Img3);
            }
        });
    }
}
