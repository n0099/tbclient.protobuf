package GetClientConfig;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class CLocalDialog extends Message {
  public static final String DEFAULT_NAME = "";
  
  public static final String DEFAULT_PICTURE = "";
  
  public static final Integer DEFAULT_SHOW = Integer.valueOf(0);
  
  public static final String DEFAULT_TIME = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_URL = "";
  
  public static final String DEFAULT_URL_IOS = "";
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String picture;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer show;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String time;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String url;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String url_ios;
  
  public CLocalDialog(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str2 = paramBuilder.picture;
      if (str2 == null) {
        this.picture = "";
      } else {
        this.picture = str2;
      } 
      Integer integer = paramBuilder.show;
      if (integer == null) {
        this.show = DEFAULT_SHOW;
      } else {
        this.show = integer;
      } 
      String str1 = paramBuilder.time;
      if (str1 == null) {
        this.time = "";
      } else {
        this.time = str1;
      } 
      str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      str1 = paramBuilder.url;
      if (str1 == null) {
        this.url = "";
      } else {
        this.url = str1;
      } 
      str1 = paramBuilder.name;
      if (str1 == null) {
        this.name = "";
      } else {
        this.name = str1;
      } 
      str = paramBuilder.url_ios;
      if (str == null) {
        this.url_ios = "";
      } else {
        this.url_ios = str;
      } 
    } else {
      this.picture = ((Builder)str).picture;
      this.show = ((Builder)str).show;
      this.time = ((Builder)str).time;
      this.title = ((Builder)str).title;
      this.url = ((Builder)str).url;
      this.name = ((Builder)str).name;
      this.url_ios = ((Builder)str).url_ios;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1565598101, "Ltbclient/GetClientConfig/CLocalDialog;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1565598101, "Ltbclient/GetClientConfig/CLocalDialog;");
          return;
        } 
      } 
    } 
  }
}
