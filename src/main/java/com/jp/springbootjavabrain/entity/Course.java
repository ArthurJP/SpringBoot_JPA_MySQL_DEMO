package com.jp.springbootjavabrain.entity;

import com.github.rkpunjal.sqlsafe.SQLInjectionSafe;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name="course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @SQLInjectionSafe
    private int id;
    @SQLInjectionSafe
    private String name;
    @SQLInjectionSafe
    private String info;

//    一个主题可以有多个课程
    @ManyToOne
    private Topic topic;

    public Course(int id, String name, String info, String topicName) {
        this.id = id;
        this.name = name;
        this.info = info;
        this.topic = new Topic( topicName," " );
    }
}
