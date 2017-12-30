package younes.yones.activity.shop.mvp;

import android.app.Activity;

import younes.yones.common.Confing;

/**
 * Created by younes on 12/16/2017.
 */

public class ShopModle {


	private Activity context;

	public ShopModle( Activity context  ) {
		this.context = context;
	}


	public String gitStringIntent() {
		return context.getIntent().getStringExtra( Confing.KEY);
	}


	public String getDataNet(String cat){
		return cat+"";
	}




}
