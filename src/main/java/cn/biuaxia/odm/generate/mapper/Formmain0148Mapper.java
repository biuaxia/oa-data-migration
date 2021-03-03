package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0148;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0148Mapper extends BaseMapper<Formmain0148> {
    int batchInsert(@Param("list") List<Formmain0148> list);

    int insertOrUpdate(Formmain0148 record);

    int insertOrUpdateSelective(Formmain0148 record);
}