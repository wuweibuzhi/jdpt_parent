package com.djpt.qj.service;

import com.djpt.qj.entity.Djfz;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Date;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zw
 * @since 2021-12-22
 */
public interface DjfzService extends IService<Djfz> {

    List<Djfz> selectId(String id);

}
