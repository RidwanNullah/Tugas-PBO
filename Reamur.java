package tugas5;

import pbo.KonversiSuhu;

public class Reamur {
    public double toFahrenheit(){ return (KonversiSuhu.suhuAwal * 2.25 + 32);
    }
    double toKelvin(){
        return (KonversiSuhu.suhuAwal/0.8 + 327.15);
    }
    double toCelcius(){
        return (KonversiSuhu.suhuAwal / 0.8);
    }
}