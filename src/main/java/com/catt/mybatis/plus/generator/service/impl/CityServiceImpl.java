package com.catt.mybatis.plus.generator.service.impl;

import com.catt.mybatis.plus.generator.entity.City;
import com.catt.mybatis.plus.generator.mapper.CityMapper;
import com.catt.mybatis.plus.generator.service.CityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 行政区域地州市信息表 服务实现类
 * </p>
 *
 * @author zwp
 * @since 2019-12-26
 */
@Service
public class CityServiceImpl extends ServiceImpl<CityMapper, City> implements CityService {

    @Autowired
    private CityMapper mapper;

    @Override
    public List<City> listCitiesCustomize() {
        return mapper.listCitiesCustomize();
    }
}
