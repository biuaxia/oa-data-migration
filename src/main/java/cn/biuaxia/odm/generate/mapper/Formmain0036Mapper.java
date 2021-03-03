package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0036;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0036Mapper extends BaseMapper<Formmain0036> {
    int batchInsert(@Param("list") List<Formmain0036> list);

    int insertOrUpdate(Formmain0036 record);

    int insertOrUpdateSelective(Formmain0036 record);
}