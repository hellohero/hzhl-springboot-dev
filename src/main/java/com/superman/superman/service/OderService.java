package com.superman.superman.service;

import com.superman.superman.model.Oder;

import java.util.List;

/**
 * Created by liujupeng on 2018/11/14.
 */
public interface OderService {
    void  queryAllOder(String id);
    void  saveOder(String id);
    void  queryJdOder(String id);
    List<Oder> queryPddOderListToId(String id,Integer status,Integer sort);
    Integer countPddOderForId(String id);
    Integer countPddOderForIdList(List list);
    void  queryTbOder(String id);

}
