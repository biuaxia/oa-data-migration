package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0069;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0069Mapper extends BaseMapper<Formmain0069> {
    int batchInsert(@Param("list") List<Formmain0069> list);

    int insertOrUpdate(Formmain0069 record);

    int insertOrUpdateSelective(Formmain0069 record);
}