<template>
  <div id="app">
    <el-row>
      <el-col :span="10">
        <el-form ref="form" :model="form" label-width="40px">
          <el-form-item label="姓名">
            <el-input name="name" v-model="form.name"></el-input>
          </el-form-item>
          <el-form-item label="学号">
            <el-input name="id" v-model="form.id"></el-input>
          </el-form-item>
          <el-form-item label="作业">
            <el-upload
              name="file"
              class="upload-demo"
              ref="upload"
              action="http://localhost/assignment/upload"
              :on-success="onUploadSuccessfully"
              :auto-upload="false"
            >
              <el-button slot="trigger" size="small" type="primary">选取作业</el-button>
              <el-button
                style="margin-left: 10px;"
                size="small"
                type="success"
                @click="submitUpload"
              >上传到服务器</el-button>
              <div slot="tip" class="el-upload__tip">只能上传.c文件，且不超过50kb</div>
            </el-upload>
          </el-form-item>
          <el-form-item>
            <el-button type="primary" @click="onSubmit">提交</el-button>
          </el-form-item>
        </el-form>
      </el-col>
    </el-row>
  </div>
</template>

<style>
.el-row {
  display: flex;
  justify-content: center;
  margin-top: 50px;
}

.el-form {
  border: 1px solid #ccc;
  border-radius: 6px;
  padding: 20px;
  background-color: cornsilk;
}

.upload-demo {
  padding: 10px;
  border: 1px solid #cccccc;
  border-radius: 6px;
}
</style>

<script>
import Axios from "axios";

export default {
  data() {
    return {
      form: {
        name: "",
        id: "",
        file: ""
      }
    };
  },
  methods: {
    submitUpload() {
      this.$refs.upload.submit();
    },
    onUploadSuccessfully(response) {
      this.form.file = response;
    },
    onSubmit() {
      Axios.post("http://localhost/assignment", this.form).then(
        response => console.log(`提交成功！作业id为${response.data}`)
      );
    }
  }
};
</script>

