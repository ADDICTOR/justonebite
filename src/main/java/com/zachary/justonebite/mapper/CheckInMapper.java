package com.zachary.justonebite.mapper;

import com.zachary.justonebite.pojo.CheckIn;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author ziqian
* @description 针对表【check_in】的数据库操作Mapper
* @createDate 2024-08-01 16:34:17
* @Entity com.zachary.justonebite.pojo.CheckIn
*/

@Mapper
public interface CheckInMapper extends BaseMapper<CheckIn> {

}




