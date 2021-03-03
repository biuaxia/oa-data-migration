package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0008;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0008Mapper extends BaseMapper<Formmain0008> {
    int batchInsert(@Param("list") List<Formmain0008> list);

    int insertOrUpdate(Formmain0008 record);

    int insertOrUpdateSelective(Formmain0008 record);
}