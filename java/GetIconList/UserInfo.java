package GetIconList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class UserInfo extends Message {
  public static final Integer DEFAULT_IS_MEM;
  
  public static final Integer DEFAULT_SCORES_TOTAL;
  
  public static final Long DEFAULT_USER_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_USER_NAME = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer is_mem;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer scores_total;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long user_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String user_name;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_MEM = integer;
    DEFAULT_SCORES_TOTAL = integer;
  }
  
  public UserInfo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.user_id;
      if (long_ == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_;
      } 
      String str = paramBuilder.user_name;
      if (str == null) {
        this.user_name = "";
      } else {
        this.user_name = str;
      } 
      Integer integer1 = paramBuilder.is_mem;
      if (integer1 == null) {
        this.is_mem = DEFAULT_IS_MEM;
      } else {
        this.is_mem = integer1;
      } 
      integer = paramBuilder.scores_total;
      if (integer == null) {
        this.scores_total = DEFAULT_SCORES_TOTAL;
      } else {
        this.scores_total = integer;
      } 
    } else {
      this.user_id = ((Builder)integer).user_id;
      this.user_name = ((Builder)integer).user_name;
      this.is_mem = ((Builder)integer).is_mem;
      this.scores_total = ((Builder)integer).scores_total;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(337380374, "Ltbclient/GetIconList/UserInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(337380374, "Ltbclient/GetIconList/UserInfo;");
          return;
        } 
      } 
    } 
  }
}
