$(function(){
	console.log("test");
	//alert("tess");
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
