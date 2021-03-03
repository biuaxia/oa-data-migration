package cn.biuaxia.odm.generate.mapper;

import cn.biuaxia.odm.generate.domain.CtpFile;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CtpFileMapper extends BaseMapper<CtpFile> {
    int updateBatch(List<CtpFile> list);

    int updateBatchSelective(List<CtpFile> list);

    int batchInsert(@Param("list") List<CtpFile> list);

    int insertOrUpdate(CtpFile record);

    int insertOrUpdateSelective(CtpFile record);
}