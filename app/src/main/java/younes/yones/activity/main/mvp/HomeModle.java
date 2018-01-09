package younes.yones.activity.main.mvp;

import android.content.Context;

import java.util.concurrent.Callable;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;

/**
 * Created by younes on 12/16/2017.
 */

public class HomeModle {


	private Context context;

	public HomeModle( Context context  ) {
		this.context = context;

	}


	public String y(){
			/*String d=ldsgflkdj
				.ojsdflkjds
				.sdkfhskjdahf
				.afpisduhfijsdaof
				.spoidajfivdjsi();*/
		return "younes aliabadi";
	}



	public Observable< Integer > getListIntegerha(){
		return Observable.just( 1, 2, 3 );
	}


	public Observable< Integer > getCreate(){
		return Observable.create( new ObservableOnSubscribe< Integer >( ) {
			@Override
			public void subscribe( ObservableEmitter< Integer > e ) throws Exception {
				e.onNext( 1 );
				e.onNext( 2 );
				e.onNext( 3 );
				e.onComplete();
			}
		} );
	}


	public Observable< Integer > getdefer(){
		return Observable.defer( new Callable< ObservableSource< ? extends Integer > >( ) {
			@Override
			public ObservableSource< ? extends Integer > call( ) throws Exception {
				return Observable.just( 1,2,3 );
			}
		} );
	}













}
