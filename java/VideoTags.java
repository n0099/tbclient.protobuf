package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

public final class VideoTags extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_FIRST = "";
  
  public static final String DEFAULT_SECOND = "";
  
  public static final List<String> DEFAULT_TAGS = Collections.emptyList();
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String first;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String second;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 3, type = Message.Datatype.STRING)
  public final List<String> tags;
  
  public VideoTags(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<String> list;
    if (paramBoolean == true) {
      String str = paramBuilder.first;
      if (str == null) {
        this.first = "";
      } else {
        this.first = str;
      } 
      str = paramBuilder.second;
      if (str == null) {
        this.second = "";
      } else {
        this.second = str;
      } 
      list = paramBuilder.tags;
      if (list == null) {
        this.tags = DEFAULT_TAGS;
      } else {
        this.tags = Message.immutableCopyOf(list);
      } 
    } else {
      this.first = ((Builder)list).first;
      this.second = ((Builder)list).second;
      this.tags = Message.immutableCopyOf(((Builder)list).tags);
    } 
  }
  
  public VideoTags(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-329622543, "Ltbclient/VideoTags;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-329622543, "Ltbclient/VideoTags;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<VideoTags> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String first;
    
    public String second;
    
    public List<String> tags;
    
    public Builder() {}
    
    public Builder(VideoTags param1VideoTags) {
      super(param1VideoTags);
      if (param1VideoTags == null)
        return; 
      this.first = param1VideoTags.first;
      this.second = param1VideoTags.second;
      this.tags = Message.copyOf(param1VideoTags.tags);
    }
    
    public VideoTags build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (VideoTags)interceptResult.objValue; 
      } 
      return new VideoTags(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
