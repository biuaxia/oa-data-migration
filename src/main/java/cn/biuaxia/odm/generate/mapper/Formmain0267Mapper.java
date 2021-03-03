package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0267;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0267Mapper extends BaseMapper<Formmain0267> {
    int updateBatch(List<Formmain0267> list);

    int updateBatchSelective(List<Formmain0267> list);

    int batchInsert(@Param("list") List<Formmain0267> list);

    int insertOrUpdate(Formmain0267 record);

    int insertOrUpdateSelective(Formmain0267 record);
}