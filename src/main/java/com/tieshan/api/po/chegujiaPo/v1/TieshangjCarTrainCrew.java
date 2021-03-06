package com.tieshan.api.po.chegujiaPo.v1;

import java.io.Serializable;
import java.util.Date;

public class TieshangjCarTrainCrew implements Serializable {
    private Integer id;

    private String tName;

    private Integer vehiceSystemId;

    private String createdBy;

    private Date createdTime;

    private String updatedBy;

    private Date updatedTime;

    private TieshangjCarAutoLogos tieshangjCarAutoLogos;

    private TieshangjCarBrand tieshangjCarBrand;

    private TieshangjCarVehicleSystem tieshangjCarVehicleSystem;



    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }

    public Integer getVehiceSystemId() {
        return vehiceSystemId;
    }

    public void setVehiceSystemId(Integer vehiceSystemId) {
        this.vehiceSystemId = vehiceSystemId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public TieshangjCarAutoLogos getTieshangjCarAutoLogos() {
        return tieshangjCarAutoLogos;
    }

    public void setTieshangjCarAutoLogos(TieshangjCarAutoLogos tieshangjCarAutoLogos) {
        this.tieshangjCarAutoLogos = tieshangjCarAutoLogos;
    }

    public TieshangjCarBrand getTieshangjCarBrand() {
        return tieshangjCarBrand;
    }

    public void setTieshangjCarBrand(TieshangjCarBrand tieshangjCarBrand) {
        this.tieshangjCarBrand = tieshangjCarBrand;
    }

    public TieshangjCarVehicleSystem getTieshangjCarVehicleSystem() {
        return tieshangjCarVehicleSystem;
    }

    public void setTieshangjCarVehicleSystem(TieshangjCarVehicleSystem tieshangjCarVehicleSystem) {
        this.tieshangjCarVehicleSystem = tieshangjCarVehicleSystem;
    }


}