package Personalized;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Resource extends Message {
  public static final String DEFAULT_ICON_TEXT = "";
  
  public static final Long DEFAULT_POSITION;
  
  public static final Long DEFAULT_RES_ID;
  
  public static final String DEFAULT_RES_IMAGE = "";
  
  public static final String DEFAULT_RES_LINK = "";
  
  public static final String DEFAULT_RES_TITLE = "";
  
  public static final String DEFAULT_USER_IMAGE = "";
  
  public static final String DEFAULT_USER_LINK = "";
  
  public static final String DEFAULT_USER_NAME = "";
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String icon_text;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT64)
  public final Long position;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long res_id;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String res_image;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String res_link;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String res_title;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String user_image;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String user_link;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String user_name;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1041439816, "Ltbclient/Personalized/Resource;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1041439816, "Ltbclient/Personalized/Resource;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_RES_ID = long_;
    DEFAULT_POSITION = long_;
  }
  
  public Resource(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.res_id;
      if (long_2 == null) {
        this.res_id = DEFAULT_RES_ID;
      } else {
        this.res_id = long_2;
      } 
      String str1 = paramBuilder.user_name;
      if (str1 == null) {
        this.user_name = "";
      } else {
        this.user_name = str1;
      } 
      str1 = paramBuilder.user_image;
      if (str1 == null) {
        this.user_image = "";
      } else {
        this.user_image = str1;
      } 
      str1 = paramBuilder.user_link;
      if (str1 == null) {
        this.user_link = "";
      } else {
        this.user_link = str1;
      } 
      str1 = paramBuilder.res_title;
      if (str1 == null) {
        this.res_title = "";
      } else {
        this.res_title = str1;
      } 
      str1 = paramBuilder.res_image;
      if (str1 == null) {
        this.res_image = "";
      } else {
        this.res_image = str1;
      } 
      str1 = paramBuilder.res_link;
      if (str1 == null) {
        this.res_link = "";
      } else {
        this.res_link = str1;
      } 
      Long long_1 = paramBuilder.position;
      if (long_1 == null) {
        this.position = DEFAULT_POSITION;
      } else {
        this.position = long_1;
      } 
      str = paramBuilder.icon_text;
      if (str == null) {
        this.icon_text = "";
      } else {
        this.icon_text = str;
      } 
    } else {
      this.res_id = ((Builder)str).res_id;
      this.user_name = ((Builder)str).user_name;
      this.user_image = ((Builder)str).user_image;
      this.user_link = ((Builder)str).user_link;
      this.res_title = ((Builder)str).res_title;
      this.res_image = ((Builder)str).res_image;
      this.res_link = ((Builder)str).res_link;
      this.position = ((Builder)str).position;
      this.icon_text = ((Builder)str).icon_text;
    } 
  }
}
