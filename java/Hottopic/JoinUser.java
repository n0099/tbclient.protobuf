package tbclient.Hottopic;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class JoinUser extends Message {
  public static Interceptable $ic;
  
  public static final List<UserInfo> DEFAULT_JOIN_USER = Collections.emptyList();
  
  public static final Long DEFAULT_JOIN_USER_NUM = Long.valueOf(0L);
  
  public transient FieldHolder $fh;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<UserInfo> join_user;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long join_user_num;
  
  public JoinUser(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      List<UserInfo> list = paramBuilder.join_user;
      if (list == null) {
        this.join_user = DEFAULT_JOIN_USER;
      } else {
        this.join_user = Message.immutableCopyOf(list);
      } 
      long_ = paramBuilder.join_user_num;
      if (long_ == null) {
        this.join_user_num = DEFAULT_JOIN_USER_NUM;
      } else {
        this.join_user_num = long_;
      } 
    } else {
      this.join_user = Message.immutableCopyOf(((Builder)long_).join_user);
      this.join_user_num = ((Builder)long_).join_user_num;
    } 
  }
  
  public JoinUser(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1515272125, "Ltbclient/Hottopic/JoinUser;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1515272125, "Ltbclient/Hottopic/JoinUser;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<JoinUser> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public List<UserInfo> join_user;
    
    public Long join_user_num;
    
    public Builder() {}
    
    public Builder(JoinUser param1JoinUser) {
      super(param1JoinUser);
      if (param1JoinUser == null)
        return; 
      this.join_user = Message.copyOf(param1JoinUser.join_user);
      this.join_user_num = param1JoinUser.join_user_num;
    }
    
    public JoinUser build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (JoinUser)interceptResult.objValue; 
      } 
      return new JoinUser(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
