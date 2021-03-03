package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0001;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0001Mapper extends BaseMapper<Formmain0001> {
    int batchInsert(@Param("list") List<Formmain0001> list);

    int insertOrUpdate(Formmain0001 record);

    int insertOrUpdateSelective(Formmain0001 record);
}