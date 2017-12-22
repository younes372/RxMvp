package younes.yones.id.component;

import com.squareup.picasso.Picasso;

import dagger.Component;
import younes.yones.id.module.ApiServiceMoldule;
import younes.yones.id.module.Context2Module;
import younes.yones.id.module.PiassoModule;
import younes.yones.id.scope.MainScope;
import younes.yones.networking.ApiService;

/**
 * Created by younes on 12/8/2017.
 */

@MainScope
@Component(modules = {
		ApiServiceMoldule.class,
		PiassoModule.class,
		Context2Module.class})

public interface Main1Component {

	ApiService getApiService();

	Picasso getpicasso();























}
