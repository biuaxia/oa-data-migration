package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0822;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0822Mapper extends BaseMapper<Formmain0822> {
    int updateBatch(List<Formmain0822> list);

    int updateBatchSelective(List<Formmain0822> list);

    int batchInsert(@Param("list") List<Formmain0822> list);

    int insertOrUpdate(Formmain0822 record);

    int insertOrUpdateSelective(Formmain0822 record);
}