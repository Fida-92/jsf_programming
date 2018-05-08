/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myfirma.jsf;


public class UrlData {
   private String url;
   
   public UrlData(String url) {
      this.url = url;
   }
   
   public String getUrl() {
      return url;
   }

   public void setUrl(String url) {
      this.url = url;
   }
   
   @Override
   public String toString() {
      return url;
   }
}