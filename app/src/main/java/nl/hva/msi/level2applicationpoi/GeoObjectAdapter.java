package nl.hva.msi.level2applicationpoi;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class GeoObjectAdapter extends RecyclerView.Adapter<GeoObjectViewHolder> {

    private Context context;

    public List<GeoObject> listGeoObject;

    public GeoObjectAdapter(Context context, List<GeoObject> listGeoObject) {

        this.context = context;

        this.listGeoObject = listGeoObject;

    }


    @NonNull
    @Override
    public GeoObjectViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.grid_cell, viewGroup, false);
        return new GeoObjectViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GeoObjectViewHolder geoObjectViewHolder, int i) {
        final GeoObject geoObject = listGeoObject.get(i);
        geoObjectViewHolder.geoImage.setImageResource(geoObject.getGeoImageName());
    }

    @Override
    public int getItemCount() {
        return listGeoObject.size();
    }
}
