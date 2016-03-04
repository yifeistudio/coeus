package com.yifeistudio.coeus.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * Location bean module.
 * Created by yi on 16-3-4.
 */

@Entity
@Table(name = "t_location")
public class Location extends CommonBean{

    private String name;
    private Double longitude;
    private Double latitude;
    private Timestamp timestamp;
    private String userId;

    public Location() {

    }

    public Location(String id, String name, Double longitude, Double latitude, Timestamp timestamp, String userId) {

        this.id = id;
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
        this.timestamp = timestamp;
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    @Column(name = "time_stamp")
    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @Column(name = "user_id")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
///~End of File.