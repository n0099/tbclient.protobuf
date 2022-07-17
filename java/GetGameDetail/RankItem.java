package tbclient.GetGameDetail;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class RankItem extends Message {
  public static Interceptable $ic;
  
  public static final Long DEFAULT_GRADE;
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final Long DEFAULT_USER_ID;
  
  public static final String DEFAULT_USER_NAME = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT64)
  public final Long grade;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long user_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String user_name;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1618057916, "Ltbclient/GetGameDetail/RankItem;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1618057916, "Ltbclient/GetGameDetail/RankItem;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_USER_ID = long_;
    DEFAULT_GRADE = long_;
  }
  
  public RankItem(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Long long_1 = paramBuilder.user_id;
      if (long_1 == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_1;
      } 
      String str = paramBuilder.user_name;
      if (str == null) {
        this.user_name = "";
      } else {
        this.user_name = str;
      } 
      str = paramBuilder.portrait;
      if (str == null) {
        this.portrait = "";
      } else {
        this.portrait = str;
      } 
      long_ = paramBuilder.grade;
      if (long_ == null) {
        this.grade = DEFAULT_GRADE;
      } else {
        this.grade = long_;
      } 
    } else {
      this.user_id = ((Builder)long_).user_id;
      this.user_name = ((Builder)long_).user_name;
      this.portrait = ((Builder)long_).portrait;
      this.grade = ((Builder)long_).grade;
    } 
  }
  
  public RankItem(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<RankItem> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Long grade;
    
    public String portrait;
    
    public Long user_id;
    
    public String user_name;
    
    public Builder() {}
    
    public Builder(RankItem param1RankItem) {
      super(param1RankItem);
      if (param1RankItem == null)
        return; 
      this.user_id = param1RankItem.user_id;
      this.user_name = param1RankItem.user_name;
      this.portrait = param1RankItem.portrait;
      this.grade = param1RankItem.grade;
    }
    
    public RankItem build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (RankItem)interceptResult.objValue; 
      } 
      return new RankItem(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
