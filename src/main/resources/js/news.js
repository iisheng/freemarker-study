$(function(){

    $(window).scroll(function(){
        console.log( $(window).scrollTop(), $(window).height(),$(document).height(),$('.footer').height() )
        if( $(window).scrollTop() + $(window).height() >= $(document).height() - 20 - Math.floor($('.footer').height()) ){
             console.log('滑动到底部了')
        }
    })
       
})