package cn.biuaxia.data.migration.generate.orcl.mapper;

import cn.biuaxia.data.migration.generate.orcl.domain.UmLeader;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmLeaderMapper extends BaseMapper<UmLeader> {
    int updateBatch(List<UmLeader> list);

    int updateBatchSelective(List<UmLeader> list);

    int batchInsert(@Param("list") List<UmLeader> list);

    int insertOrUpdate(UmLeader record);

    int insertOrUpdateSelective(UmLeader record);
}