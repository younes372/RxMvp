package younes.yones.activity.main.mvp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.jakewharton.rxbinding2.view.RxView;
import com.mindorks.butterknifelite.ButterKnifeLite;
import com.mindorks.butterknifelite.annotations.BindView;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableObserver;
import younes.yones.R;
import younes.yones.activity.shop.ShopActivity;

/**
 * Created by younes on 12/16/2017.
 */


public class HomeView extends FrameLayout  {


	@BindView( R.id.rececler_main )
	RecyclerView recyclerView;

	@BindView( R.id.button )
	Button b;


	@BindView( R.id.click )
	Button click;


	public HomeView( @NonNull Context context ) {
		super( context );
		View view = inflate( context, R.layout.activity_main, this );

		ButterKnifeLite.bind( this, view );


		disposableObserver().dispose();
	}




	public Observable<Object> onClickButton( ) {
		return RxView.clicks( click );
	}


	public Observer< Integer > observer( ) {
		return new Observer< Integer >( ) {
			@Override
			public void onSubscribe( Disposable d ) {


			}
			@Override
			public void onNext( Integer integer ) {
				Toast.makeText( getContext(), integer + "", Toast.LENGTH_SHORT ).show( );
			}
			@Override
			public void onError( Throwable e ) {

			}

			@Override
			public void onComplete( ) {

			}
		};
	}

	public DisposableObserver< Integer > disposableObserver( ) {
		return new DisposableObserver< Integer >( ) {
			@Override
			public void onNext( Integer integer ) {

			}

			@Override
			public void onError( Throwable e ) {

			}

			@Override
			public void onComplete( ) {

			}
		};
	}
















	public void onClickButton( final String s ) {
		b.setOnClickListener( new OnClickListener( ) {
			@Override
			public void onClick( View v ) {
				ShopActivity.start( getContext( ), s );

			}
		} );
	}


}
