package netanel.jct.com.mytarguilimssadnajava5779;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Targuil1 extends Activity {

    public static final String ACTIVITY_LIFE_TAG = "activity_lifecycle";

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(ACTIVITY_LIFE_TAG,"onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(ACTIVITY_LIFE_TAG,"onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(ACTIVITY_LIFE_TAG,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(ACTIVITY_LIFE_TAG,"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(ACTIVITY_LIFE_TAG,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(ACTIVITY_LIFE_TAG,"onDestroy");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_targuil1);
        Log.d(ACTIVITY_LIFE_TAG,"onCreate");
    }
}
