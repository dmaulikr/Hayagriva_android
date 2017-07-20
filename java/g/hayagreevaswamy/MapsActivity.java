package g.hayagreevaswamy;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private int temp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


    }



    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        Bundle extras = getIntent().getExtras();
        if (extras != null)
            temp = extras.getInt("d");
        if (temp == 0)
        {// Add a marker in Sydney and move the camera
            final LatLng yadgirigutta = new LatLng(17.588993, 78.943777);
            mMap.addMarker(new MarkerOptions().position(yadgirigutta).title("Marker in Yadgirigutta"));
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(yadgirigutta,10.2f));
        }
        else if (temp == 1) {
            final LatLng PATHAGUTTA = new LatLng(17.587198, 78.929574);
            mMap.addMarker(new MarkerOptions().position(PATHAGUTTA).title("Marker in  PATHAGUTTA"));
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(PATHAGUTTA,10.2f));
            mMap.setMaxZoomPreference(10);
        }
        else if (temp == 2) {
            final LatLng SURENDRAPURI = new LatLng(17.564988, 78.945310);
            mMap.addMarker(new MarkerOptions().position(SURENDRAPURI).title("Marker in  SURENDRAPURI "));
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(SURENDRAPURI,10.2f));
        }
        else if (temp == 3) {
            final LatLng BHONGIRFORT = new LatLng(17.515782, 78.892518);
            mMap.addMarker(new MarkerOptions().position(BHONGIRFORT).title("Marker in  BHONGIRFORT "));
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(BHONGIRFORT,10.2f));
        }
      /* /* mMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
            @Override
            public void onInfoWindowClick(Marker marker) {
                /*Intent intent=new Intent(getApplicationContext(),MainActivity.class);

                startActivity(intent);*/
       /* });*/



    }
}







