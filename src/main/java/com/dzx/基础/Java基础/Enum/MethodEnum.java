package com.dzx.基础.Java基础.Enum;

public enum MethodEnum {
   Status_Query("场次库存/库存信息查询", "statusQuery"),
   Verify_Book("下单校验","verifyBook"),
   Ticket_BOOK("接口下单","ticketBook"),
   Cancel_Order("取消订单","cancelOrder");

    private String name;

    private String value;

    MethodEnum(String name, String value){
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
