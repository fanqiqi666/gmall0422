package com.atguigu.gmall0422.service;

import com.atguigu.gmall0422.bean.*;

import java.util.List;

public interface ManageService {
    public List<BaseCatalog1> getCatalog1();

    public List<BaseCatalog2> getCatalog2(String catalog1Id);

    public List<BaseCatalog3> getCatalog3(String catalog2Id);

    public List<BaseAttrInfo> getAttrList(String catalog3Id);

    //保存平台属性值方法
    void saveBaseAttrInfo(BaseAttrInfo baseAttrInfo);

    /**
     * 根据平台属性值id（attrId=baseAttrInfo.Id）查询平台属性值集合
     * @param attrId
     * @return
     */
    List<BaseAttrValue> getAttrValueList(String attrId);

    /**
     * 根据平台属性id获取平台属性对象
     * @param attrId
     * @return
     */
    BaseAttrInfo getBaseAttrInfo(String attrId);
}
