package jupc.itics.tesoem.edu.p2jonatha1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
   TextView btnsig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnsig =(TextView) findViewById(R.id.btnsiguiente);
        btnsig.setOnClickListener(this);
    }
    public void onClick(View v) {
        Intent frm2= new Intent(this, frm2Activity.class);
        startActivity(frm2);
        finish();
    }
}
