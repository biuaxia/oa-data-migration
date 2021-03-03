package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0532;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0532Mapper extends BaseMapper<Formmain0532> {
    int updateBatch(List<Formmain0532> list);

    int updateBatchSelective(List<Formmain0532> list);

    int batchInsert(@Param("list") List<Formmain0532> list);

    int insertOrUpdate(Formmain0532 record);

    int insertOrUpdateSelective(Formmain0532 record);
}