package org.ibase4j.web;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.ibase4j.model.SysDept;
import org.ibase4j.service.SysDeptService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import top.ibase4j.core.base.BaseController;
import top.ibase4j.core.util.WebUtil;

/**
 * 部门管理控制类
 *
 * @author ShenHuaJie
 * @version 2016年5月20日 下午3:13:31
 */
@RestController
@Api(value = "部门管理", description = "部门管理")
@RequestMapping(value = "dept")
public class SysDeptController extends BaseController<SysDept, SysDeptService> {

    @ApiOperation(value = "查询部门")
    @RequiresPermissions("sys.base.dept.read")
    @GetMapping(value = "/read/list")
    public Object queryList(HttpServletRequest request) {
        Map<String, Object> param = WebUtil.getParameter(request);
        return super.queryList(param);
    }

    @ApiOperation(value = "查询部门")
    @RequiresPermissions("sys.base.dept.read")
    @GetMapping(value = "/read/page")
    public Object query(HttpServletRequest request) {
        Map<String, Object> param = WebUtil.getParameter(request);
        return super.query(param);
    }

    @ApiOperation(value = "部门详情")
    @RequiresPermissions("sys.base.dept.read")
    @GetMapping(value = "/read/detail")
    public Object get(SysDept param) {
        return super.get(param);
    }

    @Override
    @PostMapping
    @ApiOperation(value = "修改部门")
    @RequiresPermissions("sys.base.dept.update")
    public Object update(SysDept param) {
        return super.update(param);
    }

    @Override
    @DeleteMapping
    @ApiOperation(value = "删除部门")
    @RequiresPermissions("sys.base.dept.delete")
    public Object delete(SysDept param) {
        return super.delete(param);
    }
}
