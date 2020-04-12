package com.mohan.javasample.serializable;

import java.io.*;

/**
 * Created by s726337 on 04/08/2017.
 */
public class SerializableExample  {

    public static void main(String[] args){

        FileOutputStream fileToWrite = null;
        ObjectOutputStream writeObject = null;

        try{
            String fileLocation="C:\\MohanKumar\\addressfile.txt";
            fileToWrite = new FileOutputStream(fileLocation);
            writeObject = new ObjectOutputStream(fileToWrite);

            Address address = new Address();
            address.setBuildingNo("B275");
            address.setCity("Chennai");
            address.setCountry("India");
            address.setMobileNumber(01234567);
            address.setStreetName("AshokNagar");

            writeObject.writeObject(address);

        }catch(FileNotFoundException e){
            e.getMessage();
        }catch (IOException e){
            e.getMessage();
        }finally {

            if (writeObject != null) {
                try {
                    writeObject.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileToWrite != null) {
                try {
                    fileToWrite.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}


class Address implements Serializable{

    private String buildingNo;
    private String streetName;
    private String city;
    private transient String country;
    private transient long mobileNumber;

    public String getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(String buildingNo) {
        this.buildingNo = buildingNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}