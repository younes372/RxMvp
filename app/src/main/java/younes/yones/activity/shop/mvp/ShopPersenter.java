package younes.yones.activity.shop.mvp;


/**
 * Created by younes on 12/16/2017.
 */

public class ShopPersenter {

	private ShopView view;
	private ShopModle modle;

	public ShopPersenter( ShopView view, ShopModle modle ) {
		this.view = view;
		this.modle = modle;
	}


	public void onCreate( ) {
		setDataIntent();
		setDataNet();
	}


	public void onPause( ) {

	}

	public void onResume( ) {

	}

	public void onDestory( ) {

	}

	public void onBack( ) {

	}



	public void setDataIntent(){
		view.setData( modle.gitStringIntent() );
	}

	public void setDataNet(){
		view.send( new ShopView.setOnClick( ) {
			@Override
			public void onclick( ) {
				view.setDataEditeText( modle.getDataNet( view.getEditeText() ) );
			}
		} );


	}







}
