package tbclient;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class UserPics extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_BIG = "";
  
  public static final String DEFAULT_SMALL = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String big;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String small;
  
  public UserPics(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.big;
      if (str1 == null) {
        this.big = "";
      } else {
        this.big = str1;
      } 
      str = paramBuilder.small;
      if (str == null) {
        this.small = "";
      } else {
        this.small = str;
      } 
    } else {
      this.big = ((Builder)str).big;
      this.small = ((Builder)str).small;
    } 
  }
  
  public UserPics(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<UserPics> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String big;
    
    public String small;
    
    public Builder() {}
    
    public Builder(UserPics param1UserPics) {
      super(param1UserPics);
      if (param1UserPics == null)
        return; 
      this.big = param1UserPics.big;
      this.small = param1UserPics.small;
    }
    
    public UserPics build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (UserPics)interceptResult.objValue; 
      } 
      return new UserPics(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
