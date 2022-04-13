package UserPk;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class DataRes extends Message {
  public static final Long DEFAULT_PK_ID;
  
  public static final Long DEFAULT_USER_PK_ID;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long pk_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long user_pk_id;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-607137500, "Ltbclient/UserPk/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-607137500, "Ltbclient/UserPk/DataRes;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_PK_ID = long_;
    DEFAULT_USER_PK_ID = long_;
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Long long_1 = paramBuilder.pk_id;
      if (long_1 == null) {
        this.pk_id = DEFAULT_PK_ID;
      } else {
        this.pk_id = long_1;
      } 
      long_ = paramBuilder.user_pk_id;
      if (long_ == null) {
        this.user_pk_id = DEFAULT_USER_PK_ID;
      } else {
        this.user_pk_id = long_;
      } 
    } else {
      this.pk_id = ((Builder)long_).pk_id;
      this.user_pk_id = ((Builder)long_).user_pk_id;
    } 
  }
}
