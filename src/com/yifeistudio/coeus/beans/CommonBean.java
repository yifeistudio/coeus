package com.yifeistudio.coeus.beans;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Common bean module.
 * Created by yi on 16-3-4.
 */

@MappedSuperclass
public abstract class CommonBean {

    protected String id;

    public CommonBean() {}

    public CommonBean(String id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
///~End of File.