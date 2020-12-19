package tugas5;

import pbo.KonversiSuhu;

public class Celcius {
    double toFahrenheit(){
        return (KonversiSuhu.suhuAwal *1.8+32); }
    double toReamur(){return (KonversiSuhu.suhuAwal*0.8); }
    double toKelvin(){
        return (KonversiSuhu.suhuAwal*273.15);
    }
}