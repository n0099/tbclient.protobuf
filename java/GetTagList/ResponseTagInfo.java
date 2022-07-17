package tbclient.GetTagList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ResponseTagInfo extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_IS_FOLLOWED;
  
  public static final Integer DEFAULT_TAG_ID;
  
  public static final String DEFAULT_TAG_NAME = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer is_followed;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer tag_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String tag_name;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1285368183, "Ltbclient/GetTagList/ResponseTagInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1285368183, "Ltbclient/GetTagList/ResponseTagInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_TAG_ID = integer;
    DEFAULT_IS_FOLLOWED = integer;
  }
  
  public ResponseTagInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer1 = paramBuilder.tag_id;
      if (integer1 == null) {
        this.tag_id = DEFAULT_TAG_ID;
      } else {
        this.tag_id = integer1;
      } 
      String str = paramBuilder.tag_name;
      if (str == null) {
        this.tag_name = "";
      } else {
        this.tag_name = str;
      } 
      integer = paramBuilder.is_followed;
      if (integer == null) {
        this.is_followed = DEFAULT_IS_FOLLOWED;
      } else {
        this.is_followed = integer;
      } 
    } else {
      this.tag_id = ((Builder)integer).tag_id;
      this.tag_name = ((Builder)integer).tag_name;
      this.is_followed = ((Builder)integer).is_followed;
    } 
  }
  
  public ResponseTagInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ResponseTagInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer is_followed;
    
    public Integer tag_id;
    
    public String tag_name;
    
    public Builder() {}
    
    public Builder(ResponseTagInfo param1ResponseTagInfo) {
      super(param1ResponseTagInfo);
      if (param1ResponseTagInfo == null)
        return; 
      this.tag_id = param1ResponseTagInfo.tag_id;
      this.tag_name = param1ResponseTagInfo.tag_name;
      this.is_followed = param1ResponseTagInfo.is_followed;
    }
    
    public ResponseTagInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ResponseTagInfo)interceptResult.objValue; 
      } 
      return new ResponseTagInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
