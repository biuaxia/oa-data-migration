package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0089;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0089Mapper extends BaseMapper<Formmain0089> {
    int batchInsert(@Param("list") List<Formmain0089> list);

    int insertOrUpdate(Formmain0089 record);

    int insertOrUpdateSelective(Formmain0089 record);
}