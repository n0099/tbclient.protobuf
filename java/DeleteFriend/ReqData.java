package DeleteFriend;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class ReqData extends Message {
  public static final Long DEFAULT_FRIEND_ID = Long.valueOf(0L);
  
  @ProtoField(tag = 2)
  public final CommonReq common;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long friend_id;
  
  public ReqData(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    if (paramBoolean == true) {
      Long long_ = paramBuilder.friend_id;
      if (long_ == null) {
        this.friend_id = DEFAULT_FRIEND_ID;
      } else {
        this.friend_id = long_;
      } 
      this.common = paramBuilder.common;
    } else {
      this.friend_id = paramBuilder.friend_id;
      this.common = paramBuilder.common;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1260134511, "Ltbclient/DeleteFriend/ReqData;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1260134511, "Ltbclient/DeleteFriend/ReqData;");
          return;
        } 
      } 
    } 
  }
}
