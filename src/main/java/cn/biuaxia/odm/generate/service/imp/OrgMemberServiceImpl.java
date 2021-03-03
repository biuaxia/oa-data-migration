package cn.biuaxia.odm.generate.service.imp;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.biuaxia.odm.generate.mapper.OrgMemberMapper;

import java.util.List;

import cn.biuaxia.odm.generate.domain.OrgMember;
import cn.biuaxia.odm.generate.service.OrgMemberService;

@Service
public class OrgMemberServiceImpl extends ServiceImpl<OrgMemberMapper, OrgMember> implements OrgMemberService {

    @Override
    public int updateBatch(List<OrgMember> list) {
        return baseMapper.updateBatch(list);
    }

    @Override
    public int updateBatchSelective(List<OrgMember> list) {
        return baseMapper.updateBatchSelective(list);
    }

    @Override
    public int batchInsert(List<OrgMember> list) {
        return baseMapper.batchInsert(list);
    }

    @Override
    public int insertOrUpdate(OrgMember record) {
        return baseMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(OrgMember record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
