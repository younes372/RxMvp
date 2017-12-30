package younes.yones.activity.shop;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import younes.yones.activity.shop.mvp.ShopModle;
import younes.yones.activity.shop.mvp.ShopPersenter;
import younes.yones.activity.shop.mvp.ShopView;
import younes.yones.common.Confing;

public class ShopActivity extends AppCompatActivity {


	public static void start( Context context,String s) {
		Intent intent = new Intent(context, ShopActivity.class);
		intent.putExtra( Confing.KEY, s);
		context.startActivity(intent);
	}



	private ShopPersenter persenter;


	@Override
	protected void onCreate( Bundle savedInstanceState ) {
		super.onCreate( savedInstanceState );

		ShopModle modle=new ShopModle( this );
		ShopView view=new ShopView(this);

		setContentView(view);



		persenter=new ShopPersenter(view,modle );
		persenter.onCreate();

	}


	@Override
	protected void onDestroy( ) {
		super.onDestroy( );
		persenter.onDestory();
	}

	@Override
	public void onBackPressed( ) {
		super.onBackPressed( );
		persenter.onBack();
	}
}


















