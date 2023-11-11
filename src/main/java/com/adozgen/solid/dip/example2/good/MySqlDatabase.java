package com.adozgen.solid.dip.example2.good;

public class MySqlDatabase implements IDatabase{
    public void connect() {
        // MySQL veritabanına bağlanır
    }

    public void disconnect() {
        // MySQL veritabanı bağlantısını keser
    }
}
