package tugas5;

import pbo.KonversiSuhu;

public class Kelvin {
    double toFahrenheit(){ return ( KonversiSuhu.suhuAwal*1.8 - 459.67); }
    double toReamur(){
        return ((KonversiSuhu.suhuAwal - 273.15)*0.8);
    }
    double toCelcius(){
        return (KonversiSuhu.suhuAwal -273.15);
    }
}