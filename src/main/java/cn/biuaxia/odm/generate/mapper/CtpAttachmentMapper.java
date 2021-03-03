package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.CtpAttachment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CtpAttachmentMapper extends BaseMapper<CtpAttachment> {
    int updateBatch(List<CtpAttachment> list);

    int updateBatchSelective(List<CtpAttachment> list);

    int batchInsert(@Param("list") List<CtpAttachment> list);

    int insertOrUpdate(CtpAttachment record);

    int insertOrUpdateSelective(CtpAttachment record);
}