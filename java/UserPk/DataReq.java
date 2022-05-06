package UserPk;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class DataReq extends Message {
  public static final Integer DEFAULT_CLICK_TYPE;
  
  public static final Long DEFAULT_PK_ID;
  
  public static final Integer DEFAULT_PK_INDEX;
  
  public static final Integer DEFAULT_PK_TYPE;
  
  public static final Long DEFAULT_TOPIC_ID;
  
  public static final Long DEFAULT_USER_PK_ID;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer click_type;
  
  @ProtoField(tag = 1)
  public final CommonReq common;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long pk_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer pk_index;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer pk_type;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT64)
  public final Long topic_id;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT64)
  public final Long user_pk_id;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-607137562, "Ltbclient/UserPk/DataReq;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-607137562, "Ltbclient/UserPk/DataReq;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_PK_ID = long_;
    DEFAULT_TOPIC_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_PK_INDEX = integer;
    DEFAULT_CLICK_TYPE = integer;
    DEFAULT_PK_TYPE = integer;
    DEFAULT_USER_PK_ID = long_;
  }
  
  public DataReq(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      this.common = paramBuilder.common;
      Long long_1 = paramBuilder.pk_id;
      if (long_1 == null) {
        this.pk_id = DEFAULT_PK_ID;
      } else {
        this.pk_id = long_1;
      } 
      long_1 = paramBuilder.topic_id;
      if (long_1 == null) {
        this.topic_id = DEFAULT_TOPIC_ID;
      } else {
        this.topic_id = long_1;
      } 
      Integer integer = paramBuilder.pk_index;
      if (integer == null) {
        this.pk_index = DEFAULT_PK_INDEX;
      } else {
        this.pk_index = integer;
      } 
      integer = paramBuilder.click_type;
      if (integer == null) {
        this.click_type = DEFAULT_CLICK_TYPE;
      } else {
        this.click_type = integer;
      } 
      integer = paramBuilder.pk_type;
      if (integer == null) {
        this.pk_type = DEFAULT_PK_TYPE;
      } else {
        this.pk_type = integer;
      } 
      long_ = paramBuilder.user_pk_id;
      if (long_ == null) {
        this.user_pk_id = DEFAULT_USER_PK_ID;
      } else {
        this.user_pk_id = long_;
      } 
    } else {
      this.common = ((Builder)long_).common;
      this.pk_id = ((Builder)long_).pk_id;
      this.topic_id = ((Builder)long_).topic_id;
      this.pk_index = ((Builder)long_).pk_index;
      this.click_type = ((Builder)long_).click_type;
      this.pk_type = ((Builder)long_).pk_type;
      this.user_pk_id = ((Builder)long_).user_pk_id;
    } 
  }
}
