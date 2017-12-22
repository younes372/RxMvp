package younes.yones.activities.shop.mvp;

import android.app.Activity;

/**
 * Created by younes on 12/16/2017.
 */

public class ShopModle {


	private Activity context;

	public ShopModle( Activity context  ) {
		this.context = context;
	}


	public String gitStringIntent() {
		return context.getIntent().getStringExtra("KEY");
	}




}
