package younes.yones.activity.main.mvp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.mindorks.butterknifelite.ButterKnifeLite;
import com.mindorks.butterknifelite.annotations.BindView;

import younes.yones.R;
import younes.yones.activity.shop.ShopActivity;

/**
 * Created by younes on 12/16/2017.
 */


	public class HomeView extends FrameLayout{


	@BindView( R.id.rececler_main )
	RecyclerView recyclerView;

	@BindView( R.id.button )
	Button b;



		public HomeView( @NonNull Context context ) {
			super( context );
			View view=inflate( context,R.layout.activity_main,this );

			ButterKnifeLite.bind( this,view );


		}


		public void onClickButton(final String s){
			b.setOnClickListener( new OnClickListener( ) {
				@Override
				public void onClick( View v ) {
					ShopActivity.start( getContext(),s );

				}
			} );
		}


}
