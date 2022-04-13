package FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Zhibo extends Message {
  public static final Long DEFAULT_FORUM;
  
  public static final Integer DEFAULT_HAS_LPOST;
  
  public static final Integer DEFAULT_INT1;
  
  public static final Integer DEFAULT_LPOST_TYPE;
  
  public static final Integer DEFAULT_STATUS;
  
  public static final Long DEFAULT_TID;
  
  public static final Integer DEFAULT_TYPE;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long forum;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer has_lpost;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer int1;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer lpost_type;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer status;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long tid;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer type;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1251450902, "Ltbclient/FrsPage/Zhibo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1251450902, "Ltbclient/FrsPage/Zhibo;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_FORUM = long_;
    DEFAULT_TID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_STATUS = integer;
    DEFAULT_TYPE = integer;
    DEFAULT_INT1 = integer;
    DEFAULT_HAS_LPOST = integer;
    DEFAULT_LPOST_TYPE = integer;
  }
  
  public Zhibo(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.forum;
      if (long_ == null) {
        this.forum = DEFAULT_FORUM;
      } else {
        this.forum = long_;
      } 
      long_ = paramBuilder.tid;
      if (long_ == null) {
        this.tid = DEFAULT_TID;
      } else {
        this.tid = long_;
      } 
      Integer integer1 = paramBuilder.status;
      if (integer1 == null) {
        this.status = DEFAULT_STATUS;
      } else {
        this.status = integer1;
      } 
      integer1 = paramBuilder.type;
      if (integer1 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer1;
      } 
      integer1 = paramBuilder.int1;
      if (integer1 == null) {
        this.int1 = DEFAULT_INT1;
      } else {
        this.int1 = integer1;
      } 
      integer1 = paramBuilder.has_lpost;
      if (integer1 == null) {
        this.has_lpost = DEFAULT_HAS_LPOST;
      } else {
        this.has_lpost = integer1;
      } 
      integer = paramBuilder.lpost_type;
      if (integer == null) {
        this.lpost_type = DEFAULT_LPOST_TYPE;
      } else {
        this.lpost_type = integer;
      } 
    } else {
      this.forum = ((Builder)integer).forum;
      this.tid = ((Builder)integer).tid;
      this.status = ((Builder)integer).status;
      this.type = ((Builder)integer).type;
      this.int1 = ((Builder)integer).int1;
      this.has_lpost = ((Builder)integer).has_lpost;
      this.lpost_type = ((Builder)integer).lpost_type;
    } 
  }
}
