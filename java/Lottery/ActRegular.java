package tbclient.Lottery;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ActRegular extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_BTN_NAME = "";
  
  public static final Integer DEFAULT_CHANCE;
  
  public static final Integer DEFAULT_TYPE;
  
  public static final String DEFAULT_URL = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String btn_name;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer chance;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer type;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String url;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(103944129, "Ltbclient/Lottery/ActRegular;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(103944129, "Ltbclient/Lottery/ActRegular;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_TYPE = integer;
    DEFAULT_CHANCE = integer;
  }
  
  public ActRegular(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
      integer = paramBuilder.chance;
      if (integer == null) {
        this.chance = DEFAULT_CHANCE;
      } else {
        this.chance = integer;
      } 
      String str1 = paramBuilder.url;
      if (str1 == null) {
        this.url = "";
      } else {
        this.url = str1;
      } 
      str = paramBuilder.btn_name;
      if (str == null) {
        this.btn_name = "";
      } else {
        this.btn_name = str;
      } 
    } else {
      this.type = ((Builder)str).type;
      this.chance = ((Builder)str).chance;
      this.url = ((Builder)str).url;
      this.btn_name = ((Builder)str).btn_name;
    } 
  }
  
  public ActRegular(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ActRegular> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String btn_name;
    
    public Integer chance;
    
    public Integer type;
    
    public String url;
    
    public Builder() {}
    
    public Builder(ActRegular param1ActRegular) {
      super(param1ActRegular);
      if (param1ActRegular == null)
        return; 
      this.type = param1ActRegular.type;
      this.chance = param1ActRegular.chance;
      this.url = param1ActRegular.url;
      this.btn_name = param1ActRegular.btn_name;
    }
    
    public ActRegular build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ActRegular)interceptResult.objValue; 
      } 
      return new ActRegular(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
