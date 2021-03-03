package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0493;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0493Mapper extends BaseMapper<Formmain0493> {
    int updateBatch(List<Formmain0493> list);

    int updateBatchSelective(List<Formmain0493> list);

    int batchInsert(@Param("list") List<Formmain0493> list);

    int insertOrUpdate(Formmain0493 record);

    int insertOrUpdateSelective(Formmain0493 record);
}