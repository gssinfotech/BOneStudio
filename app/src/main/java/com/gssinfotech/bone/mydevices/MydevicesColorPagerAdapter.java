package com.gssinfotech.bone.mydevices;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;


public class MydevicesColorPagerAdapter extends PagerAdapter{

	Context context;
	int[] colorselections;
	public MydevicesColorPagerAdapter(Context context,int[] colorselections){
		this.context =context;
		this.colorselections =colorselections;
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return colorselections.length;
	}

	@Override
	public boolean isViewFromObject(View view, Object object) {
		// TODO Auto-generated method stub
		return view == ((ImageView) object);
		
		
	}
   
    @Override
    public Object instantiateItem(View container, int position) {
    	// TODO Auto-generated method stub
    	ImageView imageview = new ImageView(context);
    	imageview.setImageResource(colorselections[position]);
    	 ((ViewPager) container).addView(imageview, 0);
    	 
	     return imageview;

    }
    
    @Override
    public void destroyItem(View container, int position, Object object) {
    	
    	((ViewPager) container).removeView((ImageView) object);

    }
}
