package ve.needforock.animationfab;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton add, phone, mail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        add = (FloatingActionButton) findViewById(R.id.addFab);
        mail = (FloatingActionButton) findViewById(R.id.emailFab);
        phone = (FloatingActionButton) findViewById(R.id.phoneFab);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(add.getRotation()!= 0){
                   hideFabs();
                }else{
                    showFabs();
                }
            }
        });

        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Agregar Correo", Toast.LENGTH_SHORT).show();
            }
        });

        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Agregar Telefono", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void showFabs(){
        Log.d("SHOW","showfabs");
        add.animate().rotation(45).setDuration(400).start();
        mail.animate().translationY(-150).setDuration(300).start();
        phone.animate().translationY(-300).setDuration(600).start();
    }

    private void hideFabs(){
        add.animate().rotation(0).setDuration(400).start();
        mail.animate().translationY(0).setDuration(600).start();
        phone.animate().translationY(0).setDuration(800).start();
    }
}
