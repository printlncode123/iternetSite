package cn.music.service;

import java.util.List;

import cn.music.po.User;
public interface UserService {
   public boolean regist(User user);
   public User login(User user);
   public User findUserById(int id);
   public List<User> getUsers();
}
