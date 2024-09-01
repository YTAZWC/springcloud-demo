var http = require('http')
var url = require("url")
var path = require('path')

// 创建 Server
var server = http.createServer(function (req, res) {
    // 获取请求的路径
    var pathname = url.parse(req.url).pathname;
    res.writeHead(200, {'Context-Type' : 'application/json; charset=GBK18030'});
    if (pathname === '/') {
        // 访问http://localhost:8060/ 返回 {"index": "欢迎来到首页"}
        res.end(JSON.stringify({"index": "欢迎来到首页"}));
    } else if (pathname === '/health.json') {
        // 访问http://localhost:8060/health 返回 {"status": "UP"}
        // 对eureka来说 返回 up 表示ok 也可返回down表示no或者程序崩溃无结果默认为down
        res.end(JSON.stringify({"status": "up"}));
    } else if (pathname === '/userinfo.json') {
        res.end(JSON.stringify({"name":"ytazwc", "age": 21, "address": "China"}));
    } else {
        res.end("404");
    }
});
// 创建监听, 并打印日志 服务运行端口为8060
server.listen(8060, function () {
    console.log('listening on localhost:8060');
});