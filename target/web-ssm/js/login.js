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
				console.log(data.name);
                $("#inputrecord").val(data.name);

            }else{

            }
        }});
}

function dispayQrCode() {
    //$('.qrCode').attr("src",disPlayImgUrl+"?ticket="+qrTicket);
    $('.box').css('display','none')
    $('body').shadow
    $('.qrdiv').css('display','inline');
}

