package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0305;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0305Mapper extends BaseMapper<Formmain0305> {
    int updateBatch(List<Formmain0305> list);

    int updateBatchSelective(List<Formmain0305> list);

    int batchInsert(@Param("list") List<Formmain0305> list);

    int insertOrUpdate(Formmain0305 record);

    int insertOrUpdateSelective(Formmain0305 record);
}