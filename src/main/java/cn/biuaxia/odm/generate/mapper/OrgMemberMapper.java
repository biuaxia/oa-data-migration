package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.OrgMember;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrgMemberMapper extends BaseMapper<OrgMember> {
    int updateBatch(List<OrgMember> list);

    int updateBatchSelective(List<OrgMember> list);

    int batchInsert(@Param("list") List<OrgMember> list);

    int insertOrUpdate(OrgMember record);

    int insertOrUpdateSelective(OrgMember record);
}