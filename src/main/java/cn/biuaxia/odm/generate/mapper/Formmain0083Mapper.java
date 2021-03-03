package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0083;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0083Mapper extends BaseMapper<Formmain0083> {
    int batchInsert(@Param("list") List<Formmain0083> list);

    int insertOrUpdate(Formmain0083 record);

    int insertOrUpdateSelective(Formmain0083 record);
}