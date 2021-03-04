package cn.biuaxia.odm.generate.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "EDOC_EXCHANGE_ACCOUNT")
public class EdocExchangeAccount implements Serializable {
    @TableId(value = "ID", type = IdType.INPUT)
    private Long id;

    @TableField(value = "ACCOUNT_ID")
    private String accountId;

    @TableField(value = "`NAME`")
    private String name;

    @TableField(value = "ACCOUNT_TYPE")
    private Short accountType;

    @TableField(value = "DESCRIPTION")
    private String description;

    @TableField(value = "IS_INTERNAL_ACCOUNT")
    private Short isInternalAccount;

    @TableField(value = "INTERNAL_ORG_ID")
    private Long internalOrgId;

    @TableField(value = "INTERNAL_DEPT_ID")
    private Long internalDeptId;

    @TableField(value = "INTERNAL_USER_ID")
    private Long internalUserId;

    @TableField(value = "EXCHANGE_SERVER_ID")
    private String exchangeServerId;

    @TableField(value = "CREATE_TIME")
    private Date createTime;

    @TableField(value = "LAST_UPDATE")
    private Date lastUpdate;

    @TableField(value = "`STATUS`")
    private Short status;

    @TableField(value = "DOMAIN_ID")
    private Long domainId;

    @TableField(value = "KEEP_PERIOD")
    private Long keepPeriod;

    @TableField(value = "relName")
    private String relname;

    @TableField(value = "telphone")
    private String telphone;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "ID";

    public static final String COL_ACCOUNT_ID = "ACCOUNT_ID";

    public static final String COL_NAME = "NAME";

    public static final String COL_ACCOUNT_TYPE = "ACCOUNT_TYPE";

    public static final String COL_DESCRIPTION = "DESCRIPTION";

    public static final String COL_IS_INTERNAL_ACCOUNT = "IS_INTERNAL_ACCOUNT";

    public static final String COL_INTERNAL_ORG_ID = "INTERNAL_ORG_ID";

    public static final String COL_INTERNAL_DEPT_ID = "INTERNAL_DEPT_ID";

    public static final String COL_INTERNAL_USER_ID = "INTERNAL_USER_ID";

    public static final String COL_EXCHANGE_SERVER_ID = "EXCHANGE_SERVER_ID";

    public static final String COL_CREATE_TIME = "CREATE_TIME";

    public static final String COL_LAST_UPDATE = "LAST_UPDATE";

    public static final String COL_STATUS = "STATUS";

    public static final String COL_DOMAIN_ID = "DOMAIN_ID";

    public static final String COL_KEEP_PERIOD = "KEEP_PERIOD";

    public static final String COL_RELNAME = "relName";

    public static final String COL_TELPHONE = "telphone";
}