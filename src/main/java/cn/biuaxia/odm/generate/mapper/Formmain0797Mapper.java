package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0797;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0797Mapper extends BaseMapper<Formmain0797> {
    int updateBatch(List<Formmain0797> list);

    int updateBatchSelective(List<Formmain0797> list);

    int batchInsert(@Param("list") List<Formmain0797> list);

    int insertOrUpdate(Formmain0797 record);

    int insertOrUpdateSelective(Formmain0797 record);
}