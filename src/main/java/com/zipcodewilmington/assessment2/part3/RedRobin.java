package com.zipcodewilmington.assessment2.part3;

public class RedRobin extends Bird{
    @Override
    public void setMigrationMonth(String migrationMonth) {
        this.migrationMonth = migrationMonth;
    }

    @Override
    public String getMigrationMonth() {
        return migrationMonth;
    }

    public String migrationMonth;

    @Override
    public int getSpeed() {
        return 10;
    }

    @Override
    public String color() {
        return "red";
    }
}
