package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ElectionList extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_AGREE_NUM;
  
  public static final String DEFAULT_APPLY_DECLARATION = "";
  
  public static final Integer DEFAULT_APPLY_ID;
  
  public static final Integer DEFAULT_FORUM_LEVEL;
  
  public static final Integer DEFAULT_IS_CHEAT;
  
  public static final Integer DEFAULT_IS_PASS_AUDIT;
  
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
  
  @ProtoField(tag = 13, type = Message.Datatype.INT32)
  public final Integer is_cheat;
  
  @ProtoField(tag = 14, type = Message.Datatype.INT32)
  public final Integer is_pass_audit;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String name_show;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String portrait;
  
  @ProtoField(tag = 10, type = Message.Datatype.INT32)
  public final Integer post_num;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer rank;
  
  @ProtoField(tag = 9, type = Message.Datatype.INT32)
  public final Integer thread_num;
  
  @ProtoField(tag = 12, type = Message.Datatype.INT64)
  public final Long tid;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT64)
  public final Long uid;
  
  @ProtoField(tag = 7, type = Message.Datatype.INT32)
  public final Integer vote_num;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-315770342, "Ltbclient/ElectionList;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-315770342, "Ltbclient/ElectionList;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_APPLY_ID = integer;
    DEFAULT_RANK = integer;
    Long long_ = Long.valueOf(0L);
    DEFAULT_UID = long_;
    DEFAULT_FORUM_LEVEL = integer;
    DEFAULT_VOTE_NUM = integer;
    DEFAULT_AGREE_NUM = integer;
    DEFAULT_THREAD_NUM = integer;
    DEFAULT_POST_NUM = integer;
    DEFAULT_TID = long_;
    DEFAULT_IS_CHEAT = integer;
    DEFAULT_IS_PASS_AUDIT = integer;
  }
  
  public ElectionList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer3 = paramBuilder.apply_id;
      if (integer3 == null) {
        this.apply_id = DEFAULT_APPLY_ID;
      } else {
        this.apply_id = integer3;
      } 
      integer3 = paramBuilder.rank;
      if (integer3 == null) {
        this.rank = DEFAULT_RANK;
      } else {
        this.rank = integer3;
      } 
      Long long_2 = paramBuilder.uid;
      if (long_2 == null) {
        this.uid = DEFAULT_UID;
      } else {
        this.uid = long_2;
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
      Integer integer2 = paramBuilder.forum_level;
      if (integer2 == null) {
        this.forum_level = DEFAULT_FORUM_LEVEL;
      } else {
        this.forum_level = integer2;
      } 
      integer2 = paramBuilder.vote_num;
      if (integer2 == null) {
        this.vote_num = DEFAULT_VOTE_NUM;
      } else {
        this.vote_num = integer2;
      } 
      integer2 = paramBuilder.agree_num;
      if (integer2 == null) {
        this.agree_num = DEFAULT_AGREE_NUM;
      } else {
        this.agree_num = integer2;
      } 
      integer2 = paramBuilder.thread_num;
      if (integer2 == null) {
        this.thread_num = DEFAULT_THREAD_NUM;
      } else {
        this.thread_num = integer2;
      } 
      integer2 = paramBuilder.post_num;
      if (integer2 == null) {
        this.post_num = DEFAULT_POST_NUM;
      } else {
        this.post_num = integer2;
      } 
      String str1 = paramBuilder.apply_declaration;
      if (str1 == null) {
        this.apply_declaration = "";
      } else {
        this.apply_declaration = str1;
      } 
      Long long_1 = paramBuilder.tid;
      if (long_1 == null) {
        this.tid = DEFAULT_TID;
      } else {
        this.tid = long_1;
      } 
      Integer integer1 = paramBuilder.is_cheat;
      if (integer1 == null) {
        this.is_cheat = DEFAULT_IS_CHEAT;
      } else {
        this.is_cheat = integer1;
      } 
      integer = paramBuilder.is_pass_audit;
      if (integer == null) {
        this.is_pass_audit = DEFAULT_IS_PASS_AUDIT;
      } else {
        this.is_pass_audit = integer;
      } 
    } else {
      this.apply_id = ((Builder)integer).apply_id;
      this.rank = ((Builder)integer).rank;
      this.uid = ((Builder)integer).uid;
      this.portrait = ((Builder)integer).portrait;
      this.name_show = ((Builder)integer).name_show;
      this.forum_level = ((Builder)integer).forum_level;
      this.vote_num = ((Builder)integer).vote_num;
      this.agree_num = ((Builder)integer).agree_num;
      this.thread_num = ((Builder)integer).thread_num;
      this.post_num = ((Builder)integer).post_num;
      this.apply_declaration = ((Builder)integer).apply_declaration;
      this.tid = ((Builder)integer).tid;
      this.is_cheat = ((Builder)integer).is_cheat;
      this.is_pass_audit = ((Builder)integer).is_pass_audit;
    } 
  }
  
  public ElectionList(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ElectionList> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer agree_num;
    
    public String apply_declaration;
    
    public Integer apply_id;
    
    public Integer forum_level;
    
    public Integer is_cheat;
    
    public Integer is_pass_audit;
    
    public String name_show;
    
    public String portrait;
    
    public Integer post_num;
    
    public Integer rank;
    
    public Integer thread_num;
    
    public Long tid;
    
    public Long uid;
    
    public Integer vote_num;
    
    public Builder() {}
    
    public Builder(ElectionList param1ElectionList) {
      super(param1ElectionList);
      if (param1ElectionList == null)
        return; 
      this.apply_id = param1ElectionList.apply_id;
      this.rank = param1ElectionList.rank;
      this.uid = param1ElectionList.uid;
      this.portrait = param1ElectionList.portrait;
      this.name_show = param1ElectionList.name_show;
      this.forum_level = param1ElectionList.forum_level;
      this.vote_num = param1ElectionList.vote_num;
      this.agree_num = param1ElectionList.agree_num;
      this.thread_num = param1ElectionList.thread_num;
      this.post_num = param1ElectionList.post_num;
      this.apply_declaration = param1ElectionList.apply_declaration;
      this.tid = param1ElectionList.tid;
      this.is_cheat = param1ElectionList.is_cheat;
      this.is_pass_audit = param1ElectionList.is_pass_audit;
    }
    
    public ElectionList build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ElectionList)interceptResult.objValue; 
      } 
      return new ElectionList(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
