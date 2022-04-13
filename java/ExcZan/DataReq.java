package ExcZan;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Integer DEFAULT_ACTION;
  
  public static final Long DEFAULT_EXCID;
  
  public static final Long DEFAULT_POST_ID;
  
  public static final Long DEFAULT_THREAD_ID;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer action;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long excid;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT64)
  public final Long post_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT64)
  public final Long thread_id;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-775110347, "Ltbclient/ExcZan/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-775110347, "Ltbclient/ExcZan/DataReq;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_EXCID = long_;
    DEFAULT_THREAD_ID = long_;
    DEFAULT_POST_ID = long_;
    DEFAULT_ACTION = Integer.valueOf(0);
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Long long_ = paramBuilder.excid;
      if (long_ == null) {
        this.excid = DEFAULT_EXCID;
      } else {
        this.excid = long_;
      } 
      long_ = paramBuilder.thread_id;
      if (long_ == null) {
        this.thread_id = DEFAULT_THREAD_ID;
      } else {
        this.thread_id = long_;
      } 
      long_ = paramBuilder.post_id;
      if (long_ == null) {
        this.post_id = DEFAULT_POST_ID;
      } else {
        this.post_id = long_;
      } 
      integer = paramBuilder.action;
      if (integer == null) {
        this.action = DEFAULT_ACTION;
      } else {
        this.action = integer;
      } 
    } else {
      this.common = ((Builder)integer).common;
      this.excid = ((Builder)integer).excid;
      this.thread_id = ((Builder)integer).thread_id;
      this.post_id = ((Builder)integer).post_id;
      this.action = ((Builder)integer).action;
    } 
  }
}
