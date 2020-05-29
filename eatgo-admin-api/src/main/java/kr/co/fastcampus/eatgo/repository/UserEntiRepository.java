package kr.co.fastcampus.eatgo.repository;

import kr.co.fastcampus.eatgo.data.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserEntiRepository extends CrudRepository<UserEntity , Integer> {

    List<UserEntity> findAll();

    Optional<UserEntity> findById(Integer id);
    UserEntity findByClassificationInfo(String classificationInfo);

   // Optional<UserEntity> findByclassification_info(String classification_info);


}
