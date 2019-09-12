$(function(){
    $('.ul01').css('min-height', $('.imgItem').height())
    // console.log($(window).width())
    // 导航点击
    $('.layui-nav').on('click','.layui-nav-item a',function(){
      var filter = $(this)[0].dataset.filter;
    //   console.log(filter)
      $('.layui-nav-item').removeClass('layui-this');
      $(this).addClass('layui-this');
      if(filter == '*'){
        $('.imgItem').width("33.3%")
      }else{
        if( $(window).width() > 430){
            $(filter).width("33.3%")
        }else{
            $(filter).width("100%")
        }  
        $('.imgItem:not('+ filter +')').width(0)
      }
    })
    $('.lookMore_p1').on('click',function(){
        layer.msg('没有更多案例了~')
    })
})