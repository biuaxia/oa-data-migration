package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0125;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0125Mapper extends BaseMapper<Formmain0125> {
    int batchInsert(@Param("list") List<Formmain0125> list);

    int insertOrUpdate(Formmain0125 record);

    int insertOrUpdateSelective(Formmain0125 record);
}