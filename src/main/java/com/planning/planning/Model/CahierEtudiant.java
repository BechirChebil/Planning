package com.planning.planning.Model;

import javax.persistence.*;

@Entity
public class CahierEtudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    //@JoinColumn(name = "id", referencedColumnName = "id")
    private Planning planning;

    @OneToOne
    //@JoinColumn(name = "activite_id", referencedColumnName = "id")
    private Activite activite;



    public CahierEtudiant() {
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Planning getPlanning() {
        return planning;
    }

    public void setPlanning(Planning planning) {
        this.planning = planning;
    }

    public Activite getActivite() {
        return activite;
    }

    public void setActivite(Activite activite) {
        this.activite = activite;
    }
}
