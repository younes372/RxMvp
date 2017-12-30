package younes.yones.activity.shop.mvp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.mindorks.butterknifelite.ButterKnifeLite;
import com.mindorks.butterknifelite.annotations.BindView;

import younes.yones.R;

/**
 * Created by younes on 12/16/2017.
 */


	public class ShopView extends FrameLayout{



		@BindView( R.id.editText )
		EditText e1;

		@BindView( R.id.textView )
		TextView tv1;

		@BindView( R.id.button2 )
		Button b1;

		public ShopView( @NonNull Context context ) {
			super( context );
			View view=inflate( context,R.layout.activity_shop,this );

			ButterKnifeLite.bind( this,view );

		}


		public void setData( String s){
			Toast.makeText( getContext(), s, Toast.LENGTH_LONG ).show( );
		}



	public void send(final setOnClick click){
		b1.setOnClickListener( new OnClickListener( ) {
			@Override
			public void onClick( View v ) {
				click.onclick();
			}
		} );
	}


	public String getEditeText( ){
		return e1.getText().toString();
	}


	public void setDataEditeText( String cat){
		tv1.setText( cat);
	}


	public interface setOnClick{
		void onclick();
	}
}
