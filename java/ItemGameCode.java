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

public final class ItemGameCode extends Message {
  public static Interceptable $ic;
  
  public static final List<GameCodeList> DEFAULT_GAME_CODE_LIST;
  
  public static final Integer DEFAULT_UNCLAIMED_NUM = Integer.valueOf(0);
  
  public transient FieldHolder $fh;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 2)
  public final List<GameCodeList> game_code_list;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer unclaimed_num;
  
  static {
    DEFAULT_GAME_CODE_LIST = Collections.emptyList();
  }
  
  public ItemGameCode(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<GameCodeList> list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.unclaimed_num;
      if (integer == null) {
        this.unclaimed_num = DEFAULT_UNCLAIMED_NUM;
      } else {
        this.unclaimed_num = integer;
      } 
      list = paramBuilder.game_code_list;
      if (list == null) {
        this.game_code_list = DEFAULT_GAME_CODE_LIST;
      } else {
        this.game_code_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.unclaimed_num = ((Builder)list).unclaimed_num;
      this.game_code_list = Message.immutableCopyOf(((Builder)list).game_code_list);
    } 
  }
  
  public ItemGameCode(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1494214497, "Ltbclient/ItemGameCode;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1494214497, "Ltbclient/ItemGameCode;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<ItemGameCode> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public List<GameCodeList> game_code_list;
    
    public Integer unclaimed_num;
    
    public Builder() {}
    
    public Builder(ItemGameCode param1ItemGameCode) {
      super(param1ItemGameCode);
      if (param1ItemGameCode == null)
        return; 
      this.unclaimed_num = param1ItemGameCode.unclaimed_num;
      this.game_code_list = Message.copyOf(param1ItemGameCode.game_code_list);
    }
    
    public ItemGameCode build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ItemGameCode)interceptResult.objValue; 
      } 
      return new ItemGameCode(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
