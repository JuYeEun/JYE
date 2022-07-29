package com.cookandroid.jye;


import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentManager;



import com.naver.maps.geometry.LatLng;
import com.naver.maps.map.LocationTrackingMode;
import com.naver.maps.map.MapFragment;
import com.naver.maps.map.NaverMap;
import com.naver.maps.map.OnMapReadyCallback;
import com.naver.maps.map.overlay.Marker;
import com.naver.maps.map.util.FusedLocationSource;


public class MapActivity extends AppCompatActivity implements  OnMapReadyCallback{

    private static final int LOCATION_PERMISSION_REQUEST_CODE = 1000;
        private  static  final  String[] PERMISSION = {
                Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.ACCESS_COARSE_LOCATION
        };
    private NaverMap mNaverMap;
    private FusedLocationSource mLocationSource;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_activity);

        FragmentManager fm = getSupportFragmentManager();
        MapFragment mapFragment = (MapFragment) fm.findFragmentById(R.id.map);
        if (null == mapFragment) {
            mapFragment = MapFragment.newInstance();
            fm.beginTransaction().add(R.id.map, mapFragment).commit();
        }
        mapFragment.getMapAsync( this);

        mLocationSource = new FusedLocationSource(this,LOCATION_PERMISSION_REQUEST_CODE);

    }

    @Override
    public void onMapReady(@NonNull NaverMap naverMap) {
        this.mNaverMap = naverMap;
        mNaverMap.setLocationSource(mLocationSource);
        ActivityCompat.requestPermissions(this, PERMISSION,LOCATION_PERMISSION_REQUEST_CODE);

        Marker marker = new Marker();
        marker.setPosition(new LatLng(37.3595404,127.105409));
        marker.setMap(naverMap);

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

      //  if (requestCode == LOCATION_PERMISSION_REQUEST_CODE){
         //   if (!(grantResults.length <= 0) && grantResults[0] == PackageManager.PERMISSION_GRANTED){
          //      mNaverMap.setLocationTrackingMode(LocationTrackingMode.None);
          //  }
       // }


    }
}
