package younes.yones.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import younes.yones.MainActivity;
import younes.yones.R;
import younes.yones.datamodel.DataSlider;

/**
 * Created by Saeed shahini on 9/9/2016.
 */
public class AdapterMain extends RecyclerView.Adapter< RecyclerView.ViewHolder > {

	private MainActivity context;
	private Picasso picasso;

	private List< DataSlider > data = new ArrayList<>( );


	@Inject
	public AdapterMain( MainActivity context, Picasso picasso ) {
		this.context = context;
		this.picasso = picasso;
	}

	public void setdata( List< DataSlider > data ) {
		this.data = data;

	}


	@Override
	public viewHolderB onCreateViewHolder( ViewGroup parent, int viewType ) {
		View v = LayoutInflater.from( parent.getContext( ) ).inflate( R.layout.row, parent, false );
		viewHolderB holder = new viewHolderB( v );
		return holder;
	}


	@Override
	public void onBindViewHolder( RecyclerView.ViewHolder holder, int position ) {

	}


	@Override
	public void onAttachedToRecyclerView( RecyclerView recyclerView ) {
		super.onAttachedToRecyclerView( recyclerView );
	}


	@Override
	public int getItemCount( ) {
		return data.size( );

	}


	public class viewHolderB extends RecyclerView.ViewHolder {


		public viewHolderB( final View itemView ) {
			super( itemView );

		}


	}


	@Override
	public int getItemViewType( int position ) {
		return super.getItemViewType( position );
	}


}




