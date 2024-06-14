package com.app.appmoviesseries.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Favorite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_favorite;

    @ManyToOne
    @Column(name = "id_movie")
    private Movie movie;

    @ManyToOne
    @JoinColumn(name ="id_serie")
    private Series series;

    @ManyToOne
    @JoinColumn(name ="id_user")
    private Users users;

    public Long getId_favorite() {
        return id_favorite;
    }

    public void setId_favorite(Long id_favorite) {
        this.id_favorite = id_favorite;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
