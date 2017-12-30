package younes.yones.activity.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.mindorks.butterknifelite.annotations.BindView;
import com.squareup.picasso.Picasso;

import javax.inject.Inject;

import younes.yones.G;
import younes.yones.R;
import younes.yones.adapter.AdapterMain;
import younes.yones.id.component.DaggerMain2Component;
import younes.yones.id.component.Main1Component;
import younes.yones.id.module.AdapterModule;
import younes.yones.activity.main.mvp.HomeModle;
import younes.yones.activity.main.mvp.HomePersenter;
import younes.yones.activity.main.mvp.HomeView;
import younes.yones.networking.ApiService;

public class MainActivity extends AppCompatActivity {


	@BindView( R.id.rececler_main )
	RecyclerView recyclerView;


	@Inject
	Picasso picasso;


	@Inject
	AdapterMain adapterMain;


	@Inject
	Main1Component component1;


	@Inject
	ApiService service;


	private HomePersenter persenter;


	@Override
	protected void onCreate( Bundle savedInstanceState ) {
		super.onCreate( savedInstanceState );

		HomeModle modle=new HomeModle( this );
		HomeView view=new HomeView(this);

		setContentView(view);


		DaggerMain2Component.builder()
				.main1Component( G.get( this ).getComponent() )
				.adapterModule( new AdapterModule( this ) )
				.build()
				.Inject( this );



		persenter=new HomePersenter(view,modle );
		persenter.onCreate();

	}


	@Override
	protected void onDestroy( ) {
		super.onDestroy( );
		persenter.onDestory();
	}

	@Override
	public void onBackPressed( ) {
		super.onBackPressed( );
		persenter.onBack();
	}
}


















