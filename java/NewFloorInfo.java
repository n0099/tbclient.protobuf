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

public final class NewFloorInfo extends Message {
  public static Interceptable $ic;
  
  public static final List<PbContent> DEFAULT_CONTENT = Collections.emptyList();
  
  public static final Integer DEFAULT_IS_FLOOR = Integer.valueOf(0);
  
  public transient FieldHolder $fh;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<PbContent> content;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer is_floor;
  
  public NewFloorInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      List<PbContent> list = paramBuilder.content;
      if (list == null) {
        this.content = DEFAULT_CONTENT;
      } else {
        this.content = Message.immutableCopyOf(list);
      } 
      integer = paramBuilder.is_floor;
      if (integer == null) {
        this.is_floor = DEFAULT_IS_FLOOR;
      } else {
        this.is_floor = integer;
      } 
    } else {
      this.content = Message.immutableCopyOf(((Builder)integer).content);
      this.is_floor = ((Builder)integer).is_floor;
    } 
  }
  
  public NewFloorInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1182861897, "Ltbclient/NewFloorInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1182861897, "Ltbclient/NewFloorInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<NewFloorInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public List<PbContent> content;
    
    public Integer is_floor;
    
    public Builder() {}
    
    public Builder(NewFloorInfo param1NewFloorInfo) {
      super(param1NewFloorInfo);
      if (param1NewFloorInfo == null)
        return; 
      this.content = Message.copyOf(param1NewFloorInfo.content);
      this.is_floor = param1NewFloorInfo.is_floor;
    }
    
    public NewFloorInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (NewFloorInfo)interceptResult.objValue; 
      } 
      return new NewFloorInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
