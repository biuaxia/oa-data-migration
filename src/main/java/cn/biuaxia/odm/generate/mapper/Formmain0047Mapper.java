package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0047;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0047Mapper extends BaseMapper<Formmain0047> {
    int batchInsert(@Param("list") List<Formmain0047> list);

    int insertOrUpdate(Formmain0047 record);

    int insertOrUpdateSelective(Formmain0047 record);
}