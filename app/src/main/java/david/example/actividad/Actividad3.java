package david.example.actividad;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Actividad3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad3);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        String msn = this.getIntent().getExtras().getString("msn");
        TextView txt = findViewById(R.id.txt);
        txt.setText(msn);
    }
    @Override
    protected void onResume(){
        super.onResume();
        Toast toast = Toast.makeText(this, "APP Reanudando", Toast.LENGTH_SHORT);
        toast.show();

    }
    @Override
    protected void onPause(){
        super.onPause();
        Toast toast = Toast.makeText(this, "APP en pausa", Toast.LENGTH_SHORT);
        toast.show();
    }
    @Override
    protected void onStop(){
        super.onStop();
        Toast toast = Toast.makeText(this, "APP Stop", Toast.LENGTH_SHORT);
        toast.show();
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Toast toast = Toast.makeText(this, "APP Reiniciando", Toast.LENGTH_SHORT);
        toast.show();
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast toast = Toast.makeText(this, "APP Cerrado", Toast.LENGTH_SHORT);
        toast.show();
    }
}