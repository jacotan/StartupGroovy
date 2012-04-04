package org.startupgroovy.example

class BooleanExample {

    public boolean 整数を真偽判定に使う(Integer i){
        //return i.asBoolean();
        return !(i == 0)
    }

    public boolean 文字列を真偽判定に使う(String string){
        //return string.asBoolean()
        return !(string.length() == 0)
    }

    public boolean オブジェクトを真偽判定に使う(Object object){
        //return object.asBoolean()
        return !(object == null)
    }

    public boolean マップを真偽判定に使う(Map map){
        //return map.asBoolean()
        return !(map.isEmpty())
    }

    public boolean リストを真偽判定に使う(List list){
        //return list.asBoolean()
        return !(list.isEmpty())
    }
}
