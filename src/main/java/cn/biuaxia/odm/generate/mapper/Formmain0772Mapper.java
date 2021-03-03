package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0772;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0772Mapper extends BaseMapper<Formmain0772> {
    int updateBatch(List<Formmain0772> list);

    int updateBatchSelective(List<Formmain0772> list);

    int batchInsert(@Param("list") List<Formmain0772> list);

    int insertOrUpdate(Formmain0772 record);

    int insertOrUpdateSelective(Formmain0772 record);
}