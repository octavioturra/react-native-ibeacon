package de.geniuxconsulting.RNBeacon

import  java.utils.HashMap;

import com.facebook.react.ReactContextBaseJavaModule;
import com.facebook.react.bridge.Callback;

public class RNBeacon extends ReactContextBaseJavaModule {
    @Override
    public String getName() {
      return "RNBeacon";
    }

    public RNBeacon(ReactApplicationContext reactContext) {
        super(reactContext);
      }

    @ReactMethod
    	public void requestAlwaysAuthorization(){

    	}

    	@ReactMethod
    	public void requestWhenInUseAuthorization(){

    	}

    	@ReactMethod
    	public void getAuthorizationStatus(Callback callback){

    	}

    	@ReactMethod
    	public void startMonitoringForRegion(Map<String, Object> dict){

    	}

    	@ReactMethod
    	public void startRangingBeaconsInRegion(Map<String, Object> dict){

    	}

    	@ReactMethod
    	public void stopMonitoringForRegion(Map<String, Object> dict){

    	}

    	@ReactMethod
    	public void stopRangingBeaconsInRegion(HashMap<String, String> dict){

    	}

    	@ReactMethod
    	public void startUpdatingLocation(){

    	}

    	@ReactMethod
    	public void stopUpdatingLocation(){

    	}
}
