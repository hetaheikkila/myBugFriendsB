package com.com.mybugfriends.domain;


import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Finding {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "finding_id")
    private Long findingId;

    @ManyToOne
    @JoinColumn(name = "bug_id", nullable = false)
    private Bug bug;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "location")
    private String location;

    @Column(name = "found_at")
    private LocalDateTime foundAt;

    @Column(name = "notes", length = 1000)
    private String notes;

    // --- Constructors ---
    public Finding() {
    }

    public Finding(Bug bug, User user, String location, LocalDateTime foundAt, String notes) {
        this.bug = bug;
        this.user = user;
        this.location = location;
        this.foundAt = foundAt;
        this.notes = notes;
    }

    // --- Getters and Setters ---

    public Long getFindingId() {
        return findingId;
    }

    public void setFindingId(Long findingId) {
        this.findingId = findingId;
    }

    public Bug getBug() {
        return bug;
    }

    public void setBug(Bug bug) {
        this.bug = bug;
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDateTime getFoundAt() {
        return foundAt;
    }

    public void setFoundAt(LocalDateTime foundAt) {
        this.foundAt = foundAt;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Finding{" +
                "findingId=" + findingId +
                ", bug=" + bug +
                ", user=" + user +
                ", location='" + location + '\'' +
                ", foundAt=" + foundAt +
                ", notes='" + notes + '\'' +
                '}';
    }
}

