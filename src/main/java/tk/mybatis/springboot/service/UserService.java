package tk.mybatis.springboot.service;

import java.util.List;

import tk.mybatis.simple.model.SysUser;

public interface UserService {
	
	public SysUser findById(Long id);
	
	public List<SysUser> findAll();
}
