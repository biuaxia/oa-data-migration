package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0148;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0148Mapper extends BaseMapper<Formmain0148> {
    int batchInsert(@Param("list") List<Formmain0148> list);

    int insertOrUpdate(Formmain0148 record);

    int insertOrUpdateSelective(Formmain0148 record);
}