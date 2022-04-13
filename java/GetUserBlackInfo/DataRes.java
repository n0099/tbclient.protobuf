package GetUserBlackInfo;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.PermissionList;

public final class DataRes extends Message {
  public static final Integer DEFAULT_IS_BLACK_WHITE = Integer.valueOf(0);
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer is_black_white;
  
  @ProtoField(tag = 2)
  public final PermissionList perm_list;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      Integer integer = paramBuilder.is_black_white;
      if (integer == null) {
        this.is_black_white = DEFAULT_IS_BLACK_WHITE;
      } else {
        this.is_black_white = integer;
      } 
      this.perm_list = paramBuilder.perm_list;
    } else {
      this.is_black_white = paramBuilder.is_black_white;
      this.perm_list = paramBuilder.perm_list;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-837011074, "Ltbclient/GetUserBlackInfo/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-837011074, "Ltbclient/GetUserBlackInfo/DataRes;");
          return;
        } 
      } 
    } 
  }
}
