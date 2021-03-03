package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.Formmain0045;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Formmain0045Mapper extends BaseMapper<Formmain0045> {
    int batchInsert(@Param("list") List<Formmain0045> list);

    int insertOrUpdate(Formmain0045 record);

    int insertOrUpdateSelective(Formmain0045 record);
}