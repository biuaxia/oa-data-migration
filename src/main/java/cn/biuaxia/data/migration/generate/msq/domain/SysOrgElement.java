package cn.biuaxia.data.migration.generate.msq.domain;

import cn.biuaxia.data.migration.generate.orcl.domain.UmCommon;
import cn.biuaxia.data.migration.generate.orcl.domain.UmUser;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.extra.pinyin.PinyinUtil;
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
@TableName(value = "sys_org_element")
public class SysOrgElement implements Serializable {
    @TableId(value = "fd_id", type = IdType.INPUT)
    private String fdId;

    @TableField(value = "fd_org_type")
    private Integer fdOrgType;

    @TableField(value = "fd_name")
    private String fdName;

    @TableField(value = "fd_name_pinyin")
    private String fdNamePinyin;

    @TableField(value = "fd_name_simple_pinyin")
    private String fdNameSimplePinyin;

    @TableField(value = "fd_order")
    private Integer fdOrder;

    @TableField(value = "fd_no")
    private String fdNo;

    @TableField(value = "fd_keyword")
    private String fdKeyword;

    @TableField(value = "fd_is_available")
    private Boolean fdIsAvailable;

    @TableField(value = "fd_is_abandon")
    private Boolean fdIsAbandon;

    @TableField(value = "fd_is_business")
    private Boolean fdIsBusiness;

    @TableField(value = "fd_import_info")
    private String fdImportInfo;

    @TableField(value = "fd_flag_deleted")
    private Boolean fdFlagDeleted;

    @TableField(value = "fd_ldap_dn")
    private String fdLdapDn;

    @TableField(value = "fd_memo")
    private String fdMemo;

    @TableField(value = "fd_hierarchy_id")
    private String fdHierarchyId;

    @TableField(value = "fd_create_time")
    private Date fdCreateTime;

    @TableField(value = "fd_alter_time")
    private Date fdAlterTime;

    @TableField(value = "fd_org_email")
    private String fdOrgEmail;

    @TableField(value = "fd_persons_number")
    private Integer fdPersonsNumber;

    @TableField(value = "fd_pre_dept_id")
    private String fdPreDeptId;

    @TableField(value = "fd_pre_post_ids")
    private String fdPrePostIds;

    @TableField(value = "fd_this_leaderid")
    private String fdThisLeaderid;

    @TableField(value = "fd_super_leaderid")
    private String fdSuperLeaderid;

    @TableField(value = "fd_parentorgid")
    private String fdParentorgid;

    @TableField(value = "fd_parentid")
    private String fdParentid;

    @TableField(value = "fd_cateid")
    private String fdCateid;

    @TableField(value = "auth_reader_flag")
    private Boolean authReaderFlag;

    private static final long serialVersionUID = 1L;

    public static final String COL_FD_ID = "fd_id";

    public static final String COL_FD_ORG_TYPE = "fd_org_type";

    public static final String COL_FD_NAME = "fd_name";

    public static final String COL_FD_NAME_PINYIN = "fd_name_pinyin";

    public static final String COL_FD_NAME_SIMPLE_PINYIN = "fd_name_simple_pinyin";

    public static final String COL_FD_ORDER = "fd_order";

    public static final String COL_FD_NO = "fd_no";

    public static final String COL_FD_KEYWORD = "fd_keyword";

    public static final String COL_FD_IS_AVAILABLE = "fd_is_available";

    public static final String COL_FD_IS_ABANDON = "fd_is_abandon";

    public static final String COL_FD_IS_BUSINESS = "fd_is_business";

    public static final String COL_FD_IMPORT_INFO = "fd_import_info";

    public static final String COL_FD_FLAG_DELETED = "fd_flag_deleted";

    public static final String COL_FD_LDAP_DN = "fd_ldap_dn";

    public static final String COL_FD_MEMO = "fd_memo";

    public static final String COL_FD_HIERARCHY_ID = "fd_hierarchy_id";

    public static final String COL_FD_CREATE_TIME = "fd_create_time";

    public static final String COL_FD_ALTER_TIME = "fd_alter_time";

    public static final String COL_FD_ORG_EMAIL = "fd_org_email";

    public static final String COL_FD_PERSONS_NUMBER = "fd_persons_number";

    public static final String COL_FD_PRE_DEPT_ID = "fd_pre_dept_id";

    public static final String COL_FD_PRE_POST_IDS = "fd_pre_post_ids";

    public static final String COL_FD_THIS_LEADERID = "fd_this_leaderid";

    public static final String COL_FD_SUPER_LEADERID = "fd_super_leaderid";

    public static final String COL_FD_PARENTORGID = "fd_parentorgid";

    public static final String COL_FD_PARENTID = "fd_parentid";

    public static final String COL_FD_CATEID = "fd_cateid";

    public static final String COL_AUTH_READER_FLAG = "auth_reader_flag";

    public static SysOrgElement buildDept(UmCommon umCommon) {
        String umCommonName = umCommon.getName();
        String fdId = IdUtil.fastSimpleUUID();
        return SysOrgElement.builder()
                .fdId(fdId)
                .fdOrgType(2)
                .fdName(umCommonName)
                .fdNamePinyin(PinyinUtil.getPinyin(umCommonName, StrUtil.EMPTY))
                .fdNameSimplePinyin(PinyinUtil.getFirstLetter(umCommonName, StrUtil.EMPTY))
                .fdNo(umCommon.getPriority())
                .fdKeyword(umCommon.getSymbol())
                .fdIsAvailable(Boolean.TRUE)
                .fdIsAbandon(Boolean.FALSE)
                .fdIsBusiness(Boolean.TRUE)
                .fdMemo(umCommon.getDescription())
                .fdHierarchyId(StrUtil.format("x{}x", fdId))
                .fdCreateTime(DateUtil.date())
                .fdAlterTime(DateUtil.date())
                .build();
    }

    public static SysOrgElement buildGroup(UmCommon umCommon) {
        String umCommonName = umCommon.getName();
        String fdId = IdUtil.fastSimpleUUID();
        return SysOrgElement.builder()
                .fdId(fdId)
                .fdOrgType(16)
                .fdName(umCommonName)
                .fdNamePinyin(PinyinUtil.getPinyin(umCommonName, StrUtil.EMPTY))
                .fdNameSimplePinyin(PinyinUtil.getFirstLetter(umCommonName, StrUtil.EMPTY))
                .fdNo(umCommon.getPriority())
                .fdKeyword(umCommon.getSymbol())
                .fdIsAvailable(Boolean.TRUE)
                .fdIsAbandon(Boolean.FALSE)
                .fdIsBusiness(Boolean.TRUE)
                .fdMemo(umCommon.getDescription())
                .fdHierarchyId(StrUtil.format("x{}x", fdId))
                .fdCreateTime(DateUtil.date())
                .fdAlterTime(DateUtil.date())
                .authReaderFlag(Boolean.TRUE)
                .build();
    }

    public static SysOrgElement buildPerson(String fdId, UmUser umUser, UmCommon umCommon) {
        String umCommonName = StrUtil.format("{}_generate", umCommon.getName());
        return SysOrgElement.builder()
                .fdId(fdId)
                .fdOrgType(8)
                .fdName(umCommonName)
                .fdNamePinyin(PinyinUtil.getPinyin(umCommonName, StrUtil.EMPTY))
                .fdNameSimplePinyin(PinyinUtil.getFirstLetter(umCommonName, StrUtil.EMPTY)).fdNo(umCommon.getPriority())
                .fdKeyword(umCommon.getSymbol())
                .fdIsAvailable(Boolean.TRUE)
                .fdIsAbandon(Boolean.FALSE)
                .fdIsBusiness(Boolean.TRUE)
                .fdMemo(umCommon.getDescription())
                .fdHierarchyId(StrUtil.format("x{}x", fdId))
                .fdCreateTime(DateUtil.date())
                .fdAlterTime(DateUtil.date())
                .build();
    }

}