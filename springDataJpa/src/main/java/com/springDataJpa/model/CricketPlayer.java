package com.springDataJpa.model;

import com.vladmihalcea.hibernate.type.json.JsonType;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Type;

@Entity
@Data
@Table(name = "cricket_player")
public class CricketPlayer {

    @Id
    @Column(name = "player_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer playerId;

    @Column(name = "player_name")
    private String playerName;

    @Column(name = "player_age")
    private Integer Age;

    @Type(JsonType.class)
    @Column(name = "player_address", columnDefinition = "json")
    private Player playerAddress;

}
