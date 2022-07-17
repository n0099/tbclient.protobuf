package tbclient;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TbInteraction extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_CONTENT = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String content;
  
  public TbInteraction(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      str = paramBuilder.content;
      if (str == null) {
        this.content = "";
      } else {
        this.content = str;
      } 
    } else {
      this.content = ((Builder)str).content;
    } 
  }
  
  public TbInteraction(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<TbInteraction> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String content;
    
    public Builder() {}
    
    public Builder(TbInteraction param1TbInteraction) {
      super(param1TbInteraction);
      if (param1TbInteraction == null)
        return; 
      this.content = param1TbInteraction.content;
    }
    
    public TbInteraction build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (TbInteraction)interceptResult.objValue; 
      } 
      return new TbInteraction(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
