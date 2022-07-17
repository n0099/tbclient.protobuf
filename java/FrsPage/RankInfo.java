package tbclient.FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class RankInfo extends Message {
  public static Interceptable $ic;
  
  public static final Double DEFAULT_DIR_RATE;
  
  public static final Integer DEFAULT_MEMBER_COUNT;
  
  public static final Integer DEFAULT_SIGN_COUNT;
  
  public static final Integer DEFAULT_SIGN_RANK;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 4, type = Message.Datatype.DOUBLE)
  public final Double dir_rate;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer member_count;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer sign_count;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer sign_rank;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-10571202, "Ltbclient/FrsPage/RankInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-10571202, "Ltbclient/FrsPage/RankInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_SIGN_COUNT = integer;
    DEFAULT_SIGN_RANK = integer;
    DEFAULT_MEMBER_COUNT = integer;
    DEFAULT_DIR_RATE = Double.valueOf(0.0D);
  }
  
  public RankInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Double double_;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.sign_count;
      if (integer == null) {
        this.sign_count = DEFAULT_SIGN_COUNT;
      } else {
        this.sign_count = integer;
      } 
      integer = paramBuilder.sign_rank;
      if (integer == null) {
        this.sign_rank = DEFAULT_SIGN_RANK;
      } else {
        this.sign_rank = integer;
      } 
      integer = paramBuilder.member_count;
      if (integer == null) {
        this.member_count = DEFAULT_MEMBER_COUNT;
      } else {
        this.member_count = integer;
      } 
      double_ = paramBuilder.dir_rate;
      if (double_ == null) {
        this.dir_rate = DEFAULT_DIR_RATE;
      } else {
        this.dir_rate = double_;
      } 
    } else {
      this.sign_count = ((Builder)double_).sign_count;
      this.sign_rank = ((Builder)double_).sign_rank;
      this.member_count = ((Builder)double_).member_count;
      this.dir_rate = ((Builder)double_).dir_rate;
    } 
  }
  
  public RankInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<RankInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Double dir_rate;
    
    public Integer member_count;
    
    public Integer sign_count;
    
    public Integer sign_rank;
    
    public Builder() {}
    
    public Builder(RankInfo param1RankInfo) {
      super(param1RankInfo);
      if (param1RankInfo == null)
        return; 
      this.sign_count = param1RankInfo.sign_count;
      this.sign_rank = param1RankInfo.sign_rank;
      this.member_count = param1RankInfo.member_count;
      this.dir_rate = param1RankInfo.dir_rate;
    }
    
    public RankInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (RankInfo)interceptResult.objValue; 
      } 
      return new RankInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
