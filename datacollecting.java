import android.hardware.SensorEvent; 
import android.hardware.SensorEventListener; 
import android.hardware.SensorManager; 
//import android.media.MediaPlayer; 
import android.os.Bundle; 
import android.support.v7.app.AppCompatActivity; 
import android.view.Menu; 
import android.view.MenuItem; 
import android.hardware.Sensor; 
import android.widget.TextView; 
public class DataCollection extends AppCompatActivity implements SensorEventListener{ 
    // this class help in selecting a particular sensor 
    Sensor sensor; 
    // this class helps in managing activities of sensor 
    SensorManager sm; 
49 
 
    TextView displayReading; 
    //MediaPlayer mPlayer; 
    @Override 
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.activity_data_collection); 
        //setup a sensor service 
        sm = (SensorManager)getSystemService(SENSOR_SERVICE); 
        //select a particular sensor 
        sensor = sm.getDefaultSensor(Sensor.TYPE_PRESSURE); 
        sm.registerListener(this,sensor,SensorManager.SENSOR_DELAY_NORMAL); 
        displayReading = (TextView)findViewById(R.id.display_reading); 
       // mPlayer = MediaPlayer.create(this,R.raw.sword); 
    } 
    @Override 
    public boolean onCreateOptionsMenu(Menu menu) { 
        // Inflate the menu; this adds items to the action bar if it is present. 
        getMenuInflater().inflate(R.menu.menu_data_collection, menu); 
        return true; 
    } 
    @Override 
    public boolean onOptionsItemSelected(MenuItem item) { 
        // Handle action bar item clicks here. The action bar will 
        // automatically handle clicks on the Home/Up button, so long 
        // as you specify a parent activity in AndroidManifest.xml. 
        int id = item.getItemId(); 
 
        //noinspection SimplifiableIfStatement 
        if (id == R.id.action_settings) { 
            return true; 
        } 
50 
 
        return super.onOptionsItemSelected(item); 
    } 
    @Override 
    public void onSensorChanged(SensorEvent event) { 
    } 
    @Override 
    public void onAccuracyChanged(Sensor sensor, int accuracy) { 
    } 
} 
 
