package tbclient.FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.App;

public final class AdkillerAd extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_CAN_CLOSE = Integer.valueOf(0);
  
  public static final String DEFAULT_GAME_URL = "";
  
  public static final String DEFAULT_TAG = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 3)
  public final App app;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer can_close;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String game_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String tag;
  
  public AdkillerAd(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.tag;
      if (str == null) {
        this.tag = "";
      } else {
        this.tag = str;
      } 
      str = paramBuilder.game_url;
      if (str == null) {
        this.game_url = "";
      } else {
        this.game_url = str;
      } 
      this.app = paramBuilder.app;
      integer = paramBuilder.can_close;
      if (integer == null) {
        this.can_close = DEFAULT_CAN_CLOSE;
      } else {
        this.can_close = integer;
      } 
    } else {
      this.tag = ((Builder)integer).tag;
      this.game_url = ((Builder)integer).game_url;
      this.app = ((Builder)integer).app;
      this.can_close = ((Builder)integer).can_close;
    } 
  }
  
  public AdkillerAd(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1201387943, "Ltbclient/FrsPage/AdkillerAd;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1201387943, "Ltbclient/FrsPage/AdkillerAd;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<AdkillerAd> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public App app;
    
    public Integer can_close;
    
    public String game_url;
    
    public String tag;
    
    public Builder() {}
    
    public Builder(AdkillerAd param1AdkillerAd) {
      super(param1AdkillerAd);
      if (param1AdkillerAd == null)
        return; 
      this.tag = param1AdkillerAd.tag;
      this.game_url = param1AdkillerAd.game_url;
      this.app = param1AdkillerAd.app;
      this.can_close = param1AdkillerAd.can_close;
    }
    
    public AdkillerAd build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (AdkillerAd)interceptResult.objValue; 
      } 
      return new AdkillerAd(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
