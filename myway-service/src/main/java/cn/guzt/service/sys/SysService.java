package cn.guzt.service.sys;

import cn.guzt.domain.TSysOrg;
import cn.guzt.domain.TSysRole;
import cn.guzt.domain.TSysUser;
import com.github.pagehelper.PageInfo;

/**
 * 系统管理
 */
public interface SysService {

    boolean saveOneTSysUser (TSysUser tSysUserSysUser);

    boolean deleteOneTSysUser (TSysUser tSysUserSysUser);

    boolean updateOneTSysUser (TSysUser tSysUserSysUser);

    TSysUser selectOneTSysUser (TSysUser tSysUserSysUser);

    TSysRole selectTSysRoleById(String id);

    TSysOrg selectTSysOrgById(String id);

    PageInfo<TSysUser> selectListTSysUser(TSysUser tSysUserSysUser);

}
