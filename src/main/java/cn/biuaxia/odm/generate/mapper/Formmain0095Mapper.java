package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0095;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0095Mapper extends BaseMapper<Formmain0095> {
    int batchInsert(@Param("list") List<Formmain0095> list);

    int insertOrUpdate(Formmain0095 record);

    int insertOrUpdateSelective(Formmain0095 record);
}