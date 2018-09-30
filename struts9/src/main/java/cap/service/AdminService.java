package cap.service;

import cap.bean.Admin;

import java.util.List;

public abstract class AdminService {

    public abstract List<Admin> findAdmins();


    public abstract Admin findById(int id);



    public abstract int addAdmin(Admin admin);


    public abstract int delAdmin(int id);



    public abstract int updateAdmin(Admin admin);
}
