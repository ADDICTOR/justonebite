package com.zachary.justonebite.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zachary.justonebite.pojo.User;
import com.zachary.justonebite.service.UserService;
import com.zachary.justonebite.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author ziqian
* @description 针对表【user】的数据库操作Service实现
* @createDate 2024-08-01 16:34:17
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




