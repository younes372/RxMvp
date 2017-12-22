package younes.yones.activities.shop.mvp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.mindorks.butterknifelite.ButterKnifeLite;

import younes.yones.R;

/**
 * Created by younes on 12/16/2017.
 */


	public class ShopView extends FrameLayout{




		public ShopView( @NonNull Context context ) {
			super( context );
			View view=inflate( context,R.layout.activity_shop,this );

			ButterKnifeLite.bind( this,view );


		}


		public void setData( String s){
			Toast.makeText( getContext(), s, Toast.LENGTH_LONG ).show( );
		}


}
