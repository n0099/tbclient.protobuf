package tbclient.Userlike;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AlaLiveInfo;

public final class BannerFollowLive extends Message {
  public static Interceptable $ic;
  
  public static final List<AlaLiveInfo> DEFAULT_ALA_LIVE_LIST = Collections.emptyList();
  
  public static final Integer DEFAULT_SWITCH = Integer.valueOf(0);
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer _switch;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<AlaLiveInfo> ala_live_list;
  
  public BannerFollowLive(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      List<AlaLiveInfo> list = paramBuilder.ala_live_list;
      if (list == null) {
        this.ala_live_list = DEFAULT_ALA_LIVE_LIST;
      } else {
        this.ala_live_list = Message.immutableCopyOf(list);
      } 
      integer = paramBuilder._switch;
      if (integer == null) {
        this._switch = DEFAULT_SWITCH;
      } else {
        this._switch = integer;
      } 
    } else {
      this.ala_live_list = Message.immutableCopyOf(((Builder)integer).ala_live_list);
      this._switch = ((Builder)integer)._switch;
    } 
  }
  
  public BannerFollowLive(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-2134502865, "Ltbclient/Userlike/BannerFollowLive;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-2134502865, "Ltbclient/Userlike/BannerFollowLive;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<BannerFollowLive> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer _switch;
    
    public List<AlaLiveInfo> ala_live_list;
    
    public Builder() {}
    
    public Builder(BannerFollowLive param1BannerFollowLive) {
      super(param1BannerFollowLive);
      if (param1BannerFollowLive == null)
        return; 
      this.ala_live_list = Message.copyOf(param1BannerFollowLive.ala_live_list);
      this._switch = param1BannerFollowLive._switch;
    }
    
    public BannerFollowLive build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (BannerFollowLive)interceptResult.objValue; 
      } 
      return new BannerFollowLive(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
