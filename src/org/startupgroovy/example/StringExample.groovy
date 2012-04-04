package org.startupgroovy.example

class StringExample {

    public String hoge引数fugaをプラスを使わずにリテラルで表現する(String string){
        return "hoge${string}fuga";
    }

    public String 文字列リテラルで改行コードを埋め込まずに改行を表現する(){
        return """hoge
fuga
piyo"""
    }

    public Object aをcharとして表現する(){
        //return "a".charAt(0)
        return 'a' as char
    }

    public String 指定されたstringのsrcをrepで置換する(String string, String src, String rep){
        return string.tr(src,rep)
    }

}
