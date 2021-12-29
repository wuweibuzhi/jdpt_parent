package com.djpt.qj.mapper;

import com.djpt.qj.entity.Djfz;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zw
 * @since 2021-12-22
 */
@Mapper
public interface DjfzMapper extends BaseMapper<Djfz> {

    //@Select("select id from djfz where fzsj between #{startTime} and #{startTime}")
    List<Djfz> selectId(String id);

}
