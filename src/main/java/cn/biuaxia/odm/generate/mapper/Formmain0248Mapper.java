package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0248;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0248Mapper extends BaseMapper<Formmain0248> {
    int updateBatch(List<Formmain0248> list);

    int updateBatchSelective(List<Formmain0248> list);

    int batchInsert(@Param("list") List<Formmain0248> list);

    int insertOrUpdate(Formmain0248 record);

    int insertOrUpdateSelective(Formmain0248 record);
}