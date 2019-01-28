<template>
  <div>
    <div>
      <label>
      <br/>
        <gmap-autocomplete @place_changed="setPlace"></gmap-autocomplete>
        <button @click="addMarker">Search in this area</button>
      </label>
      <br/>
    </div>
    <br>
    <gmap-map
      :center="center"
      :zoom="12"
      style="width:100%;  height: 400px;">
      <gmap-marker
        :key="index"
        v-for="(m, index) in markers"
        :position="m.position"
        @click="center=m.position"
      ></gmap-marker>
    </gmap-map>
  </div>
</template>

<script>
export default {
  name: "Map",
  data() {
    return {
      // default to Montreal to keep it simple
      // change this to whatever makes sense
      center: { lat: 18.7821014, lng: 99.0148274 },
      markers: [{
                        latitude: 18.7821014,
                        longitude: 99.0148274
               },{

                        latitude: 18.769368,
                        longitude: 98.9781366
               }],
      places: [],
      currentPlace: null
    };
  },

  mounted() {
    this.geolocate();
  },

  methods: {
    // receives a place object via the autocomplete component
    setPlace(place) {
      this.currentPlace = place;
    },
    addMarker() {
      if (this.currentPlace) {
        const marker = {
          lat: this.currentPlace.geometry.location.lat(),
          lng: this.currentPlace.geometry.location.lng()
        };
        this.markers.push({ position: marker });
        this.places.push(this.currentPlace);
        this.center = marker;
        this.currentPlace = null;
      }
    },
    geolocate: function() {
      navigator.geolocation.getCurrentPosition(position => {
        this.center = {
          lat: position.coords.latitude,
          lng: position.coords.longitude
        };
      });
    }
  }
};
</script>