/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Operation;

import java.util.Date;

/**
 *
 * @author DIMAS MARYANTO
 */
public class DateAndTime {
    public String[] bulan = {"Januari","Februari","Maret","April","Mei"
            ,"Juni","Juli","Agustus","September",
            "Oktober","November","Desember"};


    private int jam , menit, detik , hariInt , bulanInt ,tahun;

    public String[] getBulan() {
        return bulan;
    }

    public void setBulan(String[] bulan) {
        this.bulan = bulan;
    }

    public int getJam() {
        return jam;
    }

    public void setJam() {
        Object aJam = new Date().getHours();
        this.jam = Integer.valueOf(aJam.toString());
    }

    public int getMenit() {
        return menit;
    }

    public void setMenit() {
        Object aMenit = new Date().getMinutes();
        this.menit = Integer.valueOf(aMenit.toString());
    }

    public int getDetik() {
        return detik;
    }

    public void setDetik() {
        Object aSeconds = new Date().getSeconds();
        this.detik = Integer.valueOf(aSeconds.toString());
    }

    public int getHariInt() {
        return hariInt;
    }

    public void setHariInt() {
        Object aDays = new Date().getDate();
        this.hariInt = Integer.valueOf(aDays.toString());
    }

    public int getBulanInt() {
        return bulanInt;
    }

    public void setBulanInt() {
        Object aMonth = new Date().getMonth();
        this.bulanInt = Integer.valueOf(aMonth.toString());
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun() {
        Object aYear = new Date().toString().substring(24, 28);
        this.tahun = Integer.valueOf(aYear.toString());
    }
    
}
