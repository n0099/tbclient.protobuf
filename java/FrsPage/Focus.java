package tbclient.FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Focus extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_LINK = "";
  
  public static final Integer DEFAULT_TIME = Integer.valueOf(0);
  
  public static final String DEFAULT_TITLE = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String link;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer time;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  public Focus(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.time;
      if (integer == null) {
        this.time = DEFAULT_TIME;
      } else {
        this.time = integer;
      } 
      String str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      str = paramBuilder.link;
      if (str == null) {
        this.link = "";
      } else {
        this.link = str;
      } 
    } else {
      this.time = ((Builder)str).time;
      this.title = ((Builder)str).title;
      this.link = ((Builder)str).link;
    } 
  }
  
  public Focus(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(685172166, "Ltbclient/FrsPage/Focus;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(685172166, "Ltbclient/FrsPage/Focus;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<Focus> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String link;
    
    public Integer time;
    
    public String title;
    
    public Builder() {}
    
    public Builder(Focus param1Focus) {
      super(param1Focus);
      if (param1Focus == null)
        return; 
      this.time = param1Focus.time;
      this.title = param1Focus.title;
      this.link = param1Focus.link;
    }
    
    public Focus build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (Focus)interceptResult.objValue; 
      } 
      return new Focus(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
