package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0028;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0028Mapper extends BaseMapper<Formmain0028> {
    int batchInsert(@Param("list") List<Formmain0028> list);

    int insertOrUpdate(Formmain0028 record);

    int insertOrUpdateSelective(Formmain0028 record);
}