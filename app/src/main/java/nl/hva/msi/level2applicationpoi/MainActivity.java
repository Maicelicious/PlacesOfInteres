package nl.hva.msi.level2applicationpoi;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements RecyclerView.OnItemTouchListener {

    List<GeoObject> geoObjects;
    private GestureDetector gestureDetector;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        geoObjects = new ArrayList<>();

        for (int i = 0; i < GeoObject.PRE_DEFINED_GEO_OBJECT_NAMES.length; i++) {
            geoObjects.add(new GeoObject(GeoObject.PRE_DEFINED_GEO_OBJECT_NAMES[i], GeoObject.PRE_DEFINED_GEO_OBJECT_IMAGE_IDS[i]));
        }

        final RecyclerView geoRecyclerView = findViewById(R.id.recyclerView);

        RecyclerView.LayoutManager recycleViewLayoutManager = new StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL);

        geoRecyclerView.setLayoutManager(recycleViewLayoutManager);
        geoRecyclerView.setHasFixedSize(true);
        GeoObjectAdapter geoObjectAdapter = new GeoObjectAdapter(this, geoObjects);
        geoRecyclerView.setAdapter(geoObjectAdapter);
        geoRecyclerView.addOnItemTouchListener(this);

        gestureDetector = new GestureDetector(this, new GestureDetector.SimpleOnGestureListener() {
            @Override
            public boolean onSingleTapUp(MotionEvent e) {
                return true;
            }
        });
    }





    @Override
    public boolean onInterceptTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        View child = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
        int adapterPostition = recyclerView.getChildAdapterPosition(child);
        if (child != null && gestureDetector.onTouchEvent(motionEvent)){
            Toast.makeText(this, geoObjects.get(adapterPostition).getGeoImageName(), Toast.LENGTH_SHORT).show();
        }
        return false;
    }

    @Override
    public void onTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {

    }

    @Override
    public void onRequestDisallowInterceptTouchEvent(boolean b) {

    }
}
