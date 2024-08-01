package com.zachary.justonebite.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zachary.justonebite.pojo.CheckIn;
import com.zachary.justonebite.service.CheckInService;
import com.zachary.justonebite.mapper.CheckInMapper;
import org.springframework.stereotype.Service;

/**
* @author ziqian
* @description 针对表【check_in】的数据库操作Service实现
* @createDate 2024-08-01 16:34:17
*/
@Service
public class CheckInServiceImpl extends ServiceImpl<CheckInMapper, CheckIn>
    implements CheckInService{

}




