package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class VideoDesc extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_VIDEO_HEIGHT = "";
  
  public static final Integer DEFAULT_VIDEO_ID = Integer.valueOf(0);
  
  public static final String DEFAULT_VIDEO_MD5 = "";
  
  public static final String DEFAULT_VIDEO_URL = "";
  
  public static final String DEFAULT_VIDEO_WIDTH = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String video_height;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer video_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String video_md5;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String video_url;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String video_width;
  
  public VideoDesc(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.video_id;
      if (integer == null) {
        this.video_id = DEFAULT_VIDEO_ID;
      } else {
        this.video_id = integer;
      } 
      String str1 = paramBuilder.video_md5;
      if (str1 == null) {
        this.video_md5 = "";
      } else {
        this.video_md5 = str1;
      } 
      str1 = paramBuilder.video_url;
      if (str1 == null) {
        this.video_url = "";
      } else {
        this.video_url = str1;
      } 
      str1 = paramBuilder.video_width;
      if (str1 == null) {
        this.video_width = "";
      } else {
        this.video_width = str1;
      } 
      str = paramBuilder.video_height;
      if (str == null) {
        this.video_height = "";
      } else {
        this.video_height = str;
      } 
    } else {
      this.video_id = ((Builder)str).video_id;
      this.video_md5 = ((Builder)str).video_md5;
      this.video_url = ((Builder)str).video_url;
      this.video_width = ((Builder)str).video_width;
      this.video_height = ((Builder)str).video_height;
    } 
  }
  
  public VideoDesc(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-344268679, "Ltbclient/VideoDesc;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-344268679, "Ltbclient/VideoDesc;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<VideoDesc> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String video_height;
    
    public Integer video_id;
    
    public String video_md5;
    
    public String video_url;
    
    public String video_width;
    
    public Builder() {}
    
    public Builder(VideoDesc param1VideoDesc) {
      super(param1VideoDesc);
      if (param1VideoDesc == null)
        return; 
      this.video_id = param1VideoDesc.video_id;
      this.video_md5 = param1VideoDesc.video_md5;
      this.video_url = param1VideoDesc.video_url;
      this.video_width = param1VideoDesc.video_width;
      this.video_height = param1VideoDesc.video_height;
    }
    
    public VideoDesc build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (VideoDesc)interceptResult.objValue; 
      } 
      return new VideoDesc(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
