package younes.yones.networking;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import younes.yones.datamodel.DataSlider;

/**
 * Created by younes on 12/7/2017.
 */

public interface ApiService {

	@GET("getslider.php")
	Call<List<DataSlider > > getSlider( );




}
