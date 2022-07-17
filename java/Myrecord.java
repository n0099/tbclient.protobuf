package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Myrecord extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_AGREE_NUM;
  
  public static final String DEFAULT_APPLY_DECLARATION = "";
  
  public static final Integer DEFAULT_APPLY_ID;
  
  public static final Integer DEFAULT_FORUM_LEVEL;
  
  public static final String DEFAULT_NAME_SHOW = "";
  
  public static final String DEFAULT_PORTRAIT = "";
  
  public static final Integer DEFAULT_POST_NUM;
  
  public static final Integer DEFAULT_RANK;
  
  public static final Integer DEFAULT_THREAD_NUM;
  
  public static final Long DEFAULT_TID;
  
  public static final Long DEFAULT_UID;
  
  public static final Integer DEFAULT_VOTE_NUM;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 8, type = Message.Datatype.INT32)
  public final Integer agree_num;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String apply_declaration;
  
  @ProtoField(tag = 1, type = Message.Datatype.UINT32)
  public final Integer apply_id;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer forum_level;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String name_show;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer post_num;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer rank;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer thread_num;
  
  @ProtoField(tag = 12, type = Message.Datatype.INT64)
  public final Long tid;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT64)
  public final Long uid;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer vote_num;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1968563508, "Ltbclient/Myrecord;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1968563508, "Ltbclient/Myrecord;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_APPLY_ID = integer;
    Long long_ = Long.valueOf(0L);
    DEFAULT_UID = long_;
    DEFAULT_RANK = integer;
    DEFAULT_FORUM_LEVEL = integer;
    DEFAULT_VOTE_NUM = integer;
    DEFAULT_AGREE_NUM = integer;
    DEFAULT_THREAD_NUM = integer;
    DEFAULT_POST_NUM = integer;
    DEFAULT_TID = long_;
  }
  
  public Myrecord(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Long long_;
    if (paramBoolean == true) {
      Integer integer3 = paramBuilder.apply_id;
      if (integer3 == null) {
        this.apply_id = DEFAULT_APPLY_ID;
      } else {
        this.apply_id = integer3;
      } 
      Long long_1 = paramBuilder.uid;
      if (long_1 == null) {
        this.uid = DEFAULT_UID;
      } else {
        this.uid = long_1;
      } 
      Integer integer2 = paramBuilder.rank;
      if (integer2 == null) {
        this.rank = DEFAULT_RANK;
      } else {
        this.rank = integer2;
      } 
      String str2 = paramBuilder.portrait;
      if (str2 == null) {
        this.portrait = "";
      } else {
        this.portrait = str2;
      } 
      str2 = paramBuilder.name_show;
      if (str2 == null) {
        this.name_show = "";
      } else {
        this.name_show = str2;
      } 
      Integer integer1 = paramBuilder.forum_level;
      if (integer1 == null) {
        this.forum_level = DEFAULT_FORUM_LEVEL;
      } else {
        this.forum_level = integer1;
      } 
      integer1 = paramBuilder.vote_num;
      if (integer1 == null) {
        this.vote_num = DEFAULT_VOTE_NUM;
      } else {
        this.vote_num = integer1;
      } 
      integer1 = paramBuilder.agree_num;
      if (integer1 == null) {
        this.agree_num = DEFAULT_AGREE_NUM;
      } else {
        this.agree_num = integer1;
      } 
      integer1 = paramBuilder.thread_num;
      if (integer1 == null) {
        this.thread_num = DEFAULT_THREAD_NUM;
      } else {
        this.thread_num = integer1;
      } 
      integer1 = paramBuilder.post_num;
      if (integer1 == null) {
        this.post_num = DEFAULT_POST_NUM;
      } else {
        this.post_num = integer1;
      } 
      String str1 = paramBuilder.apply_declaration;
      if (str1 == null) {
        this.apply_declaration = "";
      } else {
        this.apply_declaration = str1;
      } 
      long_ = paramBuilder.tid;
      if (long_ == null) {
        this.tid = DEFAULT_TID;
      } else {
        this.tid = long_;
      } 
    } else {
      this.apply_id = ((Builder)long_).apply_id;
      this.uid = ((Builder)long_).uid;
      this.rank = ((Builder)long_).rank;
      this.portrait = ((Builder)long_).portrait;
      this.name_show = ((Builder)long_).name_show;
      this.forum_level = ((Builder)long_).forum_level;
      this.vote_num = ((Builder)long_).vote_num;
      this.agree_num = ((Builder)long_).agree_num;
      this.thread_num = ((Builder)long_).thread_num;
      this.post_num = ((Builder)long_).post_num;
      this.apply_declaration = ((Builder)long_).apply_declaration;
      this.tid = ((Builder)long_).tid;
    } 
  }
  
  public Myrecord(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<Myrecord> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer agree_num;
    
    public String apply_declaration;
    
    public Integer apply_id;
    
    public Integer forum_level;
    
    public String name_show;
    
    public String portrait;
    
    public Integer post_num;
    
    public Integer rank;
    
    public Integer thread_num;
    
    public Long tid;
    
    public Long uid;
    
    public Integer vote_num;
    
    public Builder() {}
    
    public Builder(Myrecord param1Myrecord) {
      super(param1Myrecord);
      if (param1Myrecord == null)
        return; 
      this.apply_id = param1Myrecord.apply_id;
      this.uid = param1Myrecord.uid;
      this.rank = param1Myrecord.rank;
      this.portrait = param1Myrecord.portrait;
      this.name_show = param1Myrecord.name_show;
      this.forum_level = param1Myrecord.forum_level;
      this.vote_num = param1Myrecord.vote_num;
      this.agree_num = param1Myrecord.agree_num;
      this.thread_num = param1Myrecord.thread_num;
      this.post_num = param1Myrecord.post_num;
      this.apply_declaration = param1Myrecord.apply_declaration;
      this.tid = param1Myrecord.tid;
    }
    
    public Myrecord build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (Myrecord)interceptResult.objValue; 
      } 
      return new Myrecord(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
