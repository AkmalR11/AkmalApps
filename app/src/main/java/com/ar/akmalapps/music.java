package com.ar.akmalapps;
/* Tanggal Pengerjaan   : 08-06-2023
    NIM                 : 10119230
    Nama                : Akmal Rizqulloh
    Kelas               : IF6
*/
public class music {
    private String judulMusic;
    private String namaArtis;
    private int albumCover;

    public music(){

    }

    public music(String judulMusic, String namaArtis, int albumCover) {
        this.judulMusic = judulMusic;
        this.namaArtis = namaArtis;
        this.albumCover = albumCover;
    }

    public String getJudulMusic() {
        return judulMusic;
    }

    public void setJudulMusic(String judulMusic) {
        this.judulMusic = judulMusic;
    }

    public String getNamaArtis() {
        return namaArtis;
    }

    public void setNamaArtis(String namaArtis) {
        this.namaArtis = namaArtis;
    }

    public int getAlbumCover() {
        return albumCover;
    }

    public void setAlbumCover(int albumCover) {
        this.albumCover = albumCover;
    }
}
