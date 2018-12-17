import java.io.UnsupportedEncodingException;

public class CheckEncoding {
    public static void main(String[] args) {
        String word = "Encoding 문제인지? 그것이 알고 싶다....";
        try {
            //기본으로 UTF-8로 저장한것으로 각 encoding별 byte배열로 변환하여, String을 생성해내고, 이를 출력
            System.out.println("utf-8 -> utf-8        : " + new String(word.getBytes("utf-8"), "utf-8"));
            System.out.println("utf-8 -> euc-kr        : " + new String(word.getBytes("utf-8"), "euc-kr"));
            System.out.println("utf-8 -> ksc5601       : " + new String(word.getBytes("utf-8"), "ksc5601"));
            System.out.println("utf-8 -> x-windows-949 : " + new String(word.getBytes("utf-8"), "x-windows-949"));
            System.out.println("utf-8 -> iso-8859-1    : " + new String(word.getBytes("utf-8"), "iso-8859-1"));
            System.out.println("iso-8859-1 -> euc-kr        : " + new String(word.getBytes("iso-8859-1"), "euc-kr"));
            System.out.println("iso-8859-1 -> ksc5601       : " + new String(word.getBytes("iso-8859-1"), "ksc5601"));
            System.out.println("iso-8859-1 -> x-windows-949 : " + new String(word.getBytes("iso-8859-1"), "x-windows-949"));
            System.out.println("iso-8859-1 -> utf-8         : " + new String(word.getBytes("iso-8859-1"), "utf-8"));
            System.out.println("euc-kr -> utf-8         : " + new String(word.getBytes("euc-kr"), "utf-8"));
            System.out.println("euc-kr -> ksc5601       : " + new String(word.getBytes("euc-kr"), "ksc5601"));
            System.out.println("euc-kr -> x-windows-949 : " + new String(word.getBytes("euc-kr"), "x-windows-949"));
            System.out.println("euc-kr -> iso-8859-1    : " + new String(word.getBytes("euc-kr"), "iso-8859-1"));
            System.out.println("ksc5601 -> euc-kr        : " + new String(word.getBytes("ksc5601"), "euc-kr"));
            System.out.println("ksc5601 -> utf-8         : " + new String(word.getBytes("ksc5601"), "utf-8"));
            System.out.println("ksc5601 -> x-windows-949 : " + new String(word.getBytes("ksc5601"), "x-windows-949"));
            System.out.println("ksc5601 -> iso-8859-1    : " + new String(word.getBytes("ksc5601"), "iso-8859-1"));
            System.out.println("x-windows-949 -> euc-kr     : " + new String(word.getBytes("x-windows-949"), "euc-kr"));
            System.out.println("x-windows-949 -> utf-8      : " + new String(word.getBytes("x-windows-949"), "utf-8"));
            System.out.println("x-windows-949 -> ksc5601    : " + new String(word.getBytes("x-windows-949"), "ksc5601"));
            System.out.println("x-windows-949 -> iso-8859-1 : " + new String(word.getBytes("x-windows-949"), "iso-8859-1"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }
}