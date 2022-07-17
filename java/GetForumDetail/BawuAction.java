package tbclient.GetForumDetail;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class BawuAction extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_NAME = "";
  
  public static final Integer DEFAULT_TYPE = Integer.valueOf(0);
  
  public static final String DEFAULT_URL = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer type;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String url;
  
  public BawuAction(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.name;
      if (str1 == null) {
        this.name = "";
      } else {
        this.name = str1;
      } 
      Integer integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
      str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
    } else {
      this.name = ((Builder)str).name;
      this.type = ((Builder)str).type;
      this.url = ((Builder)str).url;
    } 
  }
  
  public BawuAction(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-788404993, "Ltbclient/GetForumDetail/BawuAction;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-788404993, "Ltbclient/GetForumDetail/BawuAction;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<BawuAction> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String name;
    
    public Integer type;
    
    public String url;
    
    public Builder() {}
    
    public Builder(BawuAction param1BawuAction) {
      super(param1BawuAction);
      if (param1BawuAction == null)
        return; 
      this.name = param1BawuAction.name;
      this.type = param1BawuAction.type;
      this.url = param1BawuAction.url;
    }
    
    public BawuAction build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (BawuAction)interceptResult.objValue; 
      } 
      return new BawuAction(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
