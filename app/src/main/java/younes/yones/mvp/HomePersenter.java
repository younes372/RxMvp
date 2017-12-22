package younes.yones.mvp;


/**
 * Created by younes on 12/16/2017.
 */

public class HomePersenter   {

	private HomeView view;
	private HomeModle modle;

	public HomePersenter( HomeView view, HomeModle modle ) {
		this.view = view;
		this.modle = modle;
	}


	public void onCreate( ) {
		setDataClick();
	}


	public void onPause( ) {

	}

	public void onResume( ) {

	}

	public void onDestory( ) {

	}

	public void onBack( ) {

	}


	public void setDataClick(){
		view.onClickButton( modle.y());
	}







}
