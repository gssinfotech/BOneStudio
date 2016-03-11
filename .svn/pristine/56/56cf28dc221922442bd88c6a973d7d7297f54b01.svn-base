package com.gssinfotech.bone.mydevices;

import com.gssinfotech.bone.R;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

public class MydevicesColorSelectionActivity extends Activity {

	ViewPager viewPager;
	PagerAdapter adapter;
	int[] colorselections;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_mydevices_color_selection);
			
			colorselections = new int[] { R.drawable.mydevices_color1, R.drawable.mydevices_color2,
					R.drawable.mydevices_color3};
			
			viewPager = (ViewPager) findViewById(R.id.mydevices_colorseletion_viewpager);
			adapter = new MydevicesColorPagerAdapter(MydevicesColorSelectionActivity.this, colorselections);
			viewPager.setAdapter(adapter);
	}
}
