package tbclient.AddFriend;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ResData extends Message {
  public static Interceptable $ic;
  
  public static final Long DEFAULT_FRIEND_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_MESSAGE = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long friend_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String message;
  
  public ResData(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.friend_id;
      if (long_ == null) {
        this.friend_id = DEFAULT_FRIEND_ID;
      } else {
        this.friend_id = long_;
      } 
      str = paramBuilder.message;
      if (str == null) {
        this.message = "";
      } else {
        this.message = str;
      } 
    } else {
      this.friend_id = ((Builder)str).friend_id;
      this.message = ((Builder)str).message;
    } 
  }
  
  public ResData(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1448986891, "Ltbclient/AddFriend/ResData;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1448986891, "Ltbclient/AddFriend/ResData;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<ResData> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Long friend_id;
    
    public String message;
    
    public Builder() {}
    
    public Builder(ResData param1ResData) {
      super(param1ResData);
      if (param1ResData == null)
        return; 
      this.friend_id = param1ResData.friend_id;
      this.message = param1ResData.message;
    }
    
    public ResData build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ResData)interceptResult.objValue; 
      } 
      return new ResData(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
