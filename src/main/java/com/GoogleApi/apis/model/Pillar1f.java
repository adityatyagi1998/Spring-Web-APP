package com.GoogleApi.apis.model;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Component
@Table(name="projectpillar1f")
public class Pillar1f {
    @Id
    public String projectfields;
    public String score;

    public String getProjectfields() {
        return projectfields;
    }

    public void setProjectfields(String projectfields) {
        this.projectfields = projectfields;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}

