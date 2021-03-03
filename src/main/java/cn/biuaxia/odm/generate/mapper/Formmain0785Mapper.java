package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0785;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Formmain0785Mapper extends BaseMapper<Formmain0785> {
    int updateBatch(List<Formmain0785> list);

    int updateBatchSelective(List<Formmain0785> list);

    int batchInsert(@Param("list") List<Formmain0785> list);

    int insertOrUpdate(Formmain0785 record);

    int insertOrUpdateSelective(Formmain0785 record);
}