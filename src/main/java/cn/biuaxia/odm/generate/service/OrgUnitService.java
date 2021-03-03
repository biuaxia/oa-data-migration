package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.OrgUnit;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrgUnitService extends IService<OrgUnit> {

    int updateBatch(List<OrgUnit> list);

    int updateBatchSelective(List<OrgUnit> list);

    int batchInsert(List<OrgUnit> list);

    int insertOrUpdate(OrgUnit record);

    int insertOrUpdateSelective(OrgUnit record);

}
