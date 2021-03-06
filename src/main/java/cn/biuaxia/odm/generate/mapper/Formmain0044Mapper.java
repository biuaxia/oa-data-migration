package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0044;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0044Mapper extends BaseMapper<Formmain0044> {
    int updateBatch(List<Formmain0044> list);

    int updateBatchSelective(List<Formmain0044> list);

    int batchInsert(@Param("list") List<Formmain0044> list);

    int insertOrUpdate(Formmain0044 record);

    int insertOrUpdateSelective(Formmain0044 record);
}