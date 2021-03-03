package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0697;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0697Mapper extends BaseMapper<Formmain0697> {
    int updateBatch(List<Formmain0697> list);

    int updateBatchSelective(List<Formmain0697> list);

    int batchInsert(@Param("list") List<Formmain0697> list);

    int insertOrUpdate(Formmain0697 record);

    int insertOrUpdateSelective(Formmain0697 record);
}