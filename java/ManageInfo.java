package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ManageInfo extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_ITEM_SOURCE = Integer.valueOf(0);
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1)
  public final Item item;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer item_source;
  
  @ProtoField(tag = 2)
  public final TiebaPlusInfo tiebaplus_info;
  
  public ManageInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      this.item = paramBuilder.item;
      this.tiebaplus_info = paramBuilder.tiebaplus_info;
      integer = paramBuilder.item_source;
      if (integer == null) {
        this.item_source = DEFAULT_ITEM_SOURCE;
      } else {
        this.item_source = integer;
      } 
    } else {
      this.item = ((Builder)integer).item;
      this.tiebaplus_info = ((Builder)integer).tiebaplus_info;
      this.item_source = ((Builder)integer).item_source;
    } 
  }
  
  public ManageInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1615088574, "Ltbclient/ManageInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1615088574, "Ltbclient/ManageInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<ManageInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Item item;
    
    public Integer item_source;
    
    public TiebaPlusInfo tiebaplus_info;
    
    public Builder() {}
    
    public Builder(ManageInfo param1ManageInfo) {
      super(param1ManageInfo);
      if (param1ManageInfo == null)
        return; 
      this.item = param1ManageInfo.item;
      this.tiebaplus_info = param1ManageInfo.tiebaplus_info;
      this.item_source = param1ManageInfo.item_source;
    }
    
    public ManageInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ManageInfo)interceptResult.objValue; 
      } 
      return new ManageInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
