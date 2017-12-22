package younes.yones.id.module;

import android.app.Activity;
import android.content.Context;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import younes.yones.id.scope.MainScope;

/**
 * Created by younes on 12/8/2017.
 */

@Module
public class Context2Module {

	private Context context;

	public Context2Module( Activity context ) {
		this.context = context;
	}

	@Provides
	@MainScope
	@Named("2")
	public Context context(){
		return context;
	}










}
