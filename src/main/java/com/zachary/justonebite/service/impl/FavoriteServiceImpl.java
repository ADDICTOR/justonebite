package com.zachary.justonebite.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zachary.justonebite.pojo.Favorite;
import com.zachary.justonebite.service.FavoriteService;
import com.zachary.justonebite.mapper.FavoriteMapper;
import org.springframework.stereotype.Service;

/**
* @author ziqian
* @description 针对表【favorite】的数据库操作Service实现
* @createDate 2024-08-01 16:34:17
*/
@Service
public class FavoriteServiceImpl extends ServiceImpl<FavoriteMapper, Favorite>
    implements FavoriteService{

}




