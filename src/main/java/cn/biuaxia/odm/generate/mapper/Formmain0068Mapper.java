package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0068;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0068Mapper extends BaseMapper<Formmain0068> {
    int batchInsert(@Param("list") List<Formmain0068> list);

    int insertOrUpdate(Formmain0068 record);

    int insertOrUpdateSelective(Formmain0068 record);
}