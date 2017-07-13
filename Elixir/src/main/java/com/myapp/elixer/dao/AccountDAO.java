package com.myapp.elixer.dao;

import com.myapp.elixer.entity.Account;

public interface AccountDAO {

	public Account findAccount(String userName);

}