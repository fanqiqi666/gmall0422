package com.atguigu.gmall0422.manage.mapper;

import com.atguigu.gmall0422.bean.BaseAttrInfo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface BaseAttrInfoMapper extends Mapper<BaseAttrInfo> {
    List<BaseAttrInfo> getBaseAttrInfoListByCatalog3Id(String catalog3Id);
}
