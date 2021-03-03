package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0739;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0739Mapper extends BaseMapper<Formmain0739> {
    int updateBatch(List<Formmain0739> list);

    int updateBatchSelective(List<Formmain0739> list);

    int batchInsert(@Param("list") List<Formmain0739> list);

    int insertOrUpdate(Formmain0739 record);

    int insertOrUpdateSelective(Formmain0739 record);
}