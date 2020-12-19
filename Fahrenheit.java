package tugas5;

import pbo.KonversiSuhu;

public class Fahrenheit {
    double toReamur(){ return ((KonversiSuhu.suhuAwal-32)/2.25); }
    double toKelvin(){ return ((KonversiSuhu.suhuAwal+459.67)/1.8); }
    double toCelcius(){ return ((KonversiSuhu.suhuAwal-32)/1.8); }
}