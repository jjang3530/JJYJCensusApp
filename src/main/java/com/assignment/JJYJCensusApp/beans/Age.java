package com.assignment.JJYJCensusApp.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Age {
    @Id
    private int ageID;
    private int ageGroup;
    private int censusYear;
    private int geographicArea;
    private int combined;
    private int male;
    private int female;

    public int getAgeID() {
        return ageID;
    }

    public void setAgeID(int ageID) {
        this.ageID = ageID;
    }

    public int getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(int ageGroup) {
        this.ageGroup = ageGroup;
    }

    public int getCensusYear() {
        return censusYear;
    }

    public void setCensusYear(int censusYear) {
        this.censusYear = censusYear;
    }

    public int getGeographicArea() {
        return geographicArea;
    }

    public void setGeographicArea(int geographicArea) {
        this.geographicArea = geographicArea;
    }

    public int getCombined() {
        return combined;
    }

    public void setCombined(int combined) {
        this.combined = combined;
    }

    public int getFemale() {
        return female;
    }

    public void setFemale(int female) {
        this.female = female;
    }

    public int getMale() {
        return male;
    }

    public void setMale(int male) {
        this.male = male;
    }
}
