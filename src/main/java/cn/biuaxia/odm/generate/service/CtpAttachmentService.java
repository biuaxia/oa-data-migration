package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.CtpAttachment;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CtpAttachmentService extends IService<CtpAttachment> {

    int updateBatch(List<CtpAttachment> list);

    int updateBatchSelective(List<CtpAttachment> list);

    int batchInsert(List<CtpAttachment> list);

    int insertOrUpdate(CtpAttachment record);

    int insertOrUpdateSelective(CtpAttachment record);

}
