package arshsingh93.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by Student on 7/14/2015.
 */
public class RibbitApplication extends Application{

    @Override
    public void onCreate(){
        super.onCreate();
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "OvaAJNmtL8azu4qpxbMyd4tXDVr8NYqJSSMnzeJ1",
                "J1IfxTcTET9cq4aabh8DEhh45RG8k6RvAxFGeBdi");

    }









}
