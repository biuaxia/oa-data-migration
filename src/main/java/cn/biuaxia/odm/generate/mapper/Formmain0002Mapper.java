package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0002;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0002Mapper extends BaseMapper<Formmain0002> {
    int batchInsert(@Param("list") List<Formmain0002> list);

    int insertOrUpdate(Formmain0002 record);

    int insertOrUpdateSelective(Formmain0002 record);
}