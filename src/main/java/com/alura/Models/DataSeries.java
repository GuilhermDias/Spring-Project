package com.alura.Models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DataSeries(String Title, @JsonAlias("imdbRating") String Rating, @JsonAlias("totalSeasons") Integer Seasons) {

}
