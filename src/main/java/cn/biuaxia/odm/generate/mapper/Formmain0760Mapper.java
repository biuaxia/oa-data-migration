package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0760;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0760Mapper extends BaseMapper<Formmain0760> {
    int updateBatch(List<Formmain0760> list);

    int updateBatchSelective(List<Formmain0760> list);

    int batchInsert(@Param("list") List<Formmain0760> list);

    int insertOrUpdate(Formmain0760 record);

    int insertOrUpdateSelective(Formmain0760 record);
}