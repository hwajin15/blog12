package kr.co.fastcampus.eatgo.interfaces;

import kr.co.fastcampus.eatgo.application.CategoryService;


import kr.co.fastcampus.eatgo.data.UserEntity;
import kr.co.fastcampus.eatgo.model.UserResponseModel;
import kr.co.fastcampus.eatgo.service.DataService;
import kr.co.fastcampus.eatgo.shared.UserDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private DataService dataService;



    @GetMapping("/seouldatadb")
    public List<UserEntity> list() {
        List<UserEntity> userEntities = categoryService.getCategories();

        return userEntities;
    }
    @GetMapping("/seouldatadb/{id}")
    public Optional<UserEntity> detail(@PathVariable("id")Integer id){
        Optional<UserEntity> userEntity = categoryService.getCategory(id);
        return userEntity;
    }
//    @GetMapping("/seouldatadb/{classification_info}")
//    public Optional<UserEntity> category(@PathVariable("classification_info")String classification_info){
//        Optional<UserEntity> userEntity = categoryService.getClassification(classification_info);
//        return userEntity;
//    }
//
    @GetMapping(value = "/seouldatadb/{classificationInfo}",
            produces = {MediaType.APPLICATION_JSON_VALUE
//                    MediaType.APPLICATION_XML_VALUE
            })
    public ResponseEntity<UserResponseModel> getUser(
            @PathVariable("classificationInfo") String classificationInfo
    ){
//        ModelMapper modelMapper = new ModelMapper();
        UserDto userDto= dataService.getUserByInfo(classificationInfo);
        UserResponseModel  returnValue =
                new ModelMapper().map(userDto, UserResponseModel.class);
        return ResponseEntity.status(HttpStatus.OK).body(returnValue);
    }


}
