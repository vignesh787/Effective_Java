package com.part13;

public class PhoneNumber implements Cloneable{

    @Override
    public PhoneNumber clone(){
        try {
            return (PhoneNumber) super.clone();
        }catch(Exception e){
            throw new AssertionError();
        }
    }
}
