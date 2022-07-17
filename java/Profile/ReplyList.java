package tbclient.Profile;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ReplyList extends Message {
  public static Interceptable $ic;
  
  public static final Long DEFAULT_FRIEND_ID;
  
  public static final String DEFAULT_MESSAGE = "";
  
  public static final Integer DEFAULT_TIME;
  
  public static final Long DEFAULT_USER_ID;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long friend_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String message;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer time;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long user_id;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(704693571, "Ltbclient/Profile/ReplyList;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(704693571, "Ltbclient/Profile/ReplyList;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_USER_ID = long_;
    DEFAULT_FRIEND_ID = long_;
    DEFAULT_TIME = Integer.valueOf(0);
  }
  
  public ReplyList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.user_id;
      if (long_ == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_;
      } 
      long_ = paramBuilder.friend_id;
      if (long_ == null) {
        this.friend_id = DEFAULT_FRIEND_ID;
      } else {
        this.friend_id = long_;
      } 
      String str = paramBuilder.message;
      if (str == null) {
        this.message = "";
      } else {
        this.message = str;
      } 
      integer = paramBuilder.time;
      if (integer == null) {
        this.time = DEFAULT_TIME;
      } else {
        this.time = integer;
      } 
    } else {
      this.user_id = ((Builder)integer).user_id;
      this.friend_id = ((Builder)integer).friend_id;
      this.message = ((Builder)integer).message;
      this.time = ((Builder)integer).time;
    } 
  }
  
  public ReplyList(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ReplyList> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Long friend_id;
    
    public String message;
    
    public Integer time;
    
    public Long user_id;
    
    public Builder() {}
    
    public Builder(ReplyList param1ReplyList) {
      super(param1ReplyList);
      if (param1ReplyList == null)
        return; 
      this.user_id = param1ReplyList.user_id;
      this.friend_id = param1ReplyList.friend_id;
      this.message = param1ReplyList.message;
      this.time = param1ReplyList.time;
    }
    
    public ReplyList build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ReplyList)interceptResult.objValue; 
      } 
      return new ReplyList(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
