 /*
  * Powered By zsCat, Since 2014 - 2020
  */
package com.zscat.blog.api.service;


 import com.zsCat.common.base.BaseService;
 import com.zscat.blog.api.model.Blogger;

 /**
 * 
 * @author zsCat 2017-4-14 13:56:18
 * @Email: 951449465@qq.com
 * @version 4.0v
 */
public interface BloggerService extends BaseService<Blogger> {

	Blogger checkBlogger(String username, String password);


}
