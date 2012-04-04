package org.startupgroovy.example

class MapExample {

    public String 指定されたmapから指定されたkeyでバリューを取得する(Map map, String key){
        return map[key]
    }

    public Map 指定されたmapに指定されたkeyとvalueを追加する(Map map , String key, String value){
        map.put(key, value)
        return map // map.putの返り値をそのまま返すと挿入が成功したかどうかのbool値が帰ってしまう
    }

    public Map 指定されたmapから指定されたkeylistの各要素と適合するキーをもつMapの部分集合を返す(Map map, List keyList){
        return map.subMap(keyList)
    }

    public Map 存在しないキーを指定されたときに30を返すMapを指定されたkeyとvalueで作成する(String key, String value){
        return [key:value].withDefault {30}
    }
}
