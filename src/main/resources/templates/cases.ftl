<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <meta name="description"
          content="六合创意设计公司是一家致力于为注重企业形象和品牌气质的高要求客户提供整体形象创建与改造升级设计服务,由业内知名总监合力智建,靠专业和口碑吸引众多客户,六合创意的客户遍布全球,跨越各大行业.">
    <title>六合创意-logo/VI设计-画册设计-包装设计-文化墙设计-线上与宣传</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/Swiper/4.0.2/css/swiper.min.css">
    <link rel="stylesheet" href="./js/css/layui.css">
    <link rel="stylesheet" href="./css/resize.css">
    <link rel="stylesheet" href="./css/common.css">
    <link rel="stylesheet" href="./css/index.css">
    <link rel="stylesheet" href="./css/media.css">
    <link rel="stylesheet" href="http://at.alicdn.com/t/font_1379887_qtmt02gd0bc.css">
    <!-- <script src="http://cdn.webfont.youziku.com/wwwroot/js/wf/youziku.api.min.js"></script> -->
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
<div class="header_wrap">
    <div class="header">
        <p><a href="#"> <img src="./img/logo.png"/> </a></p>
        <p id="menu"><i class="iconfont icon-caidananniu1" style="font-size: 24px;cursor:pointer"></i></p>
    </div>
    <div class="nav_warp">
        <ul class="nav">
            <li><a href="/home.html"> 首页 </a></li>
            <li><a href="/about.html"> 关于我们 </a></li>
            <li><a href="/newses.html"> 原创观点 </a></li>
            <li><a href="/contact.html"> 联系 </a></li>
        </ul>
        <p class="close">
            <img src="/img/close.png"/>
        </p>
    </div>
</div>
<div class="swiper-container">
    <div class="swiper-wrapper">
        <div class="swiper-slide">
            <a href="#"> <img src="http://cdn1.hzvis.com/upfile/image/2018/08/1534253042_4636.jpg"/> </a>
        </div>
        <div class="swiper-slide">
            <a href="#"> <img src="http://cdn1.hzvis.com/upfile/image/2018/07/1531995511_5042.jpg"/> </a>
        </div>
        <div class="swiper-slide">
            <a href="#"> <img src="http://cdn1.hzvis.com/upfile/2017/12/20171201174150_262.jpg"/> </a>
        </div>
    </div>
    <div class="swiper-pagination"></div><!--分页器。如果放置在swiper-container外面，需要自定义样式。-->
    <div class="swiper-button-prev">
        <div class="mySwiperBtn">
            <i class="iconfont icon-zuoyoujiantou2" style="font-size: 44px;position: relative;top:8px;left: 3px;"></i>
        </div>
    </div><!--左箭头。如果放置在swiper-container外面，需要自定义样式。-->
    <div class="swiper-button-next">
        <div class="mySwiperBtn">
            <i class="iconfont icon-zuoyoujiantou1" style="font-size: 44px;position: relative;top:8px;left: 9px;"></i>
        </div>
    </div><!--右箭头。如果放置在swiper-container外面，需要自定义样式。-->
</div>
<div class="intro">
    <p class="moto"> 让你的品牌更有价值，是我们一直以来的追求 </p>
    <div class="othermoto">
        <p> 立足从“策略、创意到执行”的全链条传播体系，</p>
        <p> 构建线上到线下多维一体化平台，以杰出的创意和精良的执行力为企业构建全新的品牌视觉形象。</p>
    </div>
</div>
<div class="content-nav">
    <ul class="layui-nav">
        <li class="layui-nav-item layui-this"><a data-filter="*">ALL</a></li>
        <li class="layui-nav-item"><a data-filter=".fl01">logo/VI设计</a></li>
        <li class="layui-nav-item"><a data-filter=".fl02">画册设计</a></li>
        <li class="layui-nav-item"><a data-filter=".fl03">包装设计</a></li>
        <li class="layui-nav-item"><a data-filter=".fl04">文化墙设计</a></li>
        <li class="layui-nav-item"><a data-filter=".fl05">线上与宣传</a></li>
    </ul>
</div>
<div class="imgListWrap">
    <ul class="ul01 clearfix">

        <#list list as model>
            <li class="${model.type}">
                <a href="/case/${model.id}.html">
                    <img src="${model.image}"/>
                    <div class="shadow">
                        <p class="itemTitle">${model.title}</p>
                        <p class="itemInfo">
                            -
                            <br/>
                            <span class="sy1">${model.customerName}</span>
                            <br>
                            ${model.serviceContent}
                        </p>
                    </div>
                </a>
            </li>
        </#list>

    </ul>
</div>
<div class="lookMore_wrap">
    <p class="lookMore_p1">更多案例</p>
    <p class="lookMore_p2"> 让品牌更有价值！ </p>
    <p class="lookMore_p3"> 帮助合作伙伴的品牌在复杂多变的市场中稳健前行 </p>
</div>
<div style="margin:0 auto;display:flex;justify-content: center;position: relative;">
    <ul class="sponsor_wrap clearfix">
        <li><img src="/img/logo.png"/></li>
        <li><img src="http://cdn1.hzvis.com/static/logo.png"/></li>
        <li><img src="/img/logo.png"/></li>
        <li><img src="/img/logo.png"/></li>
        <li><img src="/img/logo.png"/></li>
        <li><img src="/img/logo.png"/></li>
        <li><img src="/img/logo.png"/></li>
        <li><img src="/img/logo.png"/></li>
    </ul>
</div>
<div class="together">
    我们期待和您共同成长！
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
            <p class="sp1"><a href="../static/about.html">关于我们</a></p>
            <p><a href="../news.html">最新动态</a></p>
        </div>
        <div class="contact">
            <p class="sp1"><a href="./contact.html">联系我们</a></p>
            <p>电话：18210877632 18510147398</p>
            <p>邮箱：liuhecy@yeah.net</p>
            <p>
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
<script src="https://cdnjs.cloudflare.com/ajax/libs/Swiper/4.0.2/js/swiper.js"></script>
<script src="/js/rem.js"></script>
<script src="/js/jquery-3.2.1.min.js"></script>
<script src="/js/layui.all.js"></script>
<script src="/js/common.js"></script>
<script src="/js/index.js"></script>
<script>
    var mySwiper = new Swiper('.swiper-container', {
        autoplay: true,//可选选项，自动滑动
        effect: 'fade',
        speed: 1000,
        loop: true,
        navigation: {
            nextEl: '.swiper-button-next',
            prevEl: '.swiper-button-prev',
        },
        fadeEffect: {
            crossFade: true,
        },
        pagination: {
            el: '.swiper-pagination',
            dynamicBullets: true,
            clickable: true,
        },
    })
    //如果只有一个slide就销毁swiper
    if (mySwiper.slides.length <= 1) {
        mySwiper.destroy();
    }
    layui.use('element', function () {
        var element = layui.element;
    });
</script>
</body>
</html>