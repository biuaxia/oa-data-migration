package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0220;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0220Mapper extends BaseMapper<Formmain0220> {
    int updateBatch(List<Formmain0220> list);

    int updateBatchSelective(List<Formmain0220> list);

    int batchInsert(@Param("list") List<Formmain0220> list);

    int insertOrUpdate(Formmain0220 record);

    int insertOrUpdateSelective(Formmain0220 record);
}