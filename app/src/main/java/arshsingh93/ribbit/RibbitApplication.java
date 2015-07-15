package arshsingh93.ribbit;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by Student on 7/14/2015.
 */
public class RibbitApplication extends Application{

    @Override
    public void onCreate(){
        super.onCreate();
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "2i0CNaI5uozJ7BCGXMpfr1yucrJkYlPpg207wM4N",
                "WtMn4uEQKXobFnNYasRsPKtiADfiyS9AVtE5gKQ6");

    }













}
