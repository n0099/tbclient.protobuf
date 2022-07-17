package tbclient.GetUserFreeChance;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class DataRes extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_FREE_CHANCE;
  
  public static final Integer DEFAULT_SCENE_ID;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer free_chance;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer scene_id;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(277491037, "Ltbclient/GetUserFreeChance/DataRes;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(277491037, "Ltbclient/GetUserFreeChance/DataRes;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_FREE_CHANCE = integer;
    DEFAULT_SCENE_ID = integer;
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.free_chance;
      if (integer1 == null) {
        this.free_chance = DEFAULT_FREE_CHANCE;
      } else {
        this.free_chance = integer1;
      } 
      integer = paramBuilder.scene_id;
      if (integer == null) {
        this.scene_id = DEFAULT_SCENE_ID;
      } else {
        this.scene_id = integer;
      } 
    } else {
      this.free_chance = ((Builder)integer).free_chance;
      this.scene_id = ((Builder)integer).scene_id;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer free_chance;
    
    public Integer scene_id;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.free_chance = param1DataRes.free_chance;
      this.scene_id = param1DataRes.scene_id;
    }
    
    public DataRes build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (DataRes)interceptResult.objValue; 
      } 
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
