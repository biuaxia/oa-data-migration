package cn.biuaxia.data.migration.generate.msq.mapper;

import cn.biuaxia.data.migration.generate.msq.domain.KmImissiveSendMain;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KmImissiveSendMainMapper extends BaseMapper<KmImissiveSendMain> {
    int updateBatch(List<KmImissiveSendMain> list);

    int updateBatchSelective(List<KmImissiveSendMain> list);

    int batchInsert(@Param("list") List<KmImissiveSendMain> list);

    int insertOrUpdate(KmImissiveSendMain record);

    int insertOrUpdateSelective(KmImissiveSendMain record);
}