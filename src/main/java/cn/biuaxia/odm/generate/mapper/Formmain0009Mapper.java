package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0009;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0009Mapper extends BaseMapper<Formmain0009> {
    int batchInsert(@Param("list") List<Formmain0009> list);

    int insertOrUpdate(Formmain0009 record);

    int insertOrUpdateSelective(Formmain0009 record);
}