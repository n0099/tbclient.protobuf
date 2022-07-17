package tbclient.FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Video extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_NUM = Integer.valueOf(0);
  
  public static final String DEFAULT_PIC = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer num;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String pic;
  
  public Video(Builder paramBuilder, boolean paramBoolean) {
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
  
  public Video(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1137711747, "Ltbclient/FrsPage/Video;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1137711747, "Ltbclient/FrsPage/Video;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<Video> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer num;
    
    public String pic;
    
    public Builder() {}
    
    public Builder(Video param1Video) {
      super(param1Video);
      if (param1Video == null)
        return; 
      this.pic = param1Video.pic;
      this.num = param1Video.num;
    }
    
    public Video build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (Video)interceptResult.objValue; 
      } 
      return new Video(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
