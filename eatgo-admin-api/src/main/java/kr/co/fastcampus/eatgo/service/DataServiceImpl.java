package kr.co.fastcampus.eatgo.service;

import kr.co.fastcampus.eatgo.data.UserEntity;
import kr.co.fastcampus.eatgo.repository.UserEntiRepository;
import kr.co.fastcampus.eatgo.shared.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DataServiceImpl implements DataService {

    UserEntiRepository userEntiRepository;

    @Autowired
    public DataServiceImpl(UserEntiRepository userEntiRepository){
        this.userEntiRepository =userEntiRepository;
    }

    @Override
    public UserDto getUserByInfo(String classificationInfo) {
        UserEntity userEntity = userEntiRepository.findByClassificationInfo(classificationInfo);
        UserDto userDto =new ModelMapper().map(userEntity, UserDto.class);


        return userDto;

    }
}
