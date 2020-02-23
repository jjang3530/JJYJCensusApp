package com.assignment.JJYJCensusApp.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Geographicarea {
    @Id
    private int geographicAreaID;
    private String code;
    private String level;
    private String name;
    private String altCode;

    public int getGeographicAreaID() {
        return geographicAreaID;
    }

    public void setGeographicAreaID(int geographicAreaID) {
        this.geographicAreaID = geographicAreaID;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAltCode() {
        return altCode;
    }

    public void setAltCode(String altCode) {
        this.altCode = altCode;
    }
}
