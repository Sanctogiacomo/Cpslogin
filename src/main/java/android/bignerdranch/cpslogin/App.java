package android.bignerdranch.cpslogin;

import com.parse.Parse;

import android.app.Application;

    public class App extends Application {
        @Override
        public void onCreate() {
            super.onCreate();

            Parse.initialize(new Parse.Configuration.Builder(this)
                    .applicationId(getString(R.string.Qbs0GQODjC4ujZWbzfC8kUtYPtyQUQIq4xD7vFqf))
                    // if desired
                    .clientKey(getString(R.string.JnMUIT3SkjzdXiqqZibaFn7oetfag5hCOlRpsBFF))
                    .server("https://parseapi.back4app.com/")
                    .build()
            );
        }
    }
