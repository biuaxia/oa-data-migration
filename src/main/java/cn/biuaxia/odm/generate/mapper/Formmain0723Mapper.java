package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0723;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0723Mapper extends BaseMapper<Formmain0723> {
    int updateBatch(List<Formmain0723> list);

    int updateBatchSelective(List<Formmain0723> list);

    int batchInsert(@Param("list") List<Formmain0723> list);

    int insertOrUpdate(Formmain0723 record);

    int insertOrUpdateSelective(Formmain0723 record);
}