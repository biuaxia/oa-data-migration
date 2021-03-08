package cn.biuaxia.data.migration.generate.orcl.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FormSetInfoDTO implements Serializable {

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 分类ID
     */
    private Long folderId;

    /**
     * 分类名称
     */
    private String folderName;

    /**
     * 公文创建单位ID
     */
    private Long creatorDeptId;

    /**
     * 公文创建单位名称
     */
    private String creatorDept;

}
