package UrlParser;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class DataRes extends Message {
  public static final String DEFAULT_DESCRIPTION = "";
  
  public static final String DEFAULT_IMAGE = "";
  
  public static final Integer DEFAULT_IS_RECOGNIZE;
  
  public static final String DEFAULT_LINK_FROM = "";
  
  public static final String DEFAULT_PRICE_TXT = "";
  
  public static final Integer DEFAULT_STATUS;
  
  public static final String DEFAULT_TITLE = "";
  
  public static final Integer DEFAULT_URL_TYPE;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String description;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String image;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer is_recognize;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String link_from;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String price_txt;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer status;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer url_type;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(438144880, "Ltbclient/UrlParser/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(438144880, "Ltbclient/UrlParser/DataRes;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_URL_TYPE = integer;
    DEFAULT_STATUS = integer;
    DEFAULT_IS_RECOGNIZE = integer;
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.url_type;
      if (integer2 == null) {
        this.url_type = DEFAULT_URL_TYPE;
      } else {
        this.url_type = integer2;
      } 
      integer2 = paramBuilder.status;
      if (integer2 == null) {
        this.status = DEFAULT_STATUS;
      } else {
        this.status = integer2;
      } 
      String str1 = paramBuilder.image;
      if (str1 == null) {
        this.image = "";
      } else {
        this.image = str1;
      } 
      str1 = paramBuilder.link_from;
      if (str1 == null) {
        this.link_from = "";
      } else {
        this.link_from = str1;
      } 
      str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      str1 = paramBuilder.price_txt;
      if (str1 == null) {
        this.price_txt = "";
      } else {
        this.price_txt = str1;
      } 
      Integer integer1 = paramBuilder.is_recognize;
      if (integer1 == null) {
        this.is_recognize = DEFAULT_IS_RECOGNIZE;
      } else {
        this.is_recognize = integer1;
      } 
      str = paramBuilder.description;
      if (str == null) {
        this.description = "";
      } else {
        this.description = str;
      } 
    } else {
      this.url_type = ((Builder)str).url_type;
      this.status = ((Builder)str).status;
      this.image = ((Builder)str).image;
      this.link_from = ((Builder)str).link_from;
      this.title = ((Builder)str).title;
      this.price_txt = ((Builder)str).price_txt;
      this.is_recognize = ((Builder)str).is_recognize;
      this.description = ((Builder)str).description;
    } 
  }
}
