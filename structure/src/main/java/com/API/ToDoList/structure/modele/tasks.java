package com.API.ToDoList.structure.modele;

import jakarta.persistence.*;
import org.springframework.lang.NonNull;
import org.w3c.dom.Text;

import java.util.Date;

//class correspoandant a la table tasks
@Entity
public class tasks {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

@Column(nullable = false)
private String title;

private String description;

private Date due_date;

@Column(nullable = false)
private boolean status = false; // Par défaut "en cours" (false)


    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false, updatable = false)
    private Date created_at;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updated_at;


    // PrePersist pour créer la date au moment de la creation automatiquement avec
    @PrePersist
    public void onCreate() {
        created_at = new Date();
        updated_at = new Date();
    }

    // PreUpdate pour attribuer la date de mise a jour a la date actuel automatiquement
    @PreUpdate
    public void onUpdate() {
        updated_at = new Date();
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDue_date() {
        return due_date;
    }

    public void setDue_date(Date due_date) {
        this.due_date = due_date;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public tasks() {
    }
}
