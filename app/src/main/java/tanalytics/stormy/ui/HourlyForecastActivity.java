package tanalytics.stormy.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Arrays;

import butterknife.Bind;
import butterknife.ButterKnife;
import tanalytics.stormy.R;
import tanalytics.stormy.adapters.HourAdapter;
import tanalytics.stormy.weather.Hour;

public class HourlyForecastActivity extends Activity {

    private Hour[] mHours;

    @Bind(R.id.recyclerView) RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hourly_forecast);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        Parcelable[] parcelables = intent.getParcelableArrayExtra(MainActivity.HOURLY_FORECAST);
        mHours = Arrays.copyOf(parcelables,parcelables.length, Hour[].class);

        HourAdapter adapter = new HourAdapter(mHours);
        mRecyclerView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);

        mRecyclerView.setHasFixedSize(true);
    }


}
