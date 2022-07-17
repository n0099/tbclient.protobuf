package tbclient.Personal;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class UserGodInfo extends Message {
  public static Interceptable $ic;
  
  public static final List<ForumGodDetailInfo> DEFAULT_FORUM_GOD_LIST;
  
  public static final Integer DEFAULT_GOD_TYPE = Integer.valueOf(0);
  
  public transient FieldHolder $fh;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3)
  public final List<ForumGodDetailInfo> forum_god_list;
  
  @ProtoField(tag = 2)
  public final GodDetailInfo god_info;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer god_type;
  
  static {
    DEFAULT_FORUM_GOD_LIST = Collections.emptyList();
  }
  
  public UserGodInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<ForumGodDetailInfo> list;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.god_type;
      if (integer == null) {
        this.god_type = DEFAULT_GOD_TYPE;
      } else {
        this.god_type = integer;
      } 
      this.god_info = paramBuilder.god_info;
      list = paramBuilder.forum_god_list;
      if (list == null) {
        this.forum_god_list = DEFAULT_FORUM_GOD_LIST;
      } else {
        this.forum_god_list = Message.immutableCopyOf(list);
      } 
    } else {
      this.god_type = ((Builder)list).god_type;
      this.god_info = ((Builder)list).god_info;
      this.forum_god_list = Message.immutableCopyOf(((Builder)list).forum_god_list);
    } 
  }
  
  public UserGodInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1471154175, "Ltbclient/Personal/UserGodInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1471154175, "Ltbclient/Personal/UserGodInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<UserGodInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public List<ForumGodDetailInfo> forum_god_list;
    
    public GodDetailInfo god_info;
    
    public Integer god_type;
    
    public Builder() {}
    
    public Builder(UserGodInfo param1UserGodInfo) {
      super(param1UserGodInfo);
      if (param1UserGodInfo == null)
        return; 
      this.god_type = param1UserGodInfo.god_type;
      this.god_info = param1UserGodInfo.god_info;
      this.forum_god_list = Message.copyOf(param1UserGodInfo.forum_god_list);
    }
    
    public UserGodInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (UserGodInfo)interceptResult.objValue; 
      } 
      return new UserGodInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
