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

public final class VipCloseAd extends Message {
  public static Interceptable $ic;
  
  public static final List<Integer> DEFAULT_FORUM_CLOSE;
  
  public static final Integer DEFAULT_IS_OPEN;
  
  public static final Integer DEFAULT_VIP_CLOSE;
  
  public transient FieldHolder $fh;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3, type = Message.Datatype.INT32)
  public final List<Integer> forum_close;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer is_open;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer vip_close;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1452969843, "Ltbclient/VipCloseAd;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1452969843, "Ltbclient/VipCloseAd;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_OPEN = integer;
    DEFAULT_VIP_CLOSE = integer;
    DEFAULT_FORUM_CLOSE = Collections.emptyList();
  }
  
  public VipCloseAd(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<Integer> list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.is_open;
      if (integer == null) {
        this.is_open = DEFAULT_IS_OPEN;
      } else {
        this.is_open = integer;
      } 
      integer = paramBuilder.vip_close;
      if (integer == null) {
        this.vip_close = DEFAULT_VIP_CLOSE;
      } else {
        this.vip_close = integer;
      } 
      list = paramBuilder.forum_close;
      if (list == null) {
        this.forum_close = DEFAULT_FORUM_CLOSE;
      } else {
        this.forum_close = Message.immutableCopyOf(list);
      } 
    } else {
      this.is_open = ((Builder)list).is_open;
      this.vip_close = ((Builder)list).vip_close;
      this.forum_close = Message.immutableCopyOf(((Builder)list).forum_close);
    } 
  }
  
  public VipCloseAd(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<VipCloseAd> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public List<Integer> forum_close;
    
    public Integer is_open;
    
    public Integer vip_close;
    
    public Builder() {}
    
    public Builder(VipCloseAd param1VipCloseAd) {
      super(param1VipCloseAd);
      if (param1VipCloseAd == null)
        return; 
      this.is_open = param1VipCloseAd.is_open;
      this.vip_close = param1VipCloseAd.vip_close;
      this.forum_close = Message.copyOf(param1VipCloseAd.forum_close);
    }
    
    public VipCloseAd build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (VipCloseAd)interceptResult.objValue; 
      } 
      return new VipCloseAd(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
