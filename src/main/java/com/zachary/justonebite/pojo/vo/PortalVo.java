package com.zachary.justonebite.pojo.vo;

import lombok.Data;

/**
 * projectName: com.zachary.justonebite.pojo.vo
 *
 * @author: zachary.zhou
 * description:
 */

@Data
public class PortalVo {

    private String keyWords ;
    private int type = 0;

    private int pageNum = 1;

    private int pageSize = 10;
}
