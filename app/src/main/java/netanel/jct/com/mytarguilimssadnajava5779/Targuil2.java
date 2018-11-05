package netanel.jct.com.mytarguilimssadnajava5779;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Targuil2 extends AppCompatActivity {

    public static final String TAG = "hw";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //Creating UI Elements
        Button btn1 = new Button(this);
        btn1.setText("Button 1");

        TextView txtView1 = new TextView(this);
        txtView1.setText("Text View 1");

        Button btn2 = new Button(this);
        btn2.setText("Button 2");

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);

        // Adding the View to the layout
        layout.addView(btn1);
        layout.addView(txtView1);
        layout.addView(btn2);

        setContentView(layout);

    }
}
