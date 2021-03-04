package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.KmImissiveReceiveMain;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface KmImissiveReceiveMainMapper extends BaseMapper<KmImissiveReceiveMain> {
    int updateBatch(List<KmImissiveReceiveMain> list);

    int updateBatchSelective(List<KmImissiveReceiveMain> list);

    int batchInsert(@Param("list") List<KmImissiveReceiveMain> list);

    int insertOrUpdate(KmImissiveReceiveMain record);

    int insertOrUpdateSelective(KmImissiveReceiveMain record);
}