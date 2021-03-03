package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0765;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0765Mapper extends BaseMapper<Formmain0765> {
    int updateBatch(List<Formmain0765> list);

    int updateBatchSelective(List<Formmain0765> list);

    int batchInsert(@Param("list") List<Formmain0765> list);

    int insertOrUpdate(Formmain0765 record);

    int insertOrUpdateSelective(Formmain0765 record);
}