package com.myapp.springmvcsecurityuserregistration.dao;

import com.myapp.springmvcsecurityuserregistration.entity.Role;

public interface RoleDao {

    public Role findRoleByName(String theRoleName);
}
