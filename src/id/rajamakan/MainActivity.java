package id.rajamakan;

import android.support.v7.app.ActionBarActivity;


import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.pushbots.push.Pushbots;
public class MainActivity extends ActionBarActivity {

    private String SENDER_ID="258597518822";
	private String PUSHBOTS_APPLICATION_ID="542651801d0ab129098b45dc";

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);  
        Pushbots.init(this, SENDER_ID,PUSHBOTS_APPLICATION_ID);
        setContentView(R.layout.activity_main);
    }
	

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

  //MainActivity Status
  	static boolean active = false;
  		
  	public void onStart(){
  		super.onStart();
  		active= true;
  	}
  	
  	public void onStop(){
  		super.onStop();
  		active= false;
  	}
  	
  	//check if MainActivity is Active
  	public static boolean isActive(){
  		return active;
  	}
  	
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
