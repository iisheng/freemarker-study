<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <meta name="description"
          content="六合创意设计公司是一家致力于为注重企业形象和品牌气质的高要求客户提供整体形象创建与改造升级设计服务,由业内知名总监合力智建,靠专业和口碑吸引众多客户,六合创意的客户遍布全球,跨越各大行业.">
    <title>六合原创观点</title>
    <link rel="stylesheet" href="/js/css/layui.css">
    <link rel="stylesheet" href="/css/resize.css">
    <link rel="stylesheet" href="/css/news.css">
    <link rel="stylesheet" href="/css/common.css">
    <link rel="stylesheet" href="/css/media.css">
    <link rel="stylesheet" href="http://at.alicdn.com/t/font_1379887_qtmt02gd0bc.css">
    <style>
        @font-face {
            font-family: 'PingFangEL1a9cef6c2117e93';
            src: url('http://cdn.repository.webfont.com/webfonts/vipjs/97939/47100/5d2cff86344aa8126a224ae6.gif');
            src: url('http://cdn.repository.webfont.com/webfonts/vipjs/97939/47100/5d2cff86344aa8126a224ae6.gif?#iefix') format('embedded-opentype'),
            url('http://cdn.repository.webfont.com/webfonts/vipjs/97939/47100/5d2cff86344aa8126a224ae6.png') format('woff2'),
            url('http://cdn.repository.webfont.com/webfonts/vipjs/97939/47100/5d2cff86344aa8126a224ae6.bmp') format('woff'),
            url('http://cdn.repository.webfont.com/webfonts/vipjs/97939/47100/5d2cff86344aa8126a224ae6.jpg') format('truetype');
            font-weight: normal;
            font-style: normal;
        }
    </style>
</head>
<body>
<script>
    function newsDetail(id) {
        window.open("/news/" + id + ".html");
    }
</script>
<div class="header_wrap">
    <div class="header">
        <p><a href="#"> <img src="/img/logo.png"/> </a></p>
        <p id="menu"><i class="iconfont icon-caidananniu1" style="font-size: 24px;cursor:pointer"></i></p>
    </div>
    <div class="nav_warp">
        <ul class="nav">
            <li><a href="/"> 首页 </a></li>
            <li><a href="/about.html"> 关于我们 </a></li>
            <li><a href="/news1.html"> 原创观点 </a></li>
            <li><a href="/contact.html"> 联系 </a></li>
        </ul>
        <p class="close">
            <img src="./img/close.png"/>
        </p>
    </div>
</div>
<div class="container">
    <div class="news_nav clearfix">
        <p>NEWS</p>
        <P><span><a href="/news1.html">六合最新动态</a></span> <span class="line">|</span> <span><a
                        href="/news2.html">六合原创观点</a></span></P>
    </div>
    <ul class="article">

        <#list list as model>
            <li class="article_item">
                <a class="clearfix">
                    <div class="article_left">
                        <img src="${model.coverImgUrl}"/>
                    </div>
                    <div class="article_right">
                        <p class="time">${model.publishTime?string("yyyy-MM-dd")}</p>
                        <p class="title">${model.title}</p>
                        <p class="abstract">${model.summary}</p>
                        <p class="read" onclick="newsDetail(${model.id})">Read the article</p>
                    </div>
                </a>
            </li>

        </#list>

    </ul>
</div>
<div class="footer">
    <div class="clearfix">
        <div class="service">
            <p class="sp1">我们的服务</p>
            <p>logo/VI设计</p>
            <p>画册设计</p>
            <p>包装设计</p>
            <p>文化墙设计</p>
            <p>线上与宣传</p>
        </div>
        <div class="aboutus">
            <p class="sp1"><a href="static/about.html">关于我们</a></p>
            <p><a href="/news2.html">最新动态</a></p>
        </div>
        <div class="contact">
            <p class="sp1"><a href="static/contact.html">联系我们</a></p>
            <p>电话：18210877632 18510147398</p>
            <p>邮箱：liuhecy@yeah.net</p>
            <p>
                <img src="/img/qrcode01.png"/>
                <img src="/img/qrcode01.png"/>
            </p>
        </div>
        <div class="footer-logo">
            <img src="/img/logo.png"/>
        </div>
    </div>
    <div class="rights">
        <p style="margin-bottom: 0;">北京六合创意广告有限公司</p>
        <p>Copyright ©2019 www.liuhe.com 六合创意 版权所有 京ICP19019535 </p>
    </div>
</div>
<script src="/js/rem.js"></script>
<script src="/js/jquery-3.2.1.min.js"></script>
<script src="/js/common.js"></script>
<script src="/js/news.js"></script>
</body>
</html>