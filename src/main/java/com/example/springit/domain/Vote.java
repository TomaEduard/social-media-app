package com.example.springit.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
public class Vote extends Auditable {

    @Id
    @GeneratedValue
    private Long id;
    private int vote;

    @ManyToOne
    private Link link;
    // user


}
