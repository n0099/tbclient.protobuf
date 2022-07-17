package tbclient.ExcFrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ExcellentTagInfo extends Message {
  public static Interceptable $ic;
  
  public static final Long DEFAULT_TAG_CODE = Long.valueOf(0L);
  
  public static final String DEFAULT_TAG_NAME = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long tag_code;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String tag_name;
  
  public ExcellentTagInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.tag_code;
      if (long_ == null) {
        this.tag_code = DEFAULT_TAG_CODE;
      } else {
        this.tag_code = long_;
      } 
      str = paramBuilder.tag_name;
      if (str == null) {
        this.tag_name = "";
      } else {
        this.tag_name = str;
      } 
    } else {
      this.tag_code = ((Builder)str).tag_code;
      this.tag_name = ((Builder)str).tag_name;
    } 
  }
  
  public ExcellentTagInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1870860362, "Ltbclient/ExcFrsPage/ExcellentTagInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1870860362, "Ltbclient/ExcFrsPage/ExcellentTagInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<ExcellentTagInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Long tag_code;
    
    public String tag_name;
    
    public Builder() {}
    
    public Builder(ExcellentTagInfo param1ExcellentTagInfo) {
      super(param1ExcellentTagInfo);
      if (param1ExcellentTagInfo == null)
        return; 
      this.tag_code = param1ExcellentTagInfo.tag_code;
      this.tag_name = param1ExcellentTagInfo.tag_name;
    }
    
    public ExcellentTagInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ExcellentTagInfo)interceptResult.objValue; 
      } 
      return new ExcellentTagInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
