package tbclient;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ReplyExp extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_COLOR_MSG = "";
  
  public static final String DEFAULT_CURRENT_LEVEL = "";
  
  public static final String DEFAULT_CURRENT_LEVEL_MAX_EXP = "";
  
  public static final String DEFAULT_INC = "";
  
  public static final String DEFAULT_OLD = "";
  
  public static final String DEFAULT_PRE_MSG = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String color_msg;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String current_level;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String current_level_max_exp;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String inc;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String old;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String pre_msg;
  
  public ReplyExp(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.pre_msg;
      if (str1 == null) {
        this.pre_msg = "";
      } else {
        this.pre_msg = str1;
      } 
      str1 = paramBuilder.color_msg;
      if (str1 == null) {
        this.color_msg = "";
      } else {
        this.color_msg = str1;
      } 
      str1 = paramBuilder.current_level_max_exp;
      if (str1 == null) {
        this.current_level_max_exp = "";
      } else {
        this.current_level_max_exp = str1;
      } 
      str1 = paramBuilder.current_level;
      if (str1 == null) {
        this.current_level = "";
      } else {
        this.current_level = str1;
      } 
      str1 = paramBuilder.old;
      if (str1 == null) {
        this.old = "";
      } else {
        this.old = str1;
      } 
      str = paramBuilder.inc;
      if (str == null) {
        this.inc = "";
      } else {
        this.inc = str;
      } 
    } else {
      this.pre_msg = ((Builder)str).pre_msg;
      this.color_msg = ((Builder)str).color_msg;
      this.current_level_max_exp = ((Builder)str).current_level_max_exp;
      this.current_level = ((Builder)str).current_level;
      this.old = ((Builder)str).old;
      this.inc = ((Builder)str).inc;
    } 
  }
  
  public ReplyExp(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ReplyExp> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String color_msg;
    
    public String current_level;
    
    public String current_level_max_exp;
    
    public String inc;
    
    public String old;
    
    public String pre_msg;
    
    public Builder() {}
    
    public Builder(ReplyExp param1ReplyExp) {
      super(param1ReplyExp);
      if (param1ReplyExp == null)
        return; 
      this.pre_msg = param1ReplyExp.pre_msg;
      this.color_msg = param1ReplyExp.color_msg;
      this.current_level_max_exp = param1ReplyExp.current_level_max_exp;
      this.current_level = param1ReplyExp.current_level;
      this.old = param1ReplyExp.old;
      this.inc = param1ReplyExp.inc;
    }
    
    public ReplyExp build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ReplyExp)interceptResult.objValue; 
      } 
      return new ReplyExp(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
