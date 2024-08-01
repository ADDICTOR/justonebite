package com.zachary.justonebite.mapper;

import com.zachary.justonebite.pojo.Favorite;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author ziqian
* @description 针对表【favorite】的数据库操作Mapper
* @createDate 2024-08-01 16:34:17
* @Entity com.zachary.justonebite.pojo.Favorite
*/

@Mapper
public interface FavoriteMapper extends BaseMapper<Favorite> {

}




