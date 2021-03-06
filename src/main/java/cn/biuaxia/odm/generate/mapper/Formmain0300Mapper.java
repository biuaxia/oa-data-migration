package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0300;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0300Mapper extends BaseMapper<Formmain0300> {
    int updateBatch(List<Formmain0300> list);

    int updateBatchSelective(List<Formmain0300> list);

    int batchInsert(@Param("list") List<Formmain0300> list);

    int insertOrUpdate(Formmain0300 record);

    int insertOrUpdateSelective(Formmain0300 record);
}