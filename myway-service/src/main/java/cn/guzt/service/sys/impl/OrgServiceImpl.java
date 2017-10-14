package cn.guzt.service.sys.impl;

import cn.guzt.dao.TSysOrgMapper;
import cn.guzt.dao.TSysUserMapper;
import cn.guzt.domain.TSysOrg;
import cn.guzt.service.sys.OrgService;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class OrgServiceImpl implements OrgService {

    @Resource
    private TSysOrgMapper tSysOrgMapper;

    @Override
    public TSysOrg selectById(Integer id) {
        return tSysOrgMapper.selectByPrimaryKey(id);
    }
}
