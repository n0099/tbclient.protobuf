package tbclient.GetMemberTaskList;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ImgInfo extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_ID;
  
  public static final String DEFAULT_IMG_URL = "";
  
  public static final String DEFAULT_JUMP_URL = "";
  
  public static final Integer DEFAULT_TYPE;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String img_url;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String jump_url;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer type;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(625252592, "Ltbclient/GetMemberTaskList/ImgInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(625252592, "Ltbclient/GetMemberTaskList/ImgInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_ID = integer;
    DEFAULT_TYPE = integer;
  }
  
  public ImgInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.id;
      if (integer == null) {
        this.id = DEFAULT_ID;
      } else {
        this.id = integer;
      } 
      integer = paramBuilder.type;
      if (integer == null) {
        this.type = DEFAULT_TYPE;
      } else {
        this.type = integer;
      } 
      String str1 = paramBuilder.img_url;
      if (str1 == null) {
        this.img_url = "";
      } else {
        this.img_url = str1;
      } 
      str = paramBuilder.jump_url;
      if (str == null) {
        this.jump_url = "";
      } else {
        this.jump_url = str;
      } 
    } else {
      this.id = ((Builder)str).id;
      this.type = ((Builder)str).type;
      this.img_url = ((Builder)str).img_url;
      this.jump_url = ((Builder)str).jump_url;
    } 
  }
  
  public ImgInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ImgInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer id;
    
    public String img_url;
    
    public String jump_url;
    
    public Integer type;
    
    public Builder() {}
    
    public Builder(ImgInfo param1ImgInfo) {
      super(param1ImgInfo);
      if (param1ImgInfo == null)
        return; 
      this.id = param1ImgInfo.id;
      this.type = param1ImgInfo.type;
      this.img_url = param1ImgInfo.img_url;
      this.jump_url = param1ImgInfo.jump_url;
    }
    
    public ImgInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ImgInfo)interceptResult.objValue; 
      } 
      return new ImgInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
