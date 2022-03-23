package com.lpc.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author 濃霧-遠方
 * @date 2021/11/23
 */
public class Config {

    private static final String propertiesUrl = "F:\\workspace\\IDEA_wordspace\\system\\client\\config.properties";
    private static boolean ifRememberPass;

    private static String userName;
    private static String pass;
    private static Properties properties;

    static{
        try {
            properties = new Properties();
            properties.load(new FileInputStream(propertiesUrl));
            Config.ifRememberPass = Boolean.parseBoolean(properties.getProperty("IF_REMEMBER_PASS"));
            if (ifRememberPass){
                userName = properties.getProperty("USER_NAME");
                pass = properties.getProperty("PASS");
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static boolean getIfRememberPass(){
        return ifRememberPass;
    }

    public static void setIfRememberPass(boolean ifRememberPass){
        Config.ifRememberPass = ifRememberPass;
        properties.setProperty("IF_REMEMBER_PASS",ifRememberPass+"");
        saveToFile();
    }

    public static void  setUserNameAndPass(String userName,String pass){
        Config.userName = userName;
        Config.pass = pass;
        properties.setProperty("USER_NAME",userName);
        properties.setProperty("PASS",pass);
        saveToFile();
    }

    public static String[] getUserNameAndPass(){
        return new String[]{userName, pass};
    }

    public static void saveToFile() {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(propertiesUrl);
            properties.store(fileOutputStream,"保存到文件");
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("保存到文件失败！");
        }
    }
}
