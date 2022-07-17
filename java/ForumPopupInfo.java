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

public final class ForumPopupInfo extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_FORUM_ID;
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final List<String> DEFAULT_FORUM_NAMES;
  
  public static final Integer DEFAULT_MEM_COUNT_STATIC;
  
  public static final Integer DEFAULT_THREAD_COUNT_STATIC;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer forum_id;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 4, type = Message.Datatype.STRING)
  public final List<String> forum_names;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer mem_count_static;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer thread_count_static;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1679181272, "Ltbclient/ForumPopupInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1679181272, "Ltbclient/ForumPopupInfo;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_FORUM_ID = integer;
    DEFAULT_MEM_COUNT_STATIC = integer;
    DEFAULT_THREAD_COUNT_STATIC = integer;
    DEFAULT_FORUM_NAMES = Collections.emptyList();
  }
  
  public ForumPopupInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Integer integer = paramBuilder.forum_id;
      if (integer == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = integer;
      } 
      integer = paramBuilder.mem_count_static;
      if (integer == null) {
        this.mem_count_static = DEFAULT_MEM_COUNT_STATIC;
      } else {
        this.mem_count_static = integer;
      } 
      integer = paramBuilder.thread_count_static;
      if (integer == null) {
        this.thread_count_static = DEFAULT_THREAD_COUNT_STATIC;
      } else {
        this.thread_count_static = integer;
      } 
      List<String> list = paramBuilder.forum_names;
      if (list == null) {
        this.forum_names = DEFAULT_FORUM_NAMES;
      } else {
        this.forum_names = Message.immutableCopyOf(list);
      } 
      str = paramBuilder.forum_name;
      if (str == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str;
      } 
    } else {
      this.forum_id = ((Builder)str).forum_id;
      this.mem_count_static = ((Builder)str).mem_count_static;
      this.thread_count_static = ((Builder)str).thread_count_static;
      this.forum_names = Message.immutableCopyOf(((Builder)str).forum_names);
      this.forum_name = ((Builder)str).forum_name;
    } 
  }
  
  public ForumPopupInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ForumPopupInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer forum_id;
    
    public String forum_name;
    
    public List<String> forum_names;
    
    public Integer mem_count_static;
    
    public Integer thread_count_static;
    
    public Builder() {}
    
    public Builder(ForumPopupInfo param1ForumPopupInfo) {
      super(param1ForumPopupInfo);
      if (param1ForumPopupInfo == null)
        return; 
      this.forum_id = param1ForumPopupInfo.forum_id;
      this.mem_count_static = param1ForumPopupInfo.mem_count_static;
      this.thread_count_static = param1ForumPopupInfo.thread_count_static;
      this.forum_names = Message.copyOf(param1ForumPopupInfo.forum_names);
      this.forum_name = param1ForumPopupInfo.forum_name;
    }
    
    public ForumPopupInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ForumPopupInfo)interceptResult.objValue; 
      } 
      return new ForumPopupInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
