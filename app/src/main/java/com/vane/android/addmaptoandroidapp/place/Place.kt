package com.vane.android.addmaptoandroidapp.place

import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.clustering.ClusterItem

// All objects that represent a clusterable marker on the map need to implement
// the ClusterItem interface. In your case, that means that the Place model needs to
// conform to ClusterItem.
data class Place(
    val name: String,
    val latLng: LatLng,
    val address: String,
    val rating: Float
) : ClusterItem {
    override fun getPosition(): LatLng = latLng

    override fun getTitle(): String = name

    override fun getSnippet(): String = address

}
