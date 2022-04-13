package ZoneRight;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Long DEFAULT_FORUM_ID;
  
  public static final Integer DEFAULT_REQ_TYPE;
  
  public static final Long DEFAULT_THREAD_ID;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT64)
  public final Long forum_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer req_type;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long thread_id;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-848297456, "Ltbclient/ZoneRight/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-848297456, "Ltbclient/ZoneRight/DataReq;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_THREAD_ID = long_;
    DEFAULT_FORUM_ID = long_;
    DEFAULT_REQ_TYPE = Integer.valueOf(0);
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Long long_ = paramBuilder.thread_id;
      if (long_ == null) {
        this.thread_id = DEFAULT_THREAD_ID;
      } else {
        this.thread_id = long_;
      } 
      long_ = paramBuilder.forum_id;
      if (long_ == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_;
      } 
      integer = paramBuilder.req_type;
      if (integer == null) {
        this.req_type = DEFAULT_REQ_TYPE;
      } else {
        this.req_type = integer;
      } 
    } else {
      this.common = ((Builder)integer).common;
      this.thread_id = ((Builder)integer).thread_id;
      this.forum_id = ((Builder)integer).forum_id;
      this.req_type = ((Builder)integer).req_type;
    } 
  }
}
