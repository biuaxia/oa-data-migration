package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0657;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0657Mapper extends BaseMapper<Formmain0657> {
    int updateBatch(List<Formmain0657> list);

    int updateBatchSelective(List<Formmain0657> list);

    int batchInsert(@Param("list") List<Formmain0657> list);

    int insertOrUpdate(Formmain0657 record);

    int insertOrUpdateSelective(Formmain0657 record);
}