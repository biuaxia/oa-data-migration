package cn.biuaxia.data.migration.generate.orcl.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 部门
    */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "UM_ORGANIZATION")
public class UmOrganization implements Serializable {
    /**
     * 部门id
     */
    @TableId(value = "ID", type = IdType.INPUT)
    private Long id;

    /**
     * 是否为单位
1为单位；0为非单位
     */
    @TableField(value = "ISDEPT")
    private Integer isdept;

    /**
     * 部门电话
     */
    @TableField(value = "PHONE")
    private String phone;

    /**
     * 部门传真
     */
    @TableField(value = "FAX")
    private String fax;

    /**
     * 联系人
     */
    @TableField(value = "LINKMAN")
    private String linkman;

    /**
     * 联系人email
     */
    @TableField(value = "LINK_EMAIL")
    private String linkEmail;

    /**
     * 办公室行政级别
     */
    @TableField(value = "OFFICIAL_LEVEL")
    private Long officialLevel;

    /**
     * 部门领导id
     */
    @TableField(value = "LEADER")
    private Long leader;

    @TableField(value = "OTHER_LEADER")
    private String otherLeader;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "ID";

    public static final String COL_ISDEPT = "ISDEPT";

    public static final String COL_PHONE = "PHONE";

    public static final String COL_FAX = "FAX";

    public static final String COL_LINKMAN = "LINKMAN";

    public static final String COL_LINK_EMAIL = "LINK_EMAIL";

    public static final String COL_OFFICIAL_LEVEL = "OFFICIAL_LEVEL";

    public static final String COL_LEADER = "LEADER";

    public static final String COL_OTHER_LEADER = "OTHER_LEADER";
}