package tbclient.GetGiftList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PresentNumInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_NAME = "";
  
  public static final Integer DEFAULT_NUM = Integer.valueOf(0);
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer num;
  
  public PresentNumInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.num;
      if (integer == null) {
        this.num = DEFAULT_NUM;
      } else {
        this.num = integer;
      } 
      str = paramBuilder.name;
      if (str == null) {
        this.name = "";
      } else {
        this.name = str;
      } 
    } else {
      this.num = ((Builder)str).num;
      this.name = ((Builder)str).name;
    } 
  }
  
  public PresentNumInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(696405837, "Ltbclient/GetGiftList/PresentNumInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(696405837, "Ltbclient/GetGiftList/PresentNumInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<PresentNumInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String name;
    
    public Integer num;
    
    public Builder() {}
    
    public Builder(PresentNumInfo param1PresentNumInfo) {
      super(param1PresentNumInfo);
      if (param1PresentNumInfo == null)
        return; 
      this.num = param1PresentNumInfo.num;
      this.name = param1PresentNumInfo.name;
    }
    
    public PresentNumInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (PresentNumInfo)interceptResult.objValue; 
      } 
      return new PresentNumInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
