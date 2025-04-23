const base = {
    get() {
        return {
            url : "http://localhost:8080/chongwuyiyuanyuyueguahao/",
            name: "chongwuyiyuanyuyueguahao",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/chongwuyiyuanyuyueguahao/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "宠物医院预约挂号系统"
        } 
    }
}
export default base
