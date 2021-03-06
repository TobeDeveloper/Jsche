package org.jsche.web.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.jsche.entity.SystemUsage;

/**
 * Created by Intellij IDEA. Author myan
 * Date 2017/3/29.
 */
@Mapper
public interface SystemUsageDao {
    @Insert("Insert into system_usages(client_ip,date_stamp,method,path,status)" +
            " values (#{clientIp},#{dateStamp},#{method},#{path},#{status})" )
    void save(SystemUsage usage);
}
