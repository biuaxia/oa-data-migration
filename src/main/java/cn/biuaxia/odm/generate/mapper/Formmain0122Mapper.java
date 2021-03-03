package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0122;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0122Mapper extends BaseMapper<Formmain0122> {
    int batchInsert(@Param("list") List<Formmain0122> list);

    int insertOrUpdate(Formmain0122 record);

    int insertOrUpdateSelective(Formmain0122 record);
}