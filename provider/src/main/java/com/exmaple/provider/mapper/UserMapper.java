package com.exmaple.provider.mapper;
import com.exmaple.provider.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;
@Repository
public interface UserMapper {
    List<User> getAll();
}
