package younes.yones.id.module;

import android.content.Context;

import java.io.File;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import younes.yones.common.Confing;
import younes.yones.id.one;
import younes.yones.id.scope.MainScope;
import younes.yones.id.two;
import younes.yones.networking.ApiService;

/**
 * Created by younes on 12/8/2017.
 */

@Module(includes = ContextModule.class)
public class ApiServiceMoldule {


	@Provides
	@MainScope
	public ApiService getApiService(@one Retrofit retrofit) {
		return  retrofit.create(ApiService.class);
	}


	@Provides
	@MainScope
	@one
	public Retrofit getRetrofit( OkHttpClient client){
		return new Retrofit.Builder()
				.baseUrl( Confing.URL1 )
				.client( client )
				.addConverterFactory( GsonConverterFactory.create() )
				.build();
	}

	@Provides
	@MainScope
	@two
	public Retrofit getRetrofit2( OkHttpClient client){
		return new Retrofit.Builder()
				.baseUrl( Confing.URL2 )
				.client( client )
				.addConverterFactory( GsonConverterFactory.create() )
				.build();
	}


	@Provides
	@MainScope
	public OkHttpClient getClient( Cache cache){
		return new OkHttpClient.Builder()
				.cache( cache )
				.build();
	}


	@Provides
	@MainScope
	public Cache cache( File file){
		return new Cache( file,5*1000*1000 );//5M
	}



	@Provides
	@MainScope
	public File file(@Named("1") Context context){
		return  new File( context.getCacheDir(),"okhttp_cache" );
	}














}
