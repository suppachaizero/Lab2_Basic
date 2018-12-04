package zero.ruts.ac.th.lab1_basic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    Button butonNext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       mediaPlayer=MediaPlayer.create(this,R.raw.kkk);

       mediaPlayer.start();
       mediaPlayer.setLooping(true);

       //เรียกใช้งานปุ่ม
        butonNext = (Button)findViewById(R.id.buttonNext);
        butonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Button1= new Intent(MainActivity.this,LOGIN.class);
                startActivity(Button1);
            }
        });



    }
}
