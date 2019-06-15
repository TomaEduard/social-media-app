package com.example.springit.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
@NoArgsConstructor
public class Vote extends Auditable {

    @Id
    @GeneratedValue
    private Long id;
    private int vote;

    @ManyToOne
    private Link link;
    // user

}
