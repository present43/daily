package com.example.design.factory.simpleFactory;

public enum PizzType {

    BJ_PIZZ("BJ","1"),
    SH_PIZZ("SH","2"),
    UN_KONE("UN","3")
    ;

    private String name;
    private String code;

    PizzType(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public PizzType getTypeByCode(String code) {
        for (PizzType value : PizzType.values()) {
            if (code.equals(value.code)) {
                return value;
            }
        }
        return PizzType.UN_KONE;
    }


}
