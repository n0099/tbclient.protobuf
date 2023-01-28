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

public final class Toast extends Message {
  public static Interceptable $ic;
  
  public static final List<ToastContent> DEFAULT_CONTENT;
  
  public static final Integer DEFAULT_ICON_TYPE = Integer.valueOf(0);
  
  public transient FieldHolder $fh;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<ToastContent> content;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer icon_type;
  
  static {
    DEFAULT_CONTENT = Collections.emptyList();
  }
  
  public Toast(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<ToastContent> list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.icon_type;
      if (integer == null) {
        this.icon_type = DEFAULT_ICON_TYPE;
      } else {
        this.icon_type = integer;
      } 
      list = paramBuilder.content;
      if (list == null) {
        this.content = DEFAULT_CONTENT;
      } else {
        this.content = Message.immutableCopyOf(list);
      } 
    } else {
      this.icon_type = ((Builder)list).icon_type;
      this.content = Message.immutableCopyOf(((Builder)list).content);
    } 
  }
  
  public Toast(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(660303966, "Ltbclient/Toast;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(660303966, "Ltbclient/Toast;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<Toast> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public List<ToastContent> content;
    
    public Integer icon_type;
    
    public Builder() {}
    
    public Builder(Toast param1Toast) {
      super(param1Toast);
      if (param1Toast == null)
        return; 
      this.icon_type = param1Toast.icon_type;
      this.content = Message.copyOf(param1Toast.content);
    }
    
    public Toast build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (Toast)interceptResult.objValue; 
      } 
      return new Toast(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
