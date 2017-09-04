package cn.appsys.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.appsys.dao.BackendUserMapper;
import cn.appsys.pojo.BackendUser;
@Service
public class BackendUserServiceImpl implements BackendUserService {

	@Resource
	public BackendUserMapper backendUser;
	public BackendUser login(BackendUser backendUserd) {
		return backendUser.login(backendUserd);
	}

}
