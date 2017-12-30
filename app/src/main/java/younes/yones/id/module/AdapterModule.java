package younes.yones.id.module;

import dagger.Module;
import dagger.Provides;
import younes.yones.activity.main.MainActivity;
import younes.yones.id.scope.Main2Scope;

/**
 * Created by younes on 12/13/2017.
 */

@Module
public class AdapterModule {


	private MainActivity mainActivity;

	public AdapterModule( MainActivity mainActivity ) {
		this.mainActivity = mainActivity;
	}




	@Provides
	@Main2Scope
	public MainActivity activity(){
		return mainActivity;
	}


}
