package com.djpt.qj.service.impl;

import com.djpt.qj.entity.Djfz;
import com.djpt.qj.mapper.DjfzMapper;
import com.djpt.qj.service.DjfzService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zw
 * @since 2021-12-22
 */
@Service
public class DjfzServiceImpl extends ServiceImpl<DjfzMapper, Djfz> implements DjfzService {

    @Autowired
    DjfzMapper djfzMapper;
    @Override
    public List<Djfz> selectId(String id) {
        List<Djfz> idList=djfzMapper.selectId(id);
        return idList;
    }
}
