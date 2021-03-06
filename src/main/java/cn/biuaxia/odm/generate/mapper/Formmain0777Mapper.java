package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0777;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0777Mapper extends BaseMapper<Formmain0777> {
    int updateBatch(List<Formmain0777> list);

    int updateBatchSelective(List<Formmain0777> list);

    int batchInsert(@Param("list") List<Formmain0777> list);

    int insertOrUpdate(Formmain0777 record);

    int insertOrUpdateSelective(Formmain0777 record);
}