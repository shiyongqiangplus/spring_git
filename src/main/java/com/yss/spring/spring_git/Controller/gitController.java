/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: gitController
 * Author:   lenovo
 * Date:     2018-05-04 11:07
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.yss.spring.spring_git.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author lenovo
 * @create 2018-05-04
 * @since 1.0.0
 */
@RestController
public class gitController {

    @RequestMapping("/getString")
    public String getString(){
        return "Success";
    }
}
