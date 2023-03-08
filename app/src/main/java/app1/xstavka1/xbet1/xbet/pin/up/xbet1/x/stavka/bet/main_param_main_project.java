package app1.xstavka1.xbet1.xbet.pin.up.xbet1.x.stavka.bet;

import android.app.Application;

import com.onesignal.OneSignal;
import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.YandexMetricaConfig;

public class main_param_main_project extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        try{

            // Creating an extended library configuration.
            YandexMetricaConfig config = YandexMetricaConfig.newConfigBuilder(stat_main_project.APPMETRICA_KEY).build();
            // Initializing the AppMetrica SDK.
            YandexMetrica.activate(getApplicationContext(), config);
            // Automatic tracking of user activity.
            YandexMetrica.enableActivityAutoTracking(this);


            // Enable verbose OneSignal logging to debug issues if needed.
            OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);

            // OneSignal Initialization
            OneSignal.initWithContext(this);
            OneSignal.setAppId(stat_main_project.ONESIGNAL_KEY);

        } catch (Exception e){

        }

    }
}
