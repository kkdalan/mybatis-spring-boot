package tk.mybatis.springboot.service;

import tk.mybatis.simple.model.SysUser;

public interface UserService {
	public SysUser findById(Long id);
}
