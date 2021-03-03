package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0506;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0506Mapper extends BaseMapper<Formmain0506> {
    int updateBatch(List<Formmain0506> list);

    int updateBatchSelective(List<Formmain0506> list);

    int batchInsert(@Param("list") List<Formmain0506> list);

    int insertOrUpdate(Formmain0506 record);

    int insertOrUpdateSelective(Formmain0506 record);
}