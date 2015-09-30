package tanalytics.stormy.ui;

import android.app.ListActivity;
import android.os.Bundle;

import tanalytics.stormy.R;
import tanalytics.stormy.adapters.DayAdapter;
import tanalytics.stormy.weather.Day;

public class DailyForecastActivity extends ListActivity {

    private Day[] mDays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_forecast);

        DayAdapter adapter = new DayAdapter(this,mDays);
    }


}
