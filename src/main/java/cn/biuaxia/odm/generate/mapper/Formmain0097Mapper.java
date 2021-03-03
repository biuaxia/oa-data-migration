package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0097;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0097Mapper extends BaseMapper<Formmain0097> {
    int batchInsert(@Param("list") List<Formmain0097> list);

    int insertOrUpdate(Formmain0097 record);

    int insertOrUpdateSelective(Formmain0097 record);
}