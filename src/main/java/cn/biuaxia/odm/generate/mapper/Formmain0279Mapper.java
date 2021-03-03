package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0279;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0279Mapper extends BaseMapper<Formmain0279> {
    int updateBatch(List<Formmain0279> list);

    int updateBatchSelective(List<Formmain0279> list);

    int batchInsert(@Param("list") List<Formmain0279> list);

    int insertOrUpdate(Formmain0279 record);

    int insertOrUpdateSelective(Formmain0279 record);
}