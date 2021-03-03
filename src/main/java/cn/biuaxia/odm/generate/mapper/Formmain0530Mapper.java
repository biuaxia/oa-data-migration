package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0530;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0530Mapper extends BaseMapper<Formmain0530> {
    int updateBatch(List<Formmain0530> list);

    int updateBatchSelective(List<Formmain0530> list);

    int batchInsert(@Param("list") List<Formmain0530> list);

    int insertOrUpdate(Formmain0530 record);

    int insertOrUpdateSelective(Formmain0530 record);
}