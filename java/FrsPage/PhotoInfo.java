package tbclient.FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PhotoInfo extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_NUM = Integer.valueOf(0);
  
  public static final String DEFAULT_PIC = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer num;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String pic;
  
  public PhotoInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.pic;
      if (str == null) {
        this.pic = "";
      } else {
        this.pic = str;
      } 
      integer = paramBuilder.num;
      if (integer == null) {
        this.num = DEFAULT_NUM;
      } else {
        this.num = integer;
      } 
    } else {
      this.pic = ((Builder)integer).pic;
      this.num = ((Builder)integer).num;
    } 
  }
  
  public PhotoInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1802549218, "Ltbclient/FrsPage/PhotoInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1802549218, "Ltbclient/FrsPage/PhotoInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<PhotoInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer num;
    
    public String pic;
    
    public Builder() {}
    
    public Builder(PhotoInfo param1PhotoInfo) {
      super(param1PhotoInfo);
      if (param1PhotoInfo == null)
        return; 
      this.pic = param1PhotoInfo.pic;
      this.num = param1PhotoInfo.num;
    }
    
    public PhotoInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (PhotoInfo)interceptResult.objValue; 
      } 
      return new PhotoInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
