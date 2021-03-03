package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0693;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0693Mapper extends BaseMapper<Formmain0693> {
    int updateBatch(List<Formmain0693> list);

    int updateBatchSelective(List<Formmain0693> list);

    int batchInsert(@Param("list") List<Formmain0693> list);

    int insertOrUpdate(Formmain0693 record);

    int insertOrUpdateSelective(Formmain0693 record);
}