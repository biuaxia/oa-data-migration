package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0103;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0103Mapper extends BaseMapper<Formmain0103> {
    int batchInsert(@Param("list") List<Formmain0103> list);

    int insertOrUpdate(Formmain0103 record);

    int insertOrUpdateSelective(Formmain0103 record);
}