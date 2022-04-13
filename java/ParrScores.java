import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ParrScores;

public final class ParrScores extends Message {
  public static final Long DEFAULT_I_MONEY;
  
  public static final Long DEFAULT_I_OTHER;
  
  public static final Long DEFAULT_I_TOTAL;
  
  public static final Integer DEFAULT_LEVEL;
  
  public static final Integer DEFAULT_LIMIT;
  
  public static final Integer DEFAULT_SCORES_FETCH;
  
  public static final Integer DEFAULT_SCORES_MONEY;
  
  public static final Integer DEFAULT_SCORES_OTHER;
  
  public static final Integer DEFAULT_SCORES_TOTAL;
  
  public static final Integer DEFAULT_UPDATE_TIME;
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT64)
  public final Long i_money;
  
  @ProtoField(tag = 10, type = Message.Datatype.UINT64)
  public final Long i_other;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT64)
  public final Long i_total;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer level;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer limit;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer scores_fetch;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer scores_money;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer scores_other;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer scores_total;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer update_time;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(850072543, "Ltbclient/ParrScores;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(850072543, "Ltbclient/ParrScores;");
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
    DEFAULT_LEVEL = integer;
    DEFAULT_LIMIT = integer;
    Long long_ = Long.valueOf(0L);
    DEFAULT_I_TOTAL = long_;
    DEFAULT_I_MONEY = long_;
    DEFAULT_I_OTHER = long_;
  }
  
  public ParrScores(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.scores_total;
      if (integer == null) {
        this.scores_total = DEFAULT_SCORES_TOTAL;
      } else {
        this.scores_total = integer;
      } 
      integer = paramBuilder.scores_fetch;
      if (integer == null) {
        this.scores_fetch = DEFAULT_SCORES_FETCH;
      } else {
        this.scores_fetch = integer;
      } 
      integer = paramBuilder.scores_money;
      if (integer == null) {
        this.scores_money = DEFAULT_SCORES_MONEY;
      } else {
        this.scores_money = integer;
      } 
      integer = paramBuilder.scores_other;
      if (integer == null) {
        this.scores_other = DEFAULT_SCORES_OTHER;
      } else {
        this.scores_other = integer;
      } 
      integer = paramBuilder.update_time;
      if (integer == null) {
        this.update_time = DEFAULT_UPDATE_TIME;
      } else {
        this.update_time = integer;
      } 
      integer = paramBuilder.level;
      if (integer == null) {
        this.level = DEFAULT_LEVEL;
      } else {
        this.level = integer;
      } 
      integer = paramBuilder.limit;
      if (integer == null) {
        this.limit = DEFAULT_LIMIT;
      } else {
        this.limit = integer;
      } 
      Long long_1 = paramBuilder.i_total;
      if (long_1 == null) {
        this.i_total = DEFAULT_I_TOTAL;
      } else {
        this.i_total = long_1;
      } 
      long_1 = paramBuilder.i_money;
      if (long_1 == null) {
        this.i_money = DEFAULT_I_MONEY;
      } else {
        this.i_money = long_1;
      } 
      long_ = paramBuilder.i_other;
      if (long_ == null) {
        this.i_other = DEFAULT_I_OTHER;
      } else {
        this.i_other = long_;
      } 
    } else {
      this.scores_total = ((Builder)long_).scores_total;
      this.scores_fetch = ((Builder)long_).scores_fetch;
      this.scores_money = ((Builder)long_).scores_money;
      this.scores_other = ((Builder)long_).scores_other;
      this.update_time = ((Builder)long_).update_time;
      this.level = ((Builder)long_).level;
      this.limit = ((Builder)long_).limit;
      this.i_total = ((Builder)long_).i_total;
      this.i_money = ((Builder)long_).i_money;
      this.i_other = ((Builder)long_).i_other;
    } 
  }
}
