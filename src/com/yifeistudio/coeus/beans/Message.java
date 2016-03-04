package com.yifeistudio.coeus.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * Message module.
 * Created by yi on 16-3-4.
 */

@Entity
@Table(name = "t_message")
public class Message extends CommonBean {

    private Byte[] portrait;
    private String locationId;
    private String title;
    private Byte[] content;
    private String type;
    private Timestamp timestamp;

    public Message() {

    }

    public Message(String id, Byte[] portrait, String locationId, String title, Byte[] content, String type, Timestamp timestamp) {

        this.id = id;
        this.portrait = portrait;
        this.locationId = locationId;
        this.title = title;
        this.content = content;
        this.type = type;
        this.timestamp = timestamp;
    }


    public Byte[] getPortrait() {
        return portrait;
    }

    public void setPortrait(Byte[] portrait) {
        this.portrait = portrait;
    }

    public String getLocationId() {
        return locationId;
    }

    @Column(name = "location_id")
    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Byte[] getContent() {
        return content;
    }

    public void setContent(Byte[] content) {
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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