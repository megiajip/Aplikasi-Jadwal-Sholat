package com.example.jadwalsholat.models;

public class MuslimLocation {
    /** List of available modes for Muslim location */
    public enum MODE {
        MODE_PROVIDER,
        MODE_MANUAL
    }

    /** The latitude of the location */
    private double locationLatitude;

    /** The longitude of the location */
    private double locationLongitude;

    /** The microtime when the location has been performed */
    private long locationTime;

    /** The mode (manual or from provider) of the location) */
    private MODE locationMode;

    /**
     * Instantiates a new MuslimLocation
     * @param locationLatitude the latitude of the location to set
     * @param locationLongitude the longitude of the location to set
     * @param locationTime the microtime when the location has been performed to set
     * @param locationMode the mode (manual or from provider) of the location
     */
    public MuslimLocation(double locationLatitude, double locationLongitude, long locationTime, MODE locationMode){
        this.setLocationLatitude(locationLatitude);
        this.setLocationLongitude(locationLongitude);
        this.setLocationTime(locationTime);
        this.setLocationMode(locationMode);
    }

    /**
     * Instantiates a new MuslimLocation
     * @param locationLatitude the latitude of the location to set
     * @param locationLongitude the longitude of the location to set
     * @param locationTime the microtime when the location has been performed to set
     * @param locationModeInt the integer value of the mode of the location
     */
    public MuslimLocation(double locationLatitude, double locationLongitude, long locationTime, int locationModeInt){
        this.setLocationLatitude(locationLatitude);
        this.setLocationLongitude(locationLongitude);
        this.setLocationTime(locationTime);
        this.setLocationModeWithInt(locationModeInt);
    }

    /**
     * Returns the latitude of the location.
     * @return the latitude of the location
     */
    public double getLocationLatitude() {
        return locationLatitude;
    }

    /**
     * Returns the longitude of the location.
     * @return the longitude of the location
     */
    public double getLocationLongitude() {
        return locationLongitude;
    }

    /**
     * Returns the microtime when the location has been performed.
     * @return the microtime when the location has been performed
     */
    public long getLocationTime() {
        return locationTime;
    }

    /**
     * Returns the mode (manual or from provider) of the location.
     * @return the mode (manual or from provider) of the location
     */
    public MODE getLocationMode() {
        return locationMode;
    }

    /**
     * Returns the integer associated to the current mode.
     * @return the integer associated to the current mode
     */
    public int getLocationModeInt(){
        switch(this.locationMode){
            case MODE_PROVIDER:
                return 0;
            case MODE_MANUAL:
                return 1;
            default:
                return -1;
        }
    }

    /**
     * Sets the latitude of the location.
     * @param locationLatitude the latitude of the location to set
     */
    public void setLocationLatitude(double locationLatitude) {
        this.locationLatitude = locationLatitude;
    }

    /**
     * Sets the longitude of the location.
     * @param locationLongitude the longitude of the location to set
     */
    public void setLocationLongitude(double locationLongitude) {
        this.locationLongitude = locationLongitude;
    }

    /**
     * Sets the microtime when the location has been performed.
     * @param locationTime the microtime when the location has been performed to set
     */
    public void setLocationTime(long locationTime) {
        this.locationTime = locationTime;
    }

    /**
     * Sets the mode (manual or from provider) of the location.
     * @param locationMode the mode (manual or from provider) of the location
     */
    public void setLocationMode(MODE locationMode) {
        this.locationMode = locationMode;
    }

    /**
     * Sets the mode (manual or from provider) of the location from its integer value
     * @param locationModeInt the integer value of the mode of the location
     */
    public void setLocationModeWithInt(int locationModeInt){
        switch (locationModeInt){
            case 0:
                this.locationMode = MODE.MODE_PROVIDER;
                break;
            case 1:
                this.locationMode = MODE.MODE_MANUAL;
                break;
            default:
                this.locationMode = null;
                break;
        }
    }
}
