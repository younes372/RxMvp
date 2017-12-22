package younes.yones.id.module;

import android.content.Context;

import com.jakewharton.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import younes.yones.id.scope.MainScope;

/**
 * Created by younes on 12/8/2017.
 */

@Module(includes = {ApiServiceMoldule.class,ContextModule.class})
public class PiassoModule {



	@Provides
	@MainScope
public Picasso picasso( OkHttp3Downloader downloader,@Named("1") Context context){
	return  new Picasso.Builder( context )
			.downloader(downloader)
			.build();
}


	@Provides
	@MainScope
	public OkHttp3Downloader okHttp3Downloader( OkHttpClient client){
		return  new OkHttp3Downloader( client );
	}







}



















