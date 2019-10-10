package com.atguigu.gmall0422.service;

import com.atguigu.gmall0422.bean.*;

import java.util.List;

public interface ManageService {
    List<BaseCatalog1> getCatalog1();

    List<BaseCatalog2> getCatalog2(String catalog1Id);

    List<BaseCatalog3> getCatalog3(String catalog2Id);

    List<BaseAttrInfo> getAttrList(String catalog3Id);

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

    //获取商品基本信息
    List<SpuInfo> getSpuInfoList(SpuInfo spuInfo);

    //获取商品销售属性名称信息
    List<BaseSaleAttr> getBaseSaleAttrList();

    //保存spuInfo信息
    //http://localhost:8082/saveSpuInfo
    void saveSpuInfo(SpuInfo spuInfo);

    List<SpuImage> getSpuImageList(String spuId);

    List<SpuSaleAttr> getSpuSaleAttrList(String spuId);

    void saveSkuInfo(SkuInfo skuInfo);
}
