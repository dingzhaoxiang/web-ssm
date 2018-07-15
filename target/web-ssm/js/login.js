$(function(){
	console.log("test");
	//alert("tess");
    $(".QR_Login").click(function(){
        $(".box").hide();
        dispayQrCode();
    });

})

function recordInput (value) {
	console.log("recordInput");
    $.ajax({
        type:'POST',
        url:loginUrl,
        async: true,
        data:{"name":value},
        dataType:'json',
        //contentType:"application/x-www-form-urlencoded",
        //beforeSend:function(xhr){alert(str);xhr.setRequestHeader('arr',str);}
        //beforeSend:function(xhr){xhr.setRequestHeader('str',str);},
        success:function(data){
            if(data.code==200){
                $("#inputrecord").val(data.name);

            }else{

            }
        }});
}

function userAuten () {
    var name = $("#userName").val();
    var password = $("#password").val();
    console.log("userAuten");
    $.ajax({
        type:'POST',
        url:authenUrl,
        async: true,
        data:{"name":name,"password":password},
        dataType:'json',
        //contentType:"application/x-www-form-urlencoded",
        //beforeSend:function(xhr){alert(str);xhr.setRequestHeader('arr',str);}
        //beforeSend:function(xhr){xhr.setRequestHeader('str',str);},
        success:function(data){
            if(data.code==200){
                console.log(data.name);
                $("#userName").val(data.name);
                $("#password").val("密码正确");
                $(location).attr('href', 'user/showUser.do');
            }else{
                $("#userName").val(data.name);
                $("#password").val("密码错误");
            }
        }});
}


function dispayQrCode() {
    //$('.qrCode').attr("src",disPlayImgUrl+"?ticket="+qrTicket);
    $('.box').css('display','none')
    $('body').blur();
    $('.qrdiv').css('display','inline');
}

