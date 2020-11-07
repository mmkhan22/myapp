package com.myfirstapp.myapp.Models;

import javax.persistence.*;


@Entity
@Table(name = "events")

public class Events{

    @Id

    @Column(name = "id")
    private String id;
    /*
    @Column(name = "name")
    private String name;

    */

    @Column(name = "description")
    private String description;
    @Column(name = "speaker")
    private String speaker;
    @Column(name = "startDate")
    private String startdate;
    @Column(name = "endDate")
    private String enddate;

    public Events()
    {

    }
    public Events(String description,String speaker, String startDate, String endDate) {
        //this.name = name;
        this.id = id;
        this.description = description;
        //this.speaker = speaker;
        this.startdate = startDate;
        this.enddate = endDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
/*
    public String getName() {
        return name;
    }

    public void setFirstName(String name) {
        this.name = name;
    }

 */

    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    public String getSpeaker(){
        return speaker;
    }
    public void setSpeaker(String speaker){
        this.speaker = speaker;
    }


    public String getStartDate(){
        return startdate;
    }
    public void setStartDate(String startDate){
        this.startdate = startDate;
    }

    public String getEndDate(){
        return enddate;
    }
    public void setEndDate(String endDate){
        this.enddate = endDate;
    }

}
