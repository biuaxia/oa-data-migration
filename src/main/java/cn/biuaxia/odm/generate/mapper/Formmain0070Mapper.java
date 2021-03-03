package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0070;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0070Mapper extends BaseMapper<Formmain0070> {
    int batchInsert(@Param("list") List<Formmain0070> list);

    int insertOrUpdate(Formmain0070 record);

    int insertOrUpdateSelective(Formmain0070 record);
}