package tbclient.FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class RecmForumInfo extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_AVATAR = "";
  
  public static final Long DEFAULT_FORUM_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final Integer DEFAULT_MEMBER_COUNT;
  
  public static final Integer DEFAULT_POST_NUM;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String avatar;
  
  @ProtoField(tag = 2, type = Message.Datatype.UINT64)
  public final Long forum_id;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 3, type = Message.Datatype.UINT32)
  public final Integer member_count;
  
  @ProtoField(tag = 4, type = Message.Datatype.UINT32)
  public final Integer post_num;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_MEMBER_COUNT = integer;
    DEFAULT_POST_NUM = integer;
  }
  
  public RecmForumInfo(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.forum_name;
      if (str1 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str1;
      } 
      Long long_ = paramBuilder.forum_id;
      if (long_ == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_;
      } 
      Integer integer = paramBuilder.member_count;
      if (integer == null) {
        this.member_count = DEFAULT_MEMBER_COUNT;
      } else {
        this.member_count = integer;
      } 
      integer = paramBuilder.post_num;
      if (integer == null) {
        this.post_num = DEFAULT_POST_NUM;
      } else {
        this.post_num = integer;
      } 
      str = paramBuilder.avatar;
      if (str == null) {
        this.avatar = "";
      } else {
        this.avatar = str;
      } 
    } else {
      this.forum_name = ((Builder)str).forum_name;
      this.forum_id = ((Builder)str).forum_id;
      this.member_count = ((Builder)str).member_count;
      this.post_num = ((Builder)str).post_num;
      this.avatar = ((Builder)str).avatar;
    } 
  }
  
  public RecmForumInfo(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-806972724, "Ltbclient/FrsPage/RecmForumInfo;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-806972724, "Ltbclient/FrsPage/RecmForumInfo;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<RecmForumInfo> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String avatar;
    
    public Long forum_id;
    
    public String forum_name;
    
    public Integer member_count;
    
    public Integer post_num;
    
    public Builder() {}
    
    public Builder(RecmForumInfo param1RecmForumInfo) {
      super(param1RecmForumInfo);
      if (param1RecmForumInfo == null)
        return; 
      this.forum_name = param1RecmForumInfo.forum_name;
      this.forum_id = param1RecmForumInfo.forum_id;
      this.member_count = param1RecmForumInfo.member_count;
      this.post_num = param1RecmForumInfo.post_num;
      this.avatar = param1RecmForumInfo.avatar;
    }
    
    public RecmForumInfo build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (RecmForumInfo)interceptResult.objValue; 
      } 
      return new RecmForumInfo(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
