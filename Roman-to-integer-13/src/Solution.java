import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> mapa = new HashMap<>();
        mapa.put('I', 1);
        mapa.put('V', 5);
        mapa.put('X', 10);
        mapa.put('L', 50);
        mapa.put('C', 100);
        mapa.put('D', 500);
        mapa.put('M', 1000);

        int respuesta = 0;
        for (int i = 0; i < s.length(); i++) {
            if(i < s.length() - 1 && (mapa.get(s.charAt(i)) < mapa.get(s.charAt(i+1)))){
                respuesta -= mapa.get(s.charAt(i));
            }else {
                respuesta += mapa.get(s.charAt(i));
            }
        }
        return respuesta;
    }
}
