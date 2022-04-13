package AddTaskScores;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Integer DEFAULT_TASK_ID;
  
  public static final Long DEFAULT_USER_ID = Long.valueOf(0L);
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer task_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long user_id;
  
  static {
    DEFAULT_TASK_ID = Integer.valueOf(0);
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Long long_ = paramBuilder.user_id;
      if (long_ == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_;
      } 
      integer = paramBuilder.task_id;
      if (integer == null) {
        this.task_id = DEFAULT_TASK_ID;
      } else {
        this.task_id = integer;
      } 
    } else {
      this.common = ((Builder)integer).common;
      this.user_id = ((Builder)integer).user_id;
      this.task_id = ((Builder)integer).task_id;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(352622393, "Ltbclient/AddTaskScores/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(352622393, "Ltbclient/AddTaskScores/DataReq;");
          return;
        } 
      } 
    } 
  }
}
