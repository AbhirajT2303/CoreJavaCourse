package com.Singleton.design.lazy;

public class LazyIn {
        private static LazyIn instance;
        private LazyIn(){}
        public static LazyIn getInstance(){
            if(instance == null){
                instance = new LazyIn();
            }
            return instance;
        }


}
