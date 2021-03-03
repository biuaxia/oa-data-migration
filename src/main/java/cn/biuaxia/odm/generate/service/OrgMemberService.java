package cn.biuaxia.odm.generate.service;

import cn.biuaxia.odm.generate.domain.OrgMember;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface OrgMemberService extends IService<OrgMember> {

    int updateBatch(List<OrgMember> list);

    int updateBatchSelective(List<OrgMember> list);

    int batchInsert(List<OrgMember> list);

    int insertOrUpdate(OrgMember record);

    int insertOrUpdateSelective(OrgMember record);

}
