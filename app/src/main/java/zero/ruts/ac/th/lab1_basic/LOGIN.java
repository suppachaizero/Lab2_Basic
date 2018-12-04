package zero.ruts.ac.th.lab1_basic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class LOGIN extends AppCompatActivity {

    ImageView Img5;

    EditText edit1,edit2,edit3;

    Button Button,btnnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Img5=(ImageView) findViewById(R.id.imageView5Home);
        Img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Img5 = new Intent(LOGIN.this,MainActivity.class);
                startActivity(Img5);
            }
        });


        edit1 = (EditText)findViewById(R.id.username);
        edit2 = (EditText)findViewById(R.id.pass);
        edit3 = (EditText)findViewById(R.id.phone);



        btnnext = (Button) findViewById(R.id.btnnext);
        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LOGIN.this,Second.class);
                intent.putExtra("name",edit1.getText().toString());
                intent.putExtra("pass",edit2.getText().toString());
                intent.putExtra("phone",edit3.getText().toString());
                startActivity(intent);


            }
        });
    }
}
