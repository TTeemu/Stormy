package tanalytics.stormy.ui;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;

import java.util.Arrays;

import tanalytics.stormy.R;
import tanalytics.stormy.adapters.DayAdapter;
import tanalytics.stormy.weather.Day;

public class DailyForecastActivity extends ListActivity {

    private Day[] mDays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_forecast);

        Intent intent = getIntent();
        Parcelable[] parcelables = intent.getParcelableArrayExtra(MainActivity.DAILY_FORECAST);
        mDays = Arrays.copyOf(parcelables,parcelables.length,Day[].class);

        DayAdapter adapter = new DayAdapter(this,mDays);
    }


}
