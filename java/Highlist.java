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

public final class Highlist extends Message {
  public static Interceptable $ic;
  
  public static final Boolean DEFAULT_HAS_MORE;
  
  public static final List<High> DEFAULT_LIST = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.BOOL)
  public final Boolean has_more;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<High> list;
  
  static {
    DEFAULT_HAS_MORE = Boolean.FALSE;
  }
  
  public Highlist(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Boolean bool;
    if (paramBoolean == true) {
      List<High> list = paramBuilder.list;
      if (list == null) {
        this.list = DEFAULT_LIST;
      } else {
        this.list = Message.immutableCopyOf(list);
      } 
      bool = paramBuilder.has_more;
      if (bool == null) {
        this.has_more = DEFAULT_HAS_MORE;
      } else {
        this.has_more = bool;
      } 
    } else {
      this.list = Message.immutableCopyOf(((Builder)bool).list);
      this.has_more = ((Builder)bool).has_more;
    } 
  }
  
  public Highlist(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-777844399, "Ltbclient/Highlist;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-777844399, "Ltbclient/Highlist;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<Highlist> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Boolean has_more;
    
    public List<High> list;
    
    public Builder() {}
    
    public Builder(Highlist param1Highlist) {
      super(param1Highlist);
      if (param1Highlist == null)
        return; 
      this.list = Message.copyOf(param1Highlist.list);
      this.has_more = param1Highlist.has_more;
    }
    
    public Highlist build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (Highlist)interceptResult.objValue; 
      } 
      return new Highlist(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
