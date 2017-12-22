package younes.yones.id.component;

import dagger.Component;
import younes.yones.MainActivity;
import younes.yones.id.module.AdapterModule;
import younes.yones.id.scope.Main2Scope;

/**
 * Created by younes on 12/13/2017.
 */

@Main2Scope
@Component(modules = {AdapterModule.class},dependencies = Main1Component.class)
public interface Main2Component {

	/*AdapterMain getAdapterMain();

	Main1Component getMain1Component();*/

	void Inject( MainActivity mainActivity);


}
