package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.KmImissiveSendMain;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface KmImissiveSendMainMapper extends BaseMapper<KmImissiveSendMain> {
    int updateBatch(List<KmImissiveSendMain> list);

    int updateBatchSelective(List<KmImissiveSendMain> list);

    int batchInsert(@Param("list") List<KmImissiveSendMain> list);

    int insertOrUpdate(KmImissiveSendMain record);

    int insertOrUpdateSelective(KmImissiveSendMain record);
}