package Hottopic;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Hottopic.PkView;

public final class PkModule extends Message {
  public static final String DEFAULT_MODULE_NAME = "";
  
  public static final Long DEFAULT_PK_ID;
  
  public static final Integer DEFAULT_PK_TYPE;
  
  public static final String DEFAULT_QUES_DESC = "";
  
  public static final Long DEFAULT_USER_PK_ID;
  
  public static final Integer DEFAULT_USER_PK_INDEX;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String module_name;
  
  @ProtoField(tag = 3)
  public final PkView pk_1;
  
  @ProtoField(tag = 4)
  public final PkView pk_2;
  
  @ProtoField(tag = 5)
  public final PkView pk_3;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT64)
  public final Long pk_id;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer pk_type;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String ques_desc;
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT64)
  public final Long user_pk_id;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer user_pk_index;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1189122479, "Ltbclient/Hottopic/PkModule;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1189122479, "Ltbclient/Hottopic/PkModule;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_PK_TYPE = integer;
    DEFAULT_USER_PK_INDEX = integer;
    Long long_ = Long.valueOf(0L);
    DEFAULT_PK_ID = long_;
    DEFAULT_USER_PK_ID = long_;
  }
  
  public PkModule(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      String str = paramBuilder.module_name;
      if (str == null) {
        this.module_name = "";
      } else {
        this.module_name = str;
      } 
      str = paramBuilder.ques_desc;
      if (str == null) {
        this.ques_desc = "";
      } else {
        this.ques_desc = str;
      } 
      this.pk_1 = paramBuilder.pk_1;
      this.pk_2 = paramBuilder.pk_2;
      this.pk_3 = paramBuilder.pk_3;
      Integer integer = paramBuilder.pk_type;
      if (integer == null) {
        this.pk_type = DEFAULT_PK_TYPE;
      } else {
        this.pk_type = integer;
      } 
      integer = paramBuilder.user_pk_index;
      if (integer == null) {
        this.user_pk_index = DEFAULT_USER_PK_INDEX;
      } else {
        this.user_pk_index = integer;
      } 
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
      this.module_name = ((Builder)long_).module_name;
      this.ques_desc = ((Builder)long_).ques_desc;
      this.pk_1 = ((Builder)long_).pk_1;
      this.pk_2 = ((Builder)long_).pk_2;
      this.pk_3 = ((Builder)long_).pk_3;
      this.pk_type = ((Builder)long_).pk_type;
      this.user_pk_index = ((Builder)long_).user_pk_index;
      this.pk_id = ((Builder)long_).pk_id;
      this.user_pk_id = ((Builder)long_).user_pk_id;
    } 
  }
}
