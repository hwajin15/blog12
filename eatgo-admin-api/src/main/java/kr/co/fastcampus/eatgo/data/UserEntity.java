package kr.co.fastcampus.eatgo.data;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


@Data
@Entity
@Table(name ="seouldatadb")
public class UserEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(nullable = false)
    private String location;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String info;

    @Column(name = "classification",nullable = false)
    private String classification;

    @Column(name = "classification_info",nullable = false)
    private String classificationInfo;

    @Column(nullable = false)
    private String provider;

    @Column(nullable = false)
    private String provider_info;

    @Column(nullable = false)
    private String providerdep;

    @Column(nullable = false)
    private String providerdep_info;

    @Column(nullable = false)
    private String rangeuse;

    @Column(nullable = false)
    private String rangeuse_info;

    @Column(nullable = false)
    private String enrollment;

    @Column(nullable = false)
    private String enrollment_info;

    @Column(nullable = false)
    private String modify;

    @Column(nullable = false)
    private String modify_info;

    @Column(nullable = false)
    private String url;

    private UserEntity(){

    }
}