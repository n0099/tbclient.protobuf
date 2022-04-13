package UserMuteQuery;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Page;
import tbclient.UserMuteQuery.MuteUser;

public final class DataRes extends Message {
  public static final List<MuteUser> DEFAULT_MUTE_USER = Collections.emptyList();
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<MuteUser> mute_user;
  
  @ProtoField(tag = 2)
  public final Page page;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      List list = paramBuilder.mute_user;
      if (list == null) {
        this.mute_user = DEFAULT_MUTE_USER;
      } else {
        this.mute_user = Message.immutableCopyOf(list);
      } 
      this.page = paramBuilder.page;
    } else {
      this.mute_user = Message.immutableCopyOf(paramBuilder.mute_user);
      this.page = paramBuilder.page;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1984790266, "Ltbclient/UserMuteQuery/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1984790266, "Ltbclient/UserMuteQuery/DataRes;");
          return;
        } 
      } 
    } 
  }
}
