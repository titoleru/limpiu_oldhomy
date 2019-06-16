package aleroysm.gmail.com.homy;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    // connect fields with layout layers
       TextView intro1TextView = (TextView) findViewById(R.id.intro1TextView);
       ImageView intro1ImageView = (ImageView) findViewById(R.id.intro1ImageView);
       Button entrarButton = (Button) findViewById(R.id.entrarButton);
       Button accesoButton = (Button) findViewById(R.id.accesoButton);


        // Launch an activity within our app
        entrarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // create intent
                Intent entrarIntent = new Intent(getApplicationContext(), LoginActivity.class);
                // run intent
                startActivity(entrarIntent);
            }
        });

    }
}
