package FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TabSkin extends Message {
  public static final String DEFAULT_ICON = "";
  
  public static final String DEFAULT_ICON_NIGHT = "";
  
  public static final Integer DEFAULT_TAB_ID = Integer.valueOf(0);
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String icon;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String icon_night;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer tab_id;
  
  public TabSkin(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.tab_id;
      if (integer == null) {
        this.tab_id = DEFAULT_TAB_ID;
      } else {
        this.tab_id = integer;
      } 
      String str1 = paramBuilder.icon;
      if (str1 == null) {
        this.icon = "";
      } else {
        this.icon = str1;
      } 
      str = paramBuilder.icon_night;
      if (str == null) {
        this.icon_night = "";
      } else {
        this.icon_night = str;
      } 
    } else {
      this.tab_id = ((Builder)str).tab_id;
      this.icon = ((Builder)str).icon;
      this.icon_night = ((Builder)str).icon_night;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(349626988, "Ltbclient/FrsPage/TabSkin;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(349626988, "Ltbclient/FrsPage/TabSkin;");
          return;
        } 
      } 
    } 
  }
}
