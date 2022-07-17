package tbclient.FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.PbContent;

public final class NebulaHotThread extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_COMMENT_NUMBER;
  
  public static final List<PbContent> DEFAULT_CONTENT;
  
  public static final String DEFAULT_GROUP_NAME = "";
  
  public static final Integer DEFAULT_RANK;
  
  public static final String DEFAULT_THREAD_ID = "";
  
  public static final String DEFAULT_THREAD_THUMBNAIL = "";
  
  public static final Integer DEFAULT_THREAD_THUMBNAIL_TYPE;
  
  public static final String DEFAULT_URL = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer comment_number;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 8)
  public final List<PbContent> content;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String group_name;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer rank;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String thread_id;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String thread_thumbnail;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer thread_thumbnail_type;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String url;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(36338342, "Ltbclient/FrsPage/NebulaHotThread;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(36338342, "Ltbclient/FrsPage/NebulaHotThread;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_COMMENT_NUMBER = integer;
    DEFAULT_RANK = integer;
    DEFAULT_THREAD_THUMBNAIL_TYPE = integer;
    DEFAULT_CONTENT = Collections.emptyList();
  }
  
  public NebulaHotThread(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    List<PbContent> list;
    if (paramBoolean == true) {
      String str3 = paramBuilder.thread_id;
      if (str3 == null) {
        this.thread_id = "";
      } else {
        this.thread_id = str3;
      } 
      str3 = paramBuilder.group_name;
      if (str3 == null) {
        this.group_name = "";
      } else {
        this.group_name = str3;
      } 
      Integer integer2 = paramBuilder.comment_number;
      if (integer2 == null) {
        this.comment_number = DEFAULT_COMMENT_NUMBER;
      } else {
        this.comment_number = integer2;
      } 
      integer2 = paramBuilder.rank;
      if (integer2 == null) {
        this.rank = DEFAULT_RANK;
      } else {
        this.rank = integer2;
      } 
      String str2 = paramBuilder.url;
      if (str2 == null) {
        this.url = "";
      } else {
        this.url = str2;
      } 
      Integer integer1 = paramBuilder.thread_thumbnail_type;
      if (integer1 == null) {
        this.thread_thumbnail_type = DEFAULT_THREAD_THUMBNAIL_TYPE;
      } else {
        this.thread_thumbnail_type = integer1;
      } 
      String str1 = paramBuilder.thread_thumbnail;
      if (str1 == null) {
        this.thread_thumbnail = "";
      } else {
        this.thread_thumbnail = str1;
      } 
      list = paramBuilder.content;
      if (list == null) {
        this.content = DEFAULT_CONTENT;
      } else {
        this.content = Message.immutableCopyOf(list);
      } 
    } else {
      this.thread_id = ((Builder)list).thread_id;
      this.group_name = ((Builder)list).group_name;
      this.comment_number = ((Builder)list).comment_number;
      this.rank = ((Builder)list).rank;
      this.url = ((Builder)list).url;
      this.thread_thumbnail_type = ((Builder)list).thread_thumbnail_type;
      this.thread_thumbnail = ((Builder)list).thread_thumbnail;
      this.content = Message.immutableCopyOf(((Builder)list).content);
    } 
  }
  
  public NebulaHotThread(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<NebulaHotThread> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer comment_number;
    
    public List<PbContent> content;
    
    public String group_name;
    
    public Integer rank;
    
    public String thread_id;
    
    public String thread_thumbnail;
    
    public Integer thread_thumbnail_type;
    
    public String url;
    
    public Builder() {}
    
    public Builder(NebulaHotThread param1NebulaHotThread) {
      super(param1NebulaHotThread);
      if (param1NebulaHotThread == null)
        return; 
      this.thread_id = param1NebulaHotThread.thread_id;
      this.group_name = param1NebulaHotThread.group_name;
      this.comment_number = param1NebulaHotThread.comment_number;
      this.rank = param1NebulaHotThread.rank;
      this.url = param1NebulaHotThread.url;
      this.thread_thumbnail_type = param1NebulaHotThread.thread_thumbnail_type;
      this.thread_thumbnail = param1NebulaHotThread.thread_thumbnail;
      this.content = Message.copyOf(param1NebulaHotThread.content);
    }
    
    public NebulaHotThread build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (NebulaHotThread)interceptResult.objValue; 
      } 
      return new NebulaHotThread(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
