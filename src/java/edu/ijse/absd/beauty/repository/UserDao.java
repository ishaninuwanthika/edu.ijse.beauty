/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.beauty.repository;

import edu.ijse.absd.beauty.model.SuperModel;
import edu.ijse.absd.beauty.model.UserModel;
import java.io.Serializable;

/**
 *
 * @author Ruchira
 */
public interface UserDao extends SuperDao<UserModel>{

    public Serializable add(UserModel userModel);

    public UserModel search(UserModel userModel);

}
