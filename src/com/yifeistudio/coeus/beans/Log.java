package com.yifeistudio.coeus.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * Log bean module.
 * Created by yi on 16-3-4.
 */
@Entity
@Table(name = "t_log")
public class Log extends CommonBean {

    private String executer;
    private String event;
    private Timestamp timestamp;

    public Log() {

    }

    public Log(String id, String executer, String event, Timestamp timestamp) {
        this.id = id;
        this.executer = executer;
        this.event = event;
        this.timestamp = timestamp;
    }

    public String getExecuter() {
        return executer;
    }

    public void setExecuter(String executer) {
        this.executer = executer;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
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