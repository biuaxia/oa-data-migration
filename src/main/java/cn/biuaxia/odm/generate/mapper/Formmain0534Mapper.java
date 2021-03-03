package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0534;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0534Mapper extends BaseMapper<Formmain0534> {
    int updateBatch(List<Formmain0534> list);

    int updateBatchSelective(List<Formmain0534> list);

    int batchInsert(@Param("list") List<Formmain0534> list);

    int insertOrUpdate(Formmain0534 record);

    int insertOrUpdateSelective(Formmain0534 record);
}