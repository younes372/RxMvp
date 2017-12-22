package younes.yones.id.module;

import android.content.Context;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import younes.yones.id.scope.MainScope;

/**
 * Created by younes on 12/8/2017.
 */

@Module
public class ContextModule {

	private Context context;

	public ContextModule( Context context ) {
		this.context = context.getApplicationContext();
	}

	@Provides
	@MainScope
	@Named("1")
	public Context context(){
		return context;
	}










}
