<template>
  <div class="tabble_ground">
    <div class="moudle_name">管理员管理</div>
    <div class="input_button">
      <div class="input_box">
        <el-input placeholder="请输入查询内容" size="small"  v-model="input" class="input_left"><i slot="suffix" class="el-input__icon el-icon-search"></i></el-input>
      </div>
      <div class="button_box">
        <el-button type="success" size="small" class="button_right">新增</el-button>
      </div>
    </div>
    <el-table :data="tableData" border style="width: 100%" fit="true" stripe :cell-style="{ textAlign: 'center' }" :header-cell-style="{ textAlign: 'center' }">
      <el-table-column fixed prop="date" label="日期" width="150"></el-table-column>
      <el-table-column prop="name" label="姓名"></el-table-column>
      <el-table-column prop="province" label="省份"></el-table-column>
      <el-table-column prop="city" label="市区"></el-table-column>
      <el-table-column prop="address" label="地址"></el-table-column>
      <el-table-column prop="zip" label="邮编"></el-table-column>
      <el-table-column fixed="right" label="操作">
        <template slot-scope="scope">
          <el-button @click="handleClick(scope.row)" type="text" size="small">查看</el-button>
          <el-button type="text" size="small">编辑</el-button>
        </template>
      </el-table-column>
    </el-table>
    <div class="block" style="text-align: right;margin-top: 50px">
      <el-pagination
          background
          @size-change="handleSizeChange"
          @current-change="handleCurrentChange"
          :current-page="currentPage4"
          :page-sizes="[100, 200, 300, 400]"
          :page-size="100"
          layout="prev, pager, next"
          :total="1000">
      </el-pagination>
    </div>
  </div>
</template>
<script>
export default {
  methods: {
    handleClick(row) {
      console.log(row);
    },
    handleSizeChange(val) {
      console.log(`每页 ${val} 条`);
    },
    handleCurrentChange(val) {
      console.log(`当前页: ${val}`);
    }
  },

  data() {
    return {
      input:'',
      currentPage1: 5,
      currentPage2: 5,
      currentPage3: 5,
      currentPage4: 4,
      tableData: [{
        date: '2016-05-02',
        name: '王小虎',
        province: '上海',
        city: '普陀区',
        address: '上海市普陀区金沙江路 1518 弄',
        zip: 200333
      }, {
        date: '2016-05-04',
        name: '王小虎',
        province: '上海',
        city: '普陀区',
        address: '上海市普陀区金沙江路 1517 弄',
        zip: 200333
      }, {
        date: '2016-05-01',
        name: '王小虎',
        province: '上海',
        city: '普陀区',
        address: '上海市普陀区金沙江路 1519 弄',
        zip: 200333
      }, {
        date: '2016-05-03',
        name: '王小虎',
        province: '上海',
        city: '普陀区',
        address: '上海市普陀区金沙江路 1516 弄',
        zip: 200333
      }]
    }
  }
}
</script>