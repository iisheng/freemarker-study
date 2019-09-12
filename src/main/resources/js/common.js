$(function(){
    // 头部导航
    $('.close').on('click',function(){
        $('.nav_warp').css('height',0)
    })
    $('#menu').on('click',function(){
        $('.nav_warp').css('height',"100%")
    })
    $('.close').hover(function(){
        $(this).css('transform',' rotate(180deg)')
    },function(){
        $(this).css('transform',' rotate(0deg)')
    })
    // 滚动条滚动
    $(window).scroll(function() {
        //为了保证兼容性，这里取两个值，哪个有值取哪一个
        //scrollTop就是触发滚轮事件时滚轮的高度
        var scrollTop = document.documentElement.scrollTop || document.body.scrollTop;
        // console.log("滚动距离" + scrollTop);
        if(scrollTop > 400){
            $('.header_wrap').addClass('scroll_active')
        }else{
            $('.header_wrap').removeClass('scroll_active')
        }
    })
    // 关闭页面
    $('#closePage').on('click',function(){
        // console.log(111)
        window.opener=null;
		window.open('','_self');
		window.close();
    })

    // 分享
    var qrcode = new QRCode($('#qrcode')[0], {
        text: window.location.href,
        width: 128,
        height: 128,
        colorDark : "#000000",
        colorLight : "#ffffff",
        correctLevel : QRCode.CorrectLevel.H
    });
    $('#share').on('click',function(){
        layer = layui.layer
        layer.open({
            type: 1,
            shade: false,
            title: false, //不显示标题
            content: $('.out'), //捕获的元素，注意：最好该指定的元素要存放在body最外层，否则可能被其它的相对元素所影响
            // cancel: function(){
            //   layer.msg('捕获就是从页面已经存在的元素上，包裹layer的结构', {time: 5000, icon:6});
            // }
        });
    })
})