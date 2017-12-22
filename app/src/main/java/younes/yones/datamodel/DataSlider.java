package younes.yones.datamodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by younes on 11/27/2017.
 */

public class DataSlider {

	@SerializedName("img1")
	@Expose
	private String img1;
	@SerializedName("img2")
	@Expose
	private String img2;
	@SerializedName("img3")
	@Expose
	private String img3;

	public String getImg1( ) {
		return img1;
	}

	public void setImg1( String img1 ) {
		this.img1 = img1;
	}

	public String getImg2( ) {
		return img2;
	}

	public void setImg2( String img2 ) {
		this.img2 = img2;
	}

	public String getImg3( ) {
		return img3;
	}

	public void setImg3( String img3 ) {
		this.img3 = img3;
	}
}
