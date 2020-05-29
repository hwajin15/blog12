package kr.co.fastcampus.eatgo.model;

import lombok.Data;


@Data
public class UserResponseModel {


    private String location;

    private String category;

    private String info;

    private String classification;

    private String classificationInfo;

    private String provider;

    private String provider_info;

    private String providerdep;

    private String providerdep_info;

    private String rangeuse;

    private String rangeuse_info;

    private String enrollment;

    private String enrollment_info;

    private String modify;

    private String modify_info;

    private String url;
}
