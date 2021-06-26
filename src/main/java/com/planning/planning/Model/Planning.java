package com.planning.planning.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Planning {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String sujet;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date startTime;

//    @OneToMany( targetEntity=Seance.class, mappedBy="planning" )
//    private List<Seance> seances = new ArrayList<>();

    @OneToMany(mappedBy="planning")
    @JsonIgnore
    private List<Seance> seances;





    public Planning() {
    }

    public Planning(String sujet, Date startTime) {
        this.sujet = sujet;
        this.startTime = startTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public List<Seance> getSeances() {
        return seances;
    }

    public void setSeances(List<Seance> seances) {
        this.seances = seances;
    }

}
