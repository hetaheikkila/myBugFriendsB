package com.com.mybugfriends.domain;

import jakarta.persistence.*;


@Entity
public class Bug {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bug_id")
    private Long bugId;

    @Column(nullable = false)
    private String name;

    @Column
    private String species;

    @Column
    private String color;


    public Bug() {
    }

    public Bug(String name, String species, String color) {
        this.name = name;
        this.species = species;
        this.color = color;
    }


    public Long getBugId() {
        return bugId;
    }

    public void setBugId(Long bugId) {
        this.bugId = bugId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // --- toString (optional) ---
    @Override
    public String toString() {
        return "Bug{" +
                "bugId=" + bugId +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}