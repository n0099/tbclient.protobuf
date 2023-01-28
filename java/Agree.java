package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Agree extends Message {
  public static Interceptable $ic;
  
  public static final Long DEFAULT_AGREE_NUM;
  
  public static final Integer DEFAULT_AGREE_TYPE;
  
  public static final Long DEFAULT_DIFF_AGREE_NUM;
  
  public static final Long DEFAULT_DISAGREE_NUM;
  
  public static final Integer DEFAULT_HAS_AGREE;
  
  public static final Integer DEFAULT_LZ_AGREE;
  
  public transient FieldHolder $fh;
  
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
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer lz_agree;
  
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
    DEFAULT_LZ_AGREE = integer;
  }
  
  public Agree(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.agree_num;
      if (long_2 == null) {
        this.agree_num = DEFAULT_AGREE_NUM;
      } else {
        this.agree_num = long_2;
      } 
      Integer integer1 = paramBuilder.has_agree;
      if (integer1 == null) {
        this.has_agree = DEFAULT_HAS_AGREE;
      } else {
        this.has_agree = integer1;
      } 
      integer1 = paramBuilder.agree_type;
      if (integer1 == null) {
        this.agree_type = DEFAULT_AGREE_TYPE;
      } else {
        this.agree_type = integer1;
      } 
      Long long_1 = paramBuilder.disagree_num;
      if (long_1 == null) {
        this.disagree_num = DEFAULT_DISAGREE_NUM;
      } else {
        this.disagree_num = long_1;
      } 
      long_1 = paramBuilder.diff_agree_num;
      if (long_1 == null) {
        this.diff_agree_num = DEFAULT_DIFF_AGREE_NUM;
      } else {
        this.diff_agree_num = long_1;
      } 
      integer = paramBuilder.lz_agree;
      if (integer == null) {
        this.lz_agree = DEFAULT_LZ_AGREE;
      } else {
        this.lz_agree = integer;
      } 
    } else {
      this.agree_num = ((Builder)integer).agree_num;
      this.has_agree = ((Builder)integer).has_agree;
      this.agree_type = ((Builder)integer).agree_type;
      this.disagree_num = ((Builder)integer).disagree_num;
      this.diff_agree_num = ((Builder)integer).diff_agree_num;
      this.lz_agree = ((Builder)integer).lz_agree;
    } 
  }
  
  public Agree(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Agree> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Long agree_num;
    
    public Integer agree_type;
    
    public Long diff_agree_num;
    
    public Long disagree_num;
    
    public Integer has_agree;
    
    public Integer lz_agree;
    
    public Builder() {}
    
    public Builder(Agree param1Agree) {
      super(param1Agree);
      if (param1Agree == null)
        return; 
      this.agree_num = param1Agree.agree_num;
      this.has_agree = param1Agree.has_agree;
      this.agree_type = param1Agree.agree_type;
      this.disagree_num = param1Agree.disagree_num;
      this.diff_agree_num = param1Agree.diff_agree_num;
      this.lz_agree = param1Agree.lz_agree;
    }
    
    public Agree build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (Agree)interceptResult.objValue; 
      } 
      return new Agree(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
