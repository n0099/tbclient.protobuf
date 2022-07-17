package tbclient.SlotMachineRank;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class SmRankItem extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final Long DEFAULT_USER_ID;
  
  public static final Integer DEFAULT_USER_LEVEL;
  
  public static final String DEFAULT_USER_NAME = "";
  
  public static final Integer DEFAULT_WIN;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT64)
  public final Long user_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer user_level;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String user_name;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer win;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1010386082, "Ltbclient/SlotMachineRank/SmRankItem;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1010386082, "Ltbclient/SlotMachineRank/SmRankItem;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_USER_LEVEL = integer;
    DEFAULT_WIN = integer;
    DEFAULT_USER_ID = Long.valueOf(0L);
  }
  
  public SmRankItem(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      String str2 = paramBuilder.portrait;
      if (str2 == null) {
        this.portrait = "";
      } else {
        this.portrait = str2;
      } 
      Integer integer2 = paramBuilder.user_level;
      if (integer2 == null) {
        this.user_level = DEFAULT_USER_LEVEL;
      } else {
        this.user_level = integer2;
      } 
      String str1 = paramBuilder.user_name;
      if (str1 == null) {
        this.user_name = "";
      } else {
        this.user_name = str1;
      } 
      Integer integer1 = paramBuilder.win;
      if (integer1 == null) {
        this.win = DEFAULT_WIN;
      } else {
        this.win = integer1;
      } 
      long_ = paramBuilder.user_id;
      if (long_ == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_;
      } 
    } else {
      this.portrait = ((Builder)long_).portrait;
      this.user_level = ((Builder)long_).user_level;
      this.user_name = ((Builder)long_).user_name;
      this.win = ((Builder)long_).win;
      this.user_id = ((Builder)long_).user_id;
    } 
  }
  
  public SmRankItem(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<SmRankItem> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String portrait;
    
    public Long user_id;
    
    public Integer user_level;
    
    public String user_name;
    
    public Integer win;
    
    public Builder() {}
    
    public Builder(SmRankItem param1SmRankItem) {
      super(param1SmRankItem);
      if (param1SmRankItem == null)
        return; 
      this.portrait = param1SmRankItem.portrait;
      this.user_level = param1SmRankItem.user_level;
      this.user_name = param1SmRankItem.user_name;
      this.win = param1SmRankItem.win;
      this.user_id = param1SmRankItem.user_id;
    }
    
    public SmRankItem build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (SmRankItem)interceptResult.objValue; 
      } 
      return new SmRankItem(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
