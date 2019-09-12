(function (doc, win) {
    var docEl = doc.documentElement,
        resizeEvt = 'orientationchange' in window ? 'orientationchange' : 'resize',
        recalc = function () {
            var clientWidth = docEl.clientWidth;
            if (!clientWidth) return;
            if(clientWidth>=375){
                docEl.style.fontSize = '100px';
            }else{
                docEl.style.fontSize = 100 * (clientWidth / 375) + 'px';
            }
        };

    if (!doc.addEventListener) return;
    win.addEventListener(resizeEvt, recalc, false);
    doc.addEventListener('DOMContentLoaded', recalc, false);
    // var docEl = document.documentElement,
    //
    //     resizeEvt = 'orientationchange' in window ? 'orientationchange' : 'resize',
    //     recalc = function () {
    //         var maxWidth = 750;
    //         var cw = docEl.clientWidth > maxWidth ? maxWidth : docEl.clientWidth;
    //         docEl.style.fontSize = 10 * (cw / 320) + 'px';
    //     };
    //
    // recalc();
    // window.addEventListener(resizeEvt, recalc, false);
})(document, window);