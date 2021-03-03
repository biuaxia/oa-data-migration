package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0651;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0651Mapper extends BaseMapper<Formmain0651> {
    int updateBatch(List<Formmain0651> list);

    int updateBatchSelective(List<Formmain0651> list);

    int batchInsert(@Param("list") List<Formmain0651> list);

    int insertOrUpdate(Formmain0651 record);

    int insertOrUpdateSelective(Formmain0651 record);
}