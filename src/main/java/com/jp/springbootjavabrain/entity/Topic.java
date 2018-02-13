package com.jp.springbootjavabrain.entity;

import com.github.rkpunjal.sqlsafe.SQLInjectionSafe;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name = "topic")
public class Topic {
    @Id
    @SQLInjectionSafe
    private String name;
    @SQLInjectionSafe
    private String description;

    public Topic(String name, String description) {
        this.name = name;
        this.description = description;
    }


}
