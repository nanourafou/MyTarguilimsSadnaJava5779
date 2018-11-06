package netanel.jct.com.mytarguilimssadnajava5779;

        import android.content.Context;
        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;

        /*
                RAPHAEL AMAR - 342473675
                NETANEL COHEN SOLAL - 1444669
         */


public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MyFirstProgram";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Context context = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnT1 = (Button) findViewById(R.id.btn_t1);
        btnT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentI1 = new Intent(context,Targuil1.class);
                startActivity(intentI1);
            }
        });

        Button btnT2 = (Button) findViewById(R.id.btn_t2);
        btnT2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentI1 = new Intent(context,Targuil2.class);
                startActivity(intentI1);
            }
        });

        Button btnT3 = (Button) findViewById(R.id.btn_t3);
        btnT3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentI1 = new Intent(context,Targuil3.class);
                startActivity(intentI1);
            }
        });

        Button btnT4 = (Button) findViewById(R.id.btn_t4);
        btnT4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentI1 = new Intent(context,Targuil4.class);
                startActivity(intentI1);
            }
        });

        Button btnT5 = (Button) findViewById(R.id.btn_t5);
        btnT5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentI1 = new Intent(context,Targuil5.class);
                startActivity(intentI1);
            }
        });


    }
}
