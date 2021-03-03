package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0124;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0124Mapper extends BaseMapper<Formmain0124> {
    int batchInsert(@Param("list") List<Formmain0124> list);

    int insertOrUpdate(Formmain0124 record);

    int insertOrUpdateSelective(Formmain0124 record);
}