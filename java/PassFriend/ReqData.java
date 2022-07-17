package tbclient.PassFriend;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class ReqData extends Message {
  public static Interceptable $ic;
  
  public static final Long DEFAULT_FRIEND_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_ST_TYPE = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 3)
  public final CommonReq common;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long friend_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String st_type;
  
  public ReqData(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      Long long_ = paramBuilder.friend_id;
      if (long_ == null) {
        this.friend_id = DEFAULT_FRIEND_ID;
      } else {
        this.friend_id = long_;
      } 
      String str = paramBuilder.st_type;
      if (str == null) {
        this.st_type = "";
      } else {
        this.st_type = str;
      } 
      this.common = paramBuilder.common;
    } else {
      this.friend_id = paramBuilder.friend_id;
      this.st_type = paramBuilder.st_type;
      this.common = paramBuilder.common;
    } 
  }
  
  public ReqData(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1488996041, "Ltbclient/PassFriend/ReqData;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1488996041, "Ltbclient/PassFriend/ReqData;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<ReqData> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public CommonReq common;
    
    public Long friend_id;
    
    public String st_type;
    
    public Builder() {}
    
    public Builder(ReqData param1ReqData) {
      super(param1ReqData);
      if (param1ReqData == null)
        return; 
      this.friend_id = param1ReqData.friend_id;
      this.st_type = param1ReqData.st_type;
      this.common = param1ReqData.common;
    }
    
    public ReqData build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ReqData)interceptResult.objValue; 
      } 
      return new ReqData(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
