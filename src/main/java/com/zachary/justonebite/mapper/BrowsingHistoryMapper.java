package com.zachary.justonebite.mapper;

import com.zachary.justonebite.pojo.BrowsingHistory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author ziqian
* @description 针对表【browsing_history】的数据库操作Mapper
* @createDate 2024-08-01 16:34:17
* @Entity com.zachary.justonebite.pojo.BrowsingHistory
*/

@Mapper
public interface BrowsingHistoryMapper extends BaseMapper<BrowsingHistory> {

}




