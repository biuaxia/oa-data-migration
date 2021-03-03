package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0857;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0857Mapper extends BaseMapper<Formmain0857> {
    int updateBatch(List<Formmain0857> list);

    int updateBatchSelective(List<Formmain0857> list);

    int batchInsert(@Param("list") List<Formmain0857> list);

    int insertOrUpdate(Formmain0857 record);

    int insertOrUpdateSelective(Formmain0857 record);
}