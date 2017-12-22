package younes.yones;

import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;

import younes.yones.id.component.DaggerMain1Component;
import younes.yones.id.component.Main1Component;
import younes.yones.id.module.ApiServiceMoldule;
import younes.yones.id.module.ContextModule;
import younes.yones.id.module.PiassoModule;


/**
 * Created by younes on 11/25/2017.
 */

public class G extends Application {
	private static Typeface iranianSansFont;

	Context context;
	private Main1Component component;


	@Override
	public void onCreate( ) {
		super.onCreate( );
		context = getApplicationContext( );

		 component= DaggerMain1Component.builder()
				.contextModule( new ContextModule( this ) )
				.apiServiceMoldule( new ApiServiceMoldule() )
				.piassoModule( new PiassoModule() )
				.build();

	}

	public Main1Component getComponent(){
		return component;
	}


	public Context getcontext( ) {
		return context;
	}


	public static G get( AppCompatActivity activity ) {
		return ( G ) activity.getApplication( );
	}




}

