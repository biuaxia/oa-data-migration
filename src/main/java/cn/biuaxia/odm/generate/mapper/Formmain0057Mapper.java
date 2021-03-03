package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0057;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0057Mapper extends BaseMapper<Formmain0057> {
    int batchInsert(@Param("list") List<Formmain0057> list);

    int insertOrUpdate(Formmain0057 record);

    int insertOrUpdateSelective(Formmain0057 record);
}