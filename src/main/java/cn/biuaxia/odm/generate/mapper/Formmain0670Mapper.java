package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0670;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0670Mapper extends BaseMapper<Formmain0670> {
    int updateBatch(List<Formmain0670> list);

    int updateBatchSelective(List<Formmain0670> list);

    int batchInsert(@Param("list") List<Formmain0670> list);

    int insertOrUpdate(Formmain0670 record);

    int insertOrUpdateSelective(Formmain0670 record);
}