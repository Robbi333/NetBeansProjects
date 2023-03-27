/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author D00251715
 */
public class Linear {
  
        public static int linearContains1(int[] nums, int num){
        
            int pos = 0;
            
            for(int i = 0; i < nums.length;i++){
            
                if(nums[i]==num){
                pos = i; 
                }
            }
            return pos;
        }

        public static int linearContains2(int[] nums, int num){
        
            int pos = 0;
            
            for(int i = 0; i < nums.length;i++){
            
                if(nums[i]==num){
                pos = i;
                return pos;
                }
            }
            return -1;
        }
        
        public static int linearContains3(int[] nums, int num){
        
            int pos = 0;
            
            for(int i = 0; i < nums.length;i++){
            
                if(nums[i]==num){
                pos = i;
                return pos;
                }
                if(nums[i] > num){
                return -1;
                }
            }
            return -1;
        }
        public static int linearContains4(int[] nums, int num){
        
            int pos = 0;
            
            for(int i = nums.length-1;i >= 0; i--){
            
                if(nums[i]==num){
                pos = i;
                return pos;
                }
                if(nums[i] > num){
                return -1;
                }
            }
            return -1;
        } 
        
         public static int linearContains1Str(String[] words, String word){
        
            int pos = 0;
            
            for(int i = 0; i < words.length;i++){
            
                if(words[i].equalsIgnoreCase(word)){
                pos = i; 
                }
            }
            return pos;
        }
          public static int linearContains2Str(String[] words, String word){
        
            int pos = 0;
            
            for(int i = 0; i < words.length;i++){
            
                if(words[i].equalsIgnoreCase(word)){
                pos = i;
                return pos;
                }
            }
            return -1;
        }
           public static int linearContains3Str(String[] words, String word){
        
            int pos = 0;
            
            for(int i = 0; i < words.length;i++){
            
                if(words[i].equalsIgnoreCase(word)){
                pos = i;
                return pos;
                }
                if(words[i].compareToIgnoreCase(word) > 0){
                return -1;
                }
            }
            return -1;
        }
            public static int linearContains4Str(String[] words, String word){
        
            int pos = 0;
            
            for(int i = words.length-1;i >= 0; i--){
            
                if(words[i].equalsIgnoreCase(word)){
                pos = i;
                return pos;
                }
                if(words[i].compareToIgnoreCase(word) > 0){
                return -1;
                }
            }
            return -1;
        } 
}
