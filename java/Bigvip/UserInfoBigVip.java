package tbclient.Bigvip;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class UserInfoBigVip extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_MESSAGE_ACCEPT;
  
  public static final Integer DEFAULT_MUTE_NOTIFICATIONS;
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final String DEFAULT_PORTRAITH = "";
  
  public static final String DEFAULT_USER_DETAIL = "";
  
  public static final Long DEFAULT_USER_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_USER_NAME = "";
  
  public static final String DEFAULT_USER_TYPE = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer message_accept;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT32)
  public final Integer mute_notifications;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String portraith;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String user_detail;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long user_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String user_name;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String user_type;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_MESSAGE_ACCEPT = integer;
    DEFAULT_MUTE_NOTIFICATIONS = integer;
  }
  
  public UserInfoBigVip(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.user_id;
      if (long_ == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_;
      } 
      String str2 = paramBuilder.user_name;
      if (str2 == null) {
        this.user_name = "";
      } else {
        this.user_name = str2;
      } 
      str2 = paramBuilder.user_type;
      if (str2 == null) {
        this.user_type = "";
      } else {
        this.user_type = str2;
      } 
      str2 = paramBuilder.user_detail;
      if (str2 == null) {
        this.user_detail = "";
      } else {
        this.user_detail = str2;
      } 
      Integer integer1 = paramBuilder.message_accept;
      if (integer1 == null) {
        this.message_accept = DEFAULT_MESSAGE_ACCEPT;
      } else {
        this.message_accept = integer1;
      } 
      String str1 = paramBuilder.portrait;
      if (str1 == null) {
        this.portrait = "";
      } else {
        this.portrait = str1;
      } 
      str1 = paramBuilder.portraith;
      if (str1 == null) {
        this.portraith = "";
      } else {
        this.portraith = str1;
      } 
      integer = paramBuilder.mute_notifications;
      if (integer == null) {
        this.mute_notifications = DEFAULT_MUTE_NOTIFICATIONS;
      } else {
        this.mute_notifications = integer;
      } 
    } else {
      this.user_id = ((Builder)integer).user_id;
      this.user_name = ((Builder)integer).user_name;
      this.user_type = ((Builder)integer).user_type;
      this.user_detail = ((Builder)integer).user_detail;
      this.message_accept = ((Builder)integer).message_accept;
      this.portrait = ((Builder)integer).portrait;
      this.portraith = ((Builder)integer).portraith;
      this.mute_notifications = ((Builder)integer).mute_notifications;
    } 
  }
  
  public UserInfoBigVip(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(2074595805, "Ltbclient/Bigvip/UserInfoBigVip;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(2074595805, "Ltbclient/Bigvip/UserInfoBigVip;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<UserInfoBigVip> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer message_accept;
    
    public Integer mute_notifications;
    
    public String portrait;
    
    public String portraith;
    
    public String user_detail;
    
    public Long user_id;
    
    public String user_name;
    
    public String user_type;
    
    public Builder() {}
    
    public Builder(UserInfoBigVip param1UserInfoBigVip) {
      super(param1UserInfoBigVip);
      if (param1UserInfoBigVip == null)
        return; 
      this.user_id = param1UserInfoBigVip.user_id;
      this.user_name = param1UserInfoBigVip.user_name;
      this.user_type = param1UserInfoBigVip.user_type;
      this.user_detail = param1UserInfoBigVip.user_detail;
      this.message_accept = param1UserInfoBigVip.message_accept;
      this.portrait = param1UserInfoBigVip.portrait;
      this.portraith = param1UserInfoBigVip.portraith;
      this.mute_notifications = param1UserInfoBigVip.mute_notifications;
    }
    
    public UserInfoBigVip build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (UserInfoBigVip)interceptResult.objValue; 
      } 
      return new UserInfoBigVip(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
