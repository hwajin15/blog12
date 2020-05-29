package kr.co.fastcampus.eatgo.application;

import kr.co.fastcampus.eatgo.data.UserEntity;
import kr.co.fastcampus.eatgo.repository.UserEntiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CategoryService {

    private UserEntiRepository userRepository;

    @Autowired
    public CategoryService(UserEntiRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserEntity> getCategories() {
        List<UserEntity> userEntities = userRepository.findAll();

        return userEntities;
    }
    public Optional<UserEntity> getCategory(Integer id){
        Optional<UserEntity> userEntity = userRepository.findById(id);
        return userEntity;
    }

//    public Optional<UserEntity> getClassification(String classification_info) {
//        Optional<UserEntity> userEntity1 =  userRepository.findByclassification_info(classification_info);
//        return userEntity1;
//    }
}
