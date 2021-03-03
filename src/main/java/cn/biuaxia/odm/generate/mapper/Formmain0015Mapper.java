package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0015;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0015Mapper extends BaseMapper<Formmain0015> {
    int batchInsert(@Param("list") List<Formmain0015> list);

    int insertOrUpdate(Formmain0015 record);

    int insertOrUpdateSelective(Formmain0015 record);
}