package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0162;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0162Mapper extends BaseMapper<Formmain0162> {
    int updateBatch(List<Formmain0162> list);

    int updateBatchSelective(List<Formmain0162> list);

    int batchInsert(@Param("list") List<Formmain0162> list);

    int insertOrUpdate(Formmain0162 record);

    int insertOrUpdateSelective(Formmain0162 record);
}