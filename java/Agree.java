import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Agree;

public final class Agree extends Message {
  public static final Long DEFAULT_AGREE_NUM;
  
  public static final Integer DEFAULT_AGREE_TYPE;
  
  public static final Long DEFAULT_DIFF_AGREE_NUM;
  
  public static final Long DEFAULT_DISAGREE_NUM;
  
  public static final Integer DEFAULT_HAS_AGREE;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long agree_num;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer agree_type;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT64)
  public final Long diff_agree_num;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT64)
  public final Long disagree_num;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer has_agree;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(109454457, "Ltbclient/Agree;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(109454457, "Ltbclient/Agree;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_AGREE_NUM = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_HAS_AGREE = integer;
    DEFAULT_AGREE_TYPE = integer;
    DEFAULT_DISAGREE_NUM = long_;
    DEFAULT_DIFF_AGREE_NUM = long_;
  }
  
  public Agree(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.agree_num;
      if (long_2 == null) {
        this.agree_num = DEFAULT_AGREE_NUM;
      } else {
        this.agree_num = long_2;
      } 
      Integer integer = paramBuilder.has_agree;
      if (integer == null) {
        this.has_agree = DEFAULT_HAS_AGREE;
      } else {
        this.has_agree = integer;
      } 
      integer = paramBuilder.agree_type;
      if (integer == null) {
        this.agree_type = DEFAULT_AGREE_TYPE;
      } else {
        this.agree_type = integer;
      } 
      Long long_1 = paramBuilder.disagree_num;
      if (long_1 == null) {
        this.disagree_num = DEFAULT_DISAGREE_NUM;
      } else {
        this.disagree_num = long_1;
      } 
      long_ = paramBuilder.diff_agree_num;
      if (long_ == null) {
        this.diff_agree_num = DEFAULT_DIFF_AGREE_NUM;
      } else {
        this.diff_agree_num = long_;
      } 
    } else {
      this.agree_num = ((Builder)long_).agree_num;
      this.has_agree = ((Builder)long_).has_agree;
      this.agree_type = ((Builder)long_).agree_type;
      this.disagree_num = ((Builder)long_).disagree_num;
      this.diff_agree_num = ((Builder)long_).diff_agree_num;
    } 
  }
}
