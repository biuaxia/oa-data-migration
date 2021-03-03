package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0699;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0699Mapper extends BaseMapper<Formmain0699> {
    int updateBatch(List<Formmain0699> list);

    int updateBatchSelective(List<Formmain0699> list);

    int batchInsert(@Param("list") List<Formmain0699> list);

    int insertOrUpdate(Formmain0699 record);

    int insertOrUpdateSelective(Formmain0699 record);
}