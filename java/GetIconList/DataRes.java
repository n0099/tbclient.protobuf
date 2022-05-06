package GetIconList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GetIconList.Custom;
import tbclient.GetIconList.IconInfo;
import tbclient.GetIconList.Setting;
import tbclient.GetIconList.UserInfo;

public final class DataRes extends Message {
  public static final List<Custom> DEFAULT_CUSTOM;
  
  public static final List<IconInfo> DEFAULT_ICON_INFO = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4)
  public final List<Custom> custom;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<IconInfo> icon_info;
  
  @ProtoField(tag = 3)
  public final Setting setting;
  
  @ProtoField(tag = 1)
  public final UserInfo user_info;
  
  static {
    DEFAULT_CUSTOM = Collections.emptyList();
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    List list;
    if (paramBoolean == true) {
      this.user_info = paramBuilder.user_info;
      List list1 = paramBuilder.icon_info;
      if (list1 == null) {
        this.icon_info = DEFAULT_ICON_INFO;
      } else {
        this.icon_info = Message.immutableCopyOf(list1);
      } 
      this.setting = paramBuilder.setting;
      list = paramBuilder.custom;
      if (list == null) {
        this.custom = DEFAULT_CUSTOM;
      } else {
        this.custom = Message.immutableCopyOf(list);
      } 
    } else {
      this.user_info = ((Builder)list).user_info;
      this.icon_info = Message.immutableCopyOf(((Builder)list).icon_info);
      this.setting = ((Builder)list).setting;
      this.custom = Message.immutableCopyOf(((Builder)list).custom);
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1119909871, "Ltbclient/GetIconList/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1119909871, "Ltbclient/GetIconList/DataRes;");
          return;
        } 
      } 
    } 
  }
}
