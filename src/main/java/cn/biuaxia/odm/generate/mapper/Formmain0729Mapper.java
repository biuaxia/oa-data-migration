package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0729;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0729Mapper extends BaseMapper<Formmain0729> {
    int updateBatch(List<Formmain0729> list);

    int updateBatchSelective(List<Formmain0729> list);

    int batchInsert(@Param("list") List<Formmain0729> list);

    int insertOrUpdate(Formmain0729 record);

    int insertOrUpdateSelective(Formmain0729 record);
}