package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0767;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0767Mapper extends BaseMapper<Formmain0767> {
    int updateBatch(List<Formmain0767> list);

    int updateBatchSelective(List<Formmain0767> list);

    int batchInsert(@Param("list") List<Formmain0767> list);

    int insertOrUpdate(Formmain0767 record);

    int insertOrUpdateSelective(Formmain0767 record);
}