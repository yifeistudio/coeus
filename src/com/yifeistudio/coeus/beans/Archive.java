package com.yifeistudio.coeus.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * Archive bean module.
 * Created by yi on 16-3-4.
 */

@Entity
@Table(name = "t_archive")
public class Archive extends CommonBean{

    private String userId;
    private String locationId;
    private Timestamp timestamp;

    public Archive() {

    }

    public Archive(String id, String userId, String locationId, Timestamp timestamp) {
        this.id = id;
        this.userId = userId;
        this.locationId = locationId;
        this.timestamp = timestamp;
    }

    @Column(name = "user_id")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Column(name = "location_id")
    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    @Column(name = "time_stamp")
    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
///~End of File.