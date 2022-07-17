package tbclient;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Avatar extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_PIC = "";
  
  public static final String DEFAULT_POS = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String pic;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String pos;
  
  public Avatar(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.pic;
      if (str1 == null) {
        this.pic = "";
      } else {
        this.pic = str1;
      } 
      str = paramBuilder.pos;
      if (str == null) {
        this.pos = "";
      } else {
        this.pos = str;
      } 
    } else {
      this.pic = ((Builder)str).pic;
      this.pos = ((Builder)str).pos;
    } 
  }
  
  public Avatar(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Avatar> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String pic;
    
    public String pos;
    
    public Builder() {}
    
    public Builder(Avatar param1Avatar) {
      super(param1Avatar);
      if (param1Avatar == null)
        return; 
      this.pic = param1Avatar.pic;
      this.pos = param1Avatar.pos;
    }
    
    public Avatar build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (Avatar)interceptResult.objValue; 
      } 
      return new Avatar(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
