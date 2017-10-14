package cn.guzt.service.sys.impl;

import cn.guzt.dao.TSysOrgMapper;
import cn.guzt.dao.TSysRoleMapper;
import cn.guzt.domain.TSysRole;
import cn.guzt.service.sys.RoleService;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    @Resource
    private TSysRoleMapper tSysRoleMapper;

    @Override
    public TSysRole selectById(Integer id) {
        return tSysRoleMapper.selectByPrimaryKey(id);
    }
}
