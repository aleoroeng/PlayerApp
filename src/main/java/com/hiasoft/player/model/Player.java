package com.hiasoft.player.model;

import com.hiasoft.player.enums.Position;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Player {
    @Id
    private long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private double currentMarketValue;
    private Position position;
}
