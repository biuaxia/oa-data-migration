package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0735;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0735Mapper extends BaseMapper<Formmain0735> {
    int updateBatch(List<Formmain0735> list);

    int updateBatchSelective(List<Formmain0735> list);

    int batchInsert(@Param("list") List<Formmain0735> list);

    int insertOrUpdate(Formmain0735 record);

    int insertOrUpdateSelective(Formmain0735 record);
}