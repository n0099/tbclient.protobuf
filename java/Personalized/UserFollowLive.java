package tbclient.Personalized;

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

public final class UserFollowLive extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_SWITCH;
  
  public static final List<AlaLiveInfo> DEFAULT_USER_FOLLOW_LIVE = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT32)
  public final Integer _switch;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<AlaLiveInfo> user_follow_live;
  
  static {
    DEFAULT_SWITCH = Integer.valueOf(0);
  }
  
  public UserFollowLive(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      List<AlaLiveInfo> list = paramBuilder.user_follow_live;
      if (list == null) {
        this.user_follow_live = DEFAULT_USER_FOLLOW_LIVE;
      } else {
        this.user_follow_live = Message.immutableCopyOf(list);
      } 
      integer = paramBuilder._switch;
      if (integer == null) {
        this._switch = DEFAULT_SWITCH;
      } else {
        this._switch = integer;
      } 
    } else {
      this.user_follow_live = Message.immutableCopyOf(((Builder)integer).user_follow_live);
      this._switch = ((Builder)integer)._switch;
    } 
  }
  
  public UserFollowLive(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1451538338, "Ltbclient/Personalized/UserFollowLive;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1451538338, "Ltbclient/Personalized/UserFollowLive;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<UserFollowLive> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer _switch;
    
    public List<AlaLiveInfo> user_follow_live;
    
    public Builder() {}
    
    public Builder(UserFollowLive param1UserFollowLive) {
      super(param1UserFollowLive);
      if (param1UserFollowLive == null)
        return; 
      this.user_follow_live = Message.copyOf(param1UserFollowLive.user_follow_live);
      this._switch = param1UserFollowLive._switch;
    }
    
    public UserFollowLive build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (UserFollowLive)interceptResult.objValue; 
      } 
      return new UserFollowLive(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
