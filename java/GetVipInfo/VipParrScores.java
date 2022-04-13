package GetVipInfo;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class VipParrScores extends Message {
  public static final Integer DEFAULT_I_MONEY;
  
  public static final Integer DEFAULT_I_OTHER;
  
  public static final Integer DEFAULT_I_TOTAL;
  
  public static final Integer DEFAULT_LEVEL;
  
  public static final Integer DEFAULT_LIMIT;
  
  public static final Integer DEFAULT_SCORES_FETCH;
  
  public static final Integer DEFAULT_SCORES_MONEY;
  
  public static final Integer DEFAULT_SCORES_OTHER;
  
  public static final Integer DEFAULT_SCORES_TOTAL;
  
  public static final Integer DEFAULT_UPDATE_TIME;
  
  @ProtoField(tag = 7, type = Message.Datatype.UINT32)
  public final Integer i_money;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT32)
  public final Integer i_other;
  
  @ProtoField(tag = 6, type = Message.Datatype.UINT32)
  public final Integer i_total;
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT32)
  public final Integer level;
  
  @ProtoField(tag = 10, type = Message.Datatype.UINT32)
  public final Integer limit;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer scores_fetch;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer scores_money;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer scores_other;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer scores_total;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer update_time;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(2102622268, "Ltbclient/GetVipInfo/VipParrScores;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(2102622268, "Ltbclient/GetVipInfo/VipParrScores;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_SCORES_TOTAL = integer;
    DEFAULT_SCORES_FETCH = integer;
    DEFAULT_SCORES_MONEY = integer;
    DEFAULT_SCORES_OTHER = integer;
    DEFAULT_UPDATE_TIME = integer;
    DEFAULT_I_TOTAL = integer;
    DEFAULT_I_MONEY = integer;
    DEFAULT_I_OTHER = integer;
    DEFAULT_LEVEL = integer;
    DEFAULT_LIMIT = integer;
  }
  
  public VipParrScores(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.scores_total;
      if (integer1 == null) {
        this.scores_total = DEFAULT_SCORES_TOTAL;
      } else {
        this.scores_total = integer1;
      } 
      integer1 = paramBuilder.scores_fetch;
      if (integer1 == null) {
        this.scores_fetch = DEFAULT_SCORES_FETCH;
      } else {
        this.scores_fetch = integer1;
      } 
      integer1 = paramBuilder.scores_money;
      if (integer1 == null) {
        this.scores_money = DEFAULT_SCORES_MONEY;
      } else {
        this.scores_money = integer1;
      } 
      integer1 = paramBuilder.scores_other;
      if (integer1 == null) {
        this.scores_other = DEFAULT_SCORES_OTHER;
      } else {
        this.scores_other = integer1;
      } 
      integer1 = paramBuilder.update_time;
      if (integer1 == null) {
        this.update_time = DEFAULT_UPDATE_TIME;
      } else {
        this.update_time = integer1;
      } 
      integer1 = paramBuilder.i_total;
      if (integer1 == null) {
        this.i_total = DEFAULT_I_TOTAL;
      } else {
        this.i_total = integer1;
      } 
      integer1 = paramBuilder.i_money;
      if (integer1 == null) {
        this.i_money = DEFAULT_I_MONEY;
      } else {
        this.i_money = integer1;
      } 
      integer1 = paramBuilder.i_other;
      if (integer1 == null) {
        this.i_other = DEFAULT_I_OTHER;
      } else {
        this.i_other = integer1;
      } 
      integer1 = paramBuilder.level;
      if (integer1 == null) {
        this.level = DEFAULT_LEVEL;
      } else {
        this.level = integer1;
      } 
      integer = paramBuilder.limit;
      if (integer == null) {
        this.limit = DEFAULT_LIMIT;
      } else {
        this.limit = integer;
      } 
    } else {
      this.scores_total = ((Builder)integer).scores_total;
      this.scores_fetch = ((Builder)integer).scores_fetch;
      this.scores_money = ((Builder)integer).scores_money;
      this.scores_other = ((Builder)integer).scores_other;
      this.update_time = ((Builder)integer).update_time;
      this.i_total = ((Builder)integer).i_total;
      this.i_money = ((Builder)integer).i_money;
      this.i_other = ((Builder)integer).i_other;
      this.level = ((Builder)integer).level;
      this.limit = ((Builder)integer).limit;
    } 
  }
}
