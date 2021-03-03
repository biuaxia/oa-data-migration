package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0012;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0012Mapper extends BaseMapper<Formmain0012> {
    int batchInsert(@Param("list") List<Formmain0012> list);

    int insertOrUpdate(Formmain0012 record);

    int insertOrUpdateSelective(Formmain0012 record);
}