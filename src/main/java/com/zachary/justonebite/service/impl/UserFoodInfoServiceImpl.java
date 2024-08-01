package com.zachary.justonebite.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zachary.justonebite.pojo.UserFoodInfo;
import com.zachary.justonebite.service.UserFoodInfoService;
import com.zachary.justonebite.mapper.UserFoodInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author ziqian
* @description 针对表【user_food_info】的数据库操作Service实现
* @createDate 2024-08-01 16:34:17
*/
@Service
public class UserFoodInfoServiceImpl extends ServiceImpl<UserFoodInfoMapper, UserFoodInfo>
    implements UserFoodInfoService{

}




