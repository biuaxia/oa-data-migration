package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0487;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0487Mapper extends BaseMapper<Formmain0487> {
    int updateBatch(List<Formmain0487> list);

    int updateBatchSelective(List<Formmain0487> list);

    int batchInsert(@Param("list") List<Formmain0487> list);

    int insertOrUpdate(Formmain0487 record);

    int insertOrUpdateSelective(Formmain0487 record);
}