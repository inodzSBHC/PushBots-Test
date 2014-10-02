package id.rajamakan;
import com.pushbots.push.Pushbots;
import android.app.Application;
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Pushbots.init(this, "GCM SENDER ID","APP ID");
		// set custom PushHandler
        Pushbots.getInstance().setMsgReceiver(customHandler.class);
     }
 }