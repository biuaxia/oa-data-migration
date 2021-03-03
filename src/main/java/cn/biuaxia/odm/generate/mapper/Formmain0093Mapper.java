package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0093;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0093Mapper extends BaseMapper<Formmain0093> {
    int batchInsert(@Param("list") List<Formmain0093> list);

    int insertOrUpdate(Formmain0093 record);

    int insertOrUpdateSelective(Formmain0093 record);
}