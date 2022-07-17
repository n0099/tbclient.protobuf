package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class ForumRule extends Message {
  public static Interceptable $ic;
  
  public static final List<PbContent> DEFAULT_CONTENT = Collections.emptyList();
  
  public static final Integer DEFAULT_STATUS = Integer.valueOf(0);
  
  public static final String DEFAULT_TITLE = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<PbContent> content;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer status;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  public ForumRule(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      List<PbContent> list = paramBuilder.content;
      if (list == null) {
        this.content = DEFAULT_CONTENT;
      } else {
        this.content = Message.immutableCopyOf(list);
      } 
      integer = paramBuilder.status;
      if (integer == null) {
        this.status = DEFAULT_STATUS;
      } else {
        this.status = integer;
      } 
    } else {
      this.title = ((Builder)integer).title;
      this.content = Message.immutableCopyOf(((Builder)integer).content);
      this.status = ((Builder)integer).status;
    } 
  }
  
  public ForumRule(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(445994120, "Ltbclient/ForumRule;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(445994120, "Ltbclient/ForumRule;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<ForumRule> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public List<PbContent> content;
    
    public Integer status;
    
    public String title;
    
    public Builder() {}
    
    public Builder(ForumRule param1ForumRule) {
      super(param1ForumRule);
      if (param1ForumRule == null)
        return; 
      this.title = param1ForumRule.title;
      this.content = Message.copyOf(param1ForumRule.content);
      this.status = param1ForumRule.status;
    }
    
    public ForumRule build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ForumRule)interceptResult.objValue; 
      } 
      return new ForumRule(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
