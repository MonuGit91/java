package com.webSearchEngine.dao.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "url")
@Data
@JsonIgnoreProperties
public class Url {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "url_id")
    private int id;
    @Column(name = "url")
    private String url;
}
