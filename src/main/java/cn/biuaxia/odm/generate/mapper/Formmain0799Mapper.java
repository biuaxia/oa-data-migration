package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0799;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0799Mapper extends BaseMapper<Formmain0799> {
    int updateBatch(List<Formmain0799> list);

    int updateBatchSelective(List<Formmain0799> list);

    int batchInsert(@Param("list") List<Formmain0799> list);

    int insertOrUpdate(Formmain0799 record);

    int insertOrUpdateSelective(Formmain0799 record);
}