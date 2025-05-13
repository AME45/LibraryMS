<template>
  <div>
    <el-container style="height: 500px;">
      <!--      侧边栏-->
      <el-aside  class="m-aside">
        <!--        logo和系统名称-->
        <div class="m-sysName" >
          <img src="assets/logo.png" alt="" width="10%">
          <span class="m-nameText">练习</span>
        </div>
        <!--        侧边菜单栏-->
        <el-menu class="el-menu" >
          <el-submenu index="1">
            <template slot="title"><i class="el-icon-user"></i>用户管理</template>
            <el-menu-item index="1-1">选项1</el-menu-item>
            <el-menu-item index="1-2">选项2</el-menu-item>
          </el-submenu>
          <el-submenu index="2">
            <template slot="title"><i class="el-icon-news"></i>信息管理</template>
            <el-menu-item index="2-1">选项1</el-menu-item>
            <el-menu-item index="2-2">选项2</el-menu-item>
          </el-submenu>
          <el-submenu index="3">
            <template slot="title"><i class="el-icon-set-up"></i>系统设置</template>
            <el-menu-item index="3-1">选项1</el-menu-item>
            <el-menu-item index="3-2">选项2</el-menu-item>
          </el-submenu>
        </el-menu>
      </el-aside>
      <!--      右侧-->
      <el-container class="right-container">
        <!--        顶部菜单栏-->
        <el-header class="top-header">
          <img src="assets/avtar.jpg" alt="" style="width: 40px;border-radius: 50%;margin-right: 10px;">
          <span style="color: #4c5a73;font-weight: bold;font-size: 14px;margin-right: 20px">王小虎</span>
          <el-dropdown>
            <i class="el-icon-setting" style="margin-right: 15px"></i>
            <el-dropdown-menu slot="dropdown">
              <el-dropdown-item>个人中心</el-dropdown-item>
              <el-dropdown-item>退出登录</el-dropdown-item>
            </el-dropdown-menu>
          </el-dropdown>

        </el-header>
        <!--表单-->
        <el-main >
          <el-table :data="tableData">
            <el-table-column prop="date" label="日期" width="140">
            </el-table-column>
            <el-table-column prop="name" label="姓名" width="120">
            </el-table-column>
            <el-table-column prop="address" label="地址">
            </el-table-column>
          </el-table>
        </el-main>
      </el-container>
    </el-container>
    <router-view/>
  </div>
</template>

<script>
export default {
  data() {
    const item = {
      date: '2016-05-02',
      name: '王小虎',
      address: '上海市普陀区金沙江路 1518 弄'
    };
    return {
      tableData: Array(20).fill(item)
    }
  }
};
</script>
