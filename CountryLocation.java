
package com.htchanger.gps;

import java.util.HashMap;
import java.util.Map;
import com.google.android.gms.maps.model.LatLng;

public class CountryLocation {
    public static Map<String, LatLng> getData() {
        Map<String, LatLng> countries = new HashMap<>();
        countries.put("United States", new LatLng(34.052235, -118.243683));
        countries.put("Japan", new LatLng(35.6895, 139.6917));
        countries.put("Vietnam", new LatLng(21.0285, 105.8542));
        countries.put("Germany", new LatLng(52.52, 13.4050));
        return countries;
    }
}
