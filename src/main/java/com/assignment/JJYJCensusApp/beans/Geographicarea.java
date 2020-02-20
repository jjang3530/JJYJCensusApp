package com.assignment.JJYJCensusApp.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Geographicarea {
    @Id
    private int id;
    private String geoareaid;
    private String code;
    private String level;
    private String areaname;
    private String altCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGeoareaid() {
        return geoareaid;
    }

    public void setGeoareaid(String geoareaid) {
        this.geoareaid = geoareaid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname;
    }

    public String getAltCode() {
        return altCode;
    }

    public void setAltCode(String altCode) {
        this.altCode = altCode;
    }
}
