package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class NewGodInfo extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_FIELD_ID;
  
  public static final String DEFAULT_FIELD_NAME = "";
  
  public static final Integer DEFAULT_STATUS;
  
  public static final Integer DEFAULT_TYPE;
  
  public static final String DEFAULT_TYPE_NAME = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer field_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String field_name;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer status;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer type;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String type_name;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(357899463, "Ltbclient/NewGodInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(357899463, "Ltbclient/NewGodInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_STATUS = integer;
    DEFAULT_FIELD_ID = integer;
    DEFAULT_TYPE = integer;
  }
  
  public NewGodInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.status;
      if (integer2 == null) {
        this.status = DEFAULT_STATUS;
      } else {
        this.status = integer2;
      } 
      integer2 = paramBuilder.field_id;
      if (integer2 == null) {
        this.field_id = DEFAULT_FIELD_ID;
      } else {
        this.field_id = integer2;
      } 
      String str1 = paramBuilder.field_name;
      if (str1 == null) {
        this.field_name = "";
      } else {
        this.field_name = str1;
      } 
      Integer integer1 = paramBuilder.type;
      if (integer1 == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer1;
      } 
      str = paramBuilder.type_name;
      if (str == null) {
        this.type_name = "";
      } else {
        this.type_name = str;
      } 
    } else {
      this.status = ((Builder)str).status;
      this.field_id = ((Builder)str).field_id;
      this.field_name = ((Builder)str).field_name;
      this.type = ((Builder)str).type;
      this.type_name = ((Builder)str).type_name;
    } 
  }
  
  public NewGodInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<NewGodInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer field_id;
    
    public String field_name;
    
    public Integer status;
    
    public Integer type;
    
    public String type_name;
    
    public Builder() {}
    
    public Builder(NewGodInfo param1NewGodInfo) {
      super(param1NewGodInfo);
      if (param1NewGodInfo == null)
        return; 
      this.status = param1NewGodInfo.status;
      this.field_id = param1NewGodInfo.field_id;
      this.field_name = param1NewGodInfo.field_name;
      this.type = param1NewGodInfo.type;
      this.type_name = param1NewGodInfo.type_name;
    }
    
    public NewGodInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (NewGodInfo)interceptResult.objValue; 
      } 
      return new NewGodInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
