package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0064;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0064Mapper extends BaseMapper<Formmain0064> {
    int batchInsert(@Param("list") List<Formmain0064> list);

    int insertOrUpdate(Formmain0064 record);

    int insertOrUpdateSelective(Formmain0064 record);
}