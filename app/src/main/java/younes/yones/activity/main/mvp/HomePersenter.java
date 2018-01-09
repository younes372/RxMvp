package younes.yones.activity.main.mvp;


import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Function;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by younes on 12/16/2017.
 */

public class HomePersenter {

	private HomeView view;
	private HomeModle modle;

	private CompositeDisposable disposable=new CompositeDisposable(  );


	public HomePersenter( HomeView view, HomeModle modle ) {
		this.view = view;
		this.modle = modle;
	}


	public void onCreate( ) {
		setDataClick( );

		disposable.add( DisposableObserver() );
		//disposable.add( setCreate() );
		//disposable.add( setDefer() );

	}


	public void onPause( ) {

	}

	public void onResume( ) {

	}

	public void onDestory( ) {
		disposable.dispose();
	}


	public void onBack( ) {


	}


	public void setDataClick( ) {
		view.onClickButton( modle.y( ) );
	}


	public DisposableObserver DisposableObserver( ) {
		return view.onClickButton( )
				.subscribeOn( Schedulers.trampoline( ) )
				.observeOn( AndroidSchedulers.mainThread( ) )
				.switchMap( new Function< Object, Observable< Integer > >( ) {
					@Override
					public Observable< Integer > apply( Object o ) throws Exception {
						return modle.getListIntegerha( );
					}
				} )
				.subscribeWith( view.disposableObserver());

	}


	public DisposableObserver setCreate( ) {
		return modle.getCreate()
				.subscribeWith( view.disposableObserver() );
	}


	public DisposableObserver setDefer( ) {
		return modle.getdefer()
				.subscribeWith( view.disposableObserver() );

	}


}
