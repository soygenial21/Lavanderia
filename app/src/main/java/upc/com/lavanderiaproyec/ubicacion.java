package upc.com.lavanderiaproyec;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class ubicacion extends AppCompatActivity implements OnMapReadyCallback {
GoogleMap map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubicacion);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);

        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        map = googleMap;
        map.setMapType(googleMap.MAP_TYPE_NORMAL);
        map.getUiSettings().setZoomControlsEnabled(true);
        LatLng  cuencame = new LatLng(24.8684207,-103.6972217);
        LatLng  velardeña = new LatLng(25.0635584,-103.7358951);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(cuencame, 18));

        MarkerOptions Mcuenca = new MarkerOptions().title("Tu Ubicacion").position(cuencame);
        MarkerOptions Mvelar = new MarkerOptions().title(" Velar").position(velardeña);

        map.addMarker(Mcuenca);
        map.addMarker(Mvelar);
    }
}
