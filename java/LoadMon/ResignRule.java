package tbclient.LoadMon;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ResignRule extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_CARD_NUM = Integer.valueOf(0);
  
  public static final String DEFAULT_RANGE = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer card_num;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String range;
  
  public ResignRule(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.range;
      if (str == null) {
        this.range = "";
      } else {
        this.range = str;
      } 
      integer = paramBuilder.card_num;
      if (integer == null) {
        this.card_num = DEFAULT_CARD_NUM;
      } else {
        this.card_num = integer;
      } 
    } else {
      this.range = ((Builder)integer).range;
      this.card_num = ((Builder)integer).card_num;
    } 
  }
  
  public ResignRule(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1623530852, "Ltbclient/LoadMon/ResignRule;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1623530852, "Ltbclient/LoadMon/ResignRule;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<ResignRule> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer card_num;
    
    public String range;
    
    public Builder() {}
    
    public Builder(ResignRule param1ResignRule) {
      super(param1ResignRule);
      if (param1ResignRule == null)
        return; 
      this.range = param1ResignRule.range;
      this.card_num = param1ResignRule.card_num;
    }
    
    public ResignRule build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ResignRule)interceptResult.objValue; 
      } 
      return new ResignRule(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
