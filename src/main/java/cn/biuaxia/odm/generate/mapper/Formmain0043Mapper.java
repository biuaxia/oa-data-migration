package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0043;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0043Mapper extends BaseMapper<Formmain0043> {
    int updateBatch(List<Formmain0043> list);

    int updateBatchSelective(List<Formmain0043> list);

    int batchInsert(@Param("list") List<Formmain0043> list);

    int insertOrUpdate(Formmain0043 record);

    int insertOrUpdateSelective(Formmain0043 record);
}