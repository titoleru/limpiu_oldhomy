package aleroysm.gmail.com.homy;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class InicioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        if (getIntent().hasExtra("aleroysm.homy.GO")) {

            String text = getIntent().getExtras().getString("aleroysm.homy.GO");

            ImageView bigLogoImageView = (ImageView) findViewById(R.id.biglogoImageView);
            Button gobutton = (Button) findViewById (R.id.goButton);
            Button buscarbutton = (Button) findViewById (R.id.buscarButton);
            Button mensajesbutton = (Button) findViewById (R.id.mensajesButton);
            Button statsbutton = (Button) findViewById (R.id.statsButton);

        }
    }
}
