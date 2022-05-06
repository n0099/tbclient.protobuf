package FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SignUser extends Message {
  public static final Integer DEFAULT_CONT_SIGN_NUM;
  
  public static final Integer DEFAULT_COUT_TOTAL_SIGN_NUM;
  
  public static final Integer DEFAULT_C_SIGN_NUM;
  
  public static final Integer DEFAULT_HUN_SIGN_NUM;
  
  public static final Integer DEFAULT_IS_ORG_DISABLED;
  
  public static final Integer DEFAULT_IS_SIGN_IN;
  
  public static final Integer DEFAULT_MISS_SIGN_NUM;
  
  public static final Integer DEFAULT_SIGN_TIME;
  
  public static final Integer DEFAULT_TOTAL_RESIGN_NUM;
  
  public static final Long DEFAULT_USER_ID = Long.valueOf(0L);
  
  public static final Integer DEFAULT_USER_SIGN_RANK;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer c_sign_num;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer cont_sign_num;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer cout_total_sign_num;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer hun_sign_num;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer is_org_disabled;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer is_sign_in;
  
  @ProtoField(tag = 11, type = Message.Datatype.INT32)
  public final Integer miss_sign_num;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer sign_time;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer total_resign_num;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long user_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer user_sign_rank;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_SIGN_IN = integer;
    DEFAULT_USER_SIGN_RANK = integer;
    DEFAULT_SIGN_TIME = integer;
    DEFAULT_CONT_SIGN_NUM = integer;
    DEFAULT_COUT_TOTAL_SIGN_NUM = integer;
    DEFAULT_IS_ORG_DISABLED = integer;
    DEFAULT_C_SIGN_NUM = integer;
    DEFAULT_HUN_SIGN_NUM = integer;
    DEFAULT_TOTAL_RESIGN_NUM = integer;
    DEFAULT_MISS_SIGN_NUM = integer;
  }
  
  public SignUser(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.user_id;
      if (long_ == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_;
      } 
      Integer integer1 = paramBuilder.is_sign_in;
      if (integer1 == null) {
        this.is_sign_in = DEFAULT_IS_SIGN_IN;
      } else {
        this.is_sign_in = integer1;
      } 
      integer1 = paramBuilder.user_sign_rank;
      if (integer1 == null) {
        this.user_sign_rank = DEFAULT_USER_SIGN_RANK;
      } else {
        this.user_sign_rank = integer1;
      } 
      integer1 = paramBuilder.sign_time;
      if (integer1 == null) {
        this.sign_time = DEFAULT_SIGN_TIME;
      } else {
        this.sign_time = integer1;
      } 
      integer1 = paramBuilder.cont_sign_num;
      if (integer1 == null) {
        this.cont_sign_num = DEFAULT_CONT_SIGN_NUM;
      } else {
        this.cont_sign_num = integer1;
      } 
      integer1 = paramBuilder.cout_total_sign_num;
      if (integer1 == null) {
        this.cout_total_sign_num = DEFAULT_COUT_TOTAL_SIGN_NUM;
      } else {
        this.cout_total_sign_num = integer1;
      } 
      integer1 = paramBuilder.is_org_disabled;
      if (integer1 == null) {
        this.is_org_disabled = DEFAULT_IS_ORG_DISABLED;
      } else {
        this.is_org_disabled = integer1;
      } 
      integer1 = paramBuilder.c_sign_num;
      if (integer1 == null) {
        this.c_sign_num = DEFAULT_C_SIGN_NUM;
      } else {
        this.c_sign_num = integer1;
      } 
      integer1 = paramBuilder.hun_sign_num;
      if (integer1 == null) {
        this.hun_sign_num = DEFAULT_HUN_SIGN_NUM;
      } else {
        this.hun_sign_num = integer1;
      } 
      integer1 = paramBuilder.total_resign_num;
      if (integer1 == null) {
        this.total_resign_num = DEFAULT_TOTAL_RESIGN_NUM;
      } else {
        this.total_resign_num = integer1;
      } 
      integer = paramBuilder.miss_sign_num;
      if (integer == null) {
        this.miss_sign_num = DEFAULT_MISS_SIGN_NUM;
      } else {
        this.miss_sign_num = integer;
      } 
    } else {
      this.user_id = ((Builder)integer).user_id;
      this.is_sign_in = ((Builder)integer).is_sign_in;
      this.user_sign_rank = ((Builder)integer).user_sign_rank;
      this.sign_time = ((Builder)integer).sign_time;
      this.cont_sign_num = ((Builder)integer).cont_sign_num;
      this.cout_total_sign_num = ((Builder)integer).cout_total_sign_num;
      this.is_org_disabled = ((Builder)integer).is_org_disabled;
      this.c_sign_num = ((Builder)integer).c_sign_num;
      this.hun_sign_num = ((Builder)integer).hun_sign_num;
      this.total_resign_num = ((Builder)integer).total_resign_num;
      this.miss_sign_num = ((Builder)integer).miss_sign_num;
    } 
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1714081744, "Ltbclient/FrsPage/SignUser;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1714081744, "Ltbclient/FrsPage/SignUser;");
          return;
        } 
      } 
    } 
  }
}
