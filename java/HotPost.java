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

public final class HotPost extends Message {
  public static Interceptable $ic;
  
  public static final List<PbContent> DEFAULT_CONTENT;
  
  public static final Integer DEFAULT_CREATE_TIME;
  
  public static final Integer DEFAULT_FLOOR;
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final Long DEFAULT_POST_ID;
  
  public static final Integer DEFAULT_POST_NUM;
  
  public static final Long DEFAULT_THREAD_ID;
  
  public static final Long DEFAULT_USER_ID;
  
  public static final String DEFAULT_USER_NAME = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 7)
  public final List<PbContent> content;
  
  @ProtoField(tag = 8, type = Message.Datatype.UINT32)
  public final Integer create_time;
  
  @ProtoField(tag = 9, type = Message.Datatype.UINT32)
  public final Integer floor;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long post_id;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer post_num;
  
  @ProtoField(tag = 5)
  public final PbPostZan post_zan;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT64)
  public final Long thread_id;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT64)
  public final Long user_id;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String user_name;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-30396872, "Ltbclient/HotPost;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-30396872, "Ltbclient/HotPost;");
          return;
        } 
      } 
    } 
    Long long_ = Long.valueOf(0L);
    DEFAULT_THREAD_ID = long_;
    DEFAULT_POST_ID = long_;
    DEFAULT_USER_ID = long_;
    Integer integer = Integer.valueOf(0);
    DEFAULT_POST_NUM = integer;
    DEFAULT_CONTENT = Collections.emptyList();
    DEFAULT_CREATE_TIME = integer;
    DEFAULT_FLOOR = integer;
  }
  
  public HotPost(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_2 = paramBuilder.thread_id;
      if (long_2 == null) {
        this.thread_id = DEFAULT_THREAD_ID;
      } else {
        this.thread_id = long_2;
      } 
      long_2 = paramBuilder.post_id;
      if (long_2 == null) {
        this.post_id = DEFAULT_POST_ID;
      } else {
        this.post_id = long_2;
      } 
      String str1 = paramBuilder.user_name;
      if (str1 == null) {
        this.user_name = "";
      } else {
        this.user_name = str1;
      } 
      Long long_1 = paramBuilder.user_id;
      if (long_1 == null) {
        this.user_id = DEFAULT_USER_ID;
      } else {
        this.user_id = long_1;
      } 
      this.post_zan = paramBuilder.post_zan;
      Integer integer2 = paramBuilder.post_num;
      if (integer2 == null) {
        this.post_num = DEFAULT_POST_NUM;
      } else {
        this.post_num = integer2;
      } 
      List<PbContent> list = paramBuilder.content;
      if (list == null) {
        this.content = DEFAULT_CONTENT;
      } else {
        this.content = Message.immutableCopyOf(list);
      } 
      Integer integer1 = paramBuilder.create_time;
      if (integer1 == null) {
        this.create_time = DEFAULT_CREATE_TIME;
      } else {
        this.create_time = integer1;
      } 
      integer1 = paramBuilder.floor;
      if (integer1 == null) {
        this.floor = DEFAULT_FLOOR;
      } else {
        this.floor = integer1;
      } 
      str = paramBuilder.portrait;
      if (str == null) {
        this.portrait = "";
      } else {
        this.portrait = str;
      } 
    } else {
      this.thread_id = ((Builder)str).thread_id;
      this.post_id = ((Builder)str).post_id;
      this.user_name = ((Builder)str).user_name;
      this.user_id = ((Builder)str).user_id;
      this.post_zan = ((Builder)str).post_zan;
      this.post_num = ((Builder)str).post_num;
      this.content = Message.immutableCopyOf(((Builder)str).content);
      this.create_time = ((Builder)str).create_time;
      this.floor = ((Builder)str).floor;
      this.portrait = ((Builder)str).portrait;
    } 
  }
  
  public HotPost(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<HotPost> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public List<PbContent> content;
    
    public Integer create_time;
    
    public Integer floor;
    
    public String portrait;
    
    public Long post_id;
    
    public Integer post_num;
    
    public PbPostZan post_zan;
    
    public Long thread_id;
    
    public Long user_id;
    
    public String user_name;
    
    public Builder() {}
    
    public Builder(HotPost param1HotPost) {
      super(param1HotPost);
      if (param1HotPost == null)
        return; 
      this.thread_id = param1HotPost.thread_id;
      this.post_id = param1HotPost.post_id;
      this.user_name = param1HotPost.user_name;
      this.user_id = param1HotPost.user_id;
      this.post_zan = param1HotPost.post_zan;
      this.post_num = param1HotPost.post_num;
      this.content = Message.copyOf(param1HotPost.content);
      this.create_time = param1HotPost.create_time;
      this.floor = param1HotPost.floor;
      this.portrait = param1HotPost.portrait;
    }
    
    public HotPost build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (HotPost)interceptResult.objValue; 
      } 
      return new HotPost(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
