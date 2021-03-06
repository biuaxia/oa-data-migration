package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0004;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0004Mapper extends BaseMapper<Formmain0004> {
    int batchInsert(@Param("list") List<Formmain0004> list);

    int insertOrUpdate(Formmain0004 record);

    int insertOrUpdateSelective(Formmain0004 record);
}