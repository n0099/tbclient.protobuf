package FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Badges extends Message {
  public static final Integer DEFAULT_BADGE_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_BADGE_URL = "";
  
  public static final String DEFAULT_WEBVIEW = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer badge_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String badge_url;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String webview;
  
  public Badges(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.badge_id;
      if (integer == null) {
        this.badge_id = DEFAULT_BADGE_ID;
      } else {
        this.badge_id = integer;
      } 
      String str1 = paramBuilder.badge_url;
      if (str1 == null) {
        this.badge_url = "";
      } else {
        this.badge_url = str1;
      } 
      str = paramBuilder.webview;
      if (str == null) {
        this.webview = "";
      } else {
        this.webview = str;
      } 
    } else {
      this.badge_id = ((Builder)str).badge_id;
      this.badge_url = ((Builder)str).badge_url;
      this.webview = ((Builder)str).webview;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(110139912, "Ltbclient/FrsPage/Badges;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(110139912, "Ltbclient/FrsPage/Badges;");
          return;
        } 
      } 
    } 
  }
}
