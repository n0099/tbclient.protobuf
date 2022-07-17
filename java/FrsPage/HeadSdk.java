package tbclient.FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class HeadSdk extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_HEAD_PIC = "";
  
  public static final String DEFAULT_HEAD_TEXT = "";
  
  public static final Integer DEFAULT_HEAD_TYPE = Integer.valueOf(0);
  
  public static final String DEFAULT_SDK_NAME = "";
  
  public static final String DEFAULT_SDK_PARAMS = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String head_pic;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String head_text;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer head_type;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String sdk_name;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String sdk_params;
  
  public HeadSdk(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.head_pic;
      if (str == null) {
        this.head_pic = "";
      } else {
        this.head_pic = str;
      } 
      str = paramBuilder.head_text;
      if (str == null) {
        this.head_text = "";
      } else {
        this.head_text = str;
      } 
      str = paramBuilder.sdk_name;
      if (str == null) {
        this.sdk_name = "";
      } else {
        this.sdk_name = str;
      } 
      str = paramBuilder.sdk_params;
      if (str == null) {
        this.sdk_params = "";
      } else {
        this.sdk_params = str;
      } 
      integer = paramBuilder.head_type;
      if (integer == null) {
        this.head_type = DEFAULT_HEAD_TYPE;
      } else {
        this.head_type = integer;
      } 
    } else {
      this.head_pic = ((Builder)integer).head_pic;
      this.head_text = ((Builder)integer).head_text;
      this.sdk_name = ((Builder)integer).sdk_name;
      this.sdk_params = ((Builder)integer).sdk_params;
      this.head_type = ((Builder)integer).head_type;
    } 
  }
  
  public HeadSdk(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(152137700, "Ltbclient/FrsPage/HeadSdk;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(152137700, "Ltbclient/FrsPage/HeadSdk;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<HeadSdk> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String head_pic;
    
    public String head_text;
    
    public Integer head_type;
    
    public String sdk_name;
    
    public String sdk_params;
    
    public Builder() {}
    
    public Builder(HeadSdk param1HeadSdk) {
      super(param1HeadSdk);
      if (param1HeadSdk == null)
        return; 
      this.head_pic = param1HeadSdk.head_pic;
      this.head_text = param1HeadSdk.head_text;
      this.sdk_name = param1HeadSdk.sdk_name;
      this.sdk_params = param1HeadSdk.sdk_params;
      this.head_type = param1HeadSdk.head_type;
    }
    
    public HeadSdk build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (HeadSdk)interceptResult.objValue; 
      } 
      return new HeadSdk(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
