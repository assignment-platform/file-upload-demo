### 操作说明
此工程用于演示`vuejs + spring boot`构成的前后端分离的应用如何进行文件上传。

* 环境要求：必须在本地安装好以下软件

  * Git
  * IDE: VS Code, IDEA
  * Chrome浏览器
  * nodejs, jdk
  * Maven

* 下载代码：`git clone https://github.com/assignment-platform/file-upload-demo`

### 运行前端
* 在vscode中打开`vue-frontend`工程。此工程用于演示文件上传的前端界面。此工程使用的框架有：

  * `element ui`：使用到的组件有`el-form`和`el-upload`
  * `Axios`：用于向后端提交请求
* 在运行`vue-frontend`前，请先执行`npm install` 或 `yarn install`，以确保所有的第三方框架或库文件安装完成
* 运行`npm run serve` 或 `yarn serve` 来启动前端开发服务器。然后在浏览器中输入`http://localhost:8080` 地址，即可看到前端页面

### 运行后端
* 使用IDEA打开 `spring-boot-backend` 项目，确保Maven正确加载所有的开发包
* 找到`FileUploadDemoApplication.java`文件并执行，然后服务器会在80端口监听

### 测试
* 在浏览器中，选择作业文件后，点击`上传到服务器`按钮
* 填写学生姓名和学号
* 点击`提交`按钮，即可在浏览器的Console窗口中看到作业的ID信息
* 在IDEA的窗口中，可以看到前端提交的作业信息。