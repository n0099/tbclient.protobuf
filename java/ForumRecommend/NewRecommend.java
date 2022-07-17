package tbclient.ForumRecommend;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class NewRecommend extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_AVATAR = "";
  
  public static final Long DEFAULT_FORUM_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_FORUM_NAME = "";
  
  public static final Integer DEFAULT_IS_BRAND_FORUM;
  
  public static final Integer DEFAULT_MEMBER_COUNT;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String avatar;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long forum_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String forum_name;
  
  @ProtoField(tag = 5, type = Message.Datatype.UINT32)
  public final Integer is_brand_forum;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer member_count;
  
  static {
    Integer integer = Integer.valueOf(0);
    DEFAULT_MEMBER_COUNT = integer;
    DEFAULT_IS_BRAND_FORUM = integer;
  }
  
  public NewRecommend(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.forum_id;
      if (long_ == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_;
      } 
      String str2 = paramBuilder.forum_name;
      if (str2 == null) {
        this.forum_name = "";
      } else {
        this.forum_name = str2;
      } 
      Integer integer1 = paramBuilder.member_count;
      if (integer1 == null) {
        this.member_count = DEFAULT_MEMBER_COUNT;
      } else {
        this.member_count = integer1;
      } 
      String str1 = paramBuilder.avatar;
      if (str1 == null) {
        this.avatar = "";
      } else {
        this.avatar = str1;
      } 
      integer = paramBuilder.is_brand_forum;
      if (integer == null) {
        this.is_brand_forum = DEFAULT_IS_BRAND_FORUM;
      } else {
        this.is_brand_forum = integer;
      } 
    } else {
      this.forum_id = ((Builder)integer).forum_id;
      this.forum_name = ((Builder)integer).forum_name;
      this.member_count = ((Builder)integer).member_count;
      this.avatar = ((Builder)integer).avatar;
      this.is_brand_forum = ((Builder)integer).is_brand_forum;
    } 
  }
  
  public NewRecommend(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1862968299, "Ltbclient/ForumRecommend/NewRecommend;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1862968299, "Ltbclient/ForumRecommend/NewRecommend;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<NewRecommend> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String avatar;
    
    public Long forum_id;
    
    public String forum_name;
    
    public Integer is_brand_forum;
    
    public Integer member_count;
    
    public Builder() {}
    
    public Builder(NewRecommend param1NewRecommend) {
      super(param1NewRecommend);
      if (param1NewRecommend == null)
        return; 
      this.forum_id = param1NewRecommend.forum_id;
      this.forum_name = param1NewRecommend.forum_name;
      this.member_count = param1NewRecommend.member_count;
      this.avatar = param1NewRecommend.avatar;
      this.is_brand_forum = param1NewRecommend.is_brand_forum;
    }
    
    public NewRecommend build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (NewRecommend)interceptResult.objValue; 
      } 
      return new NewRecommend(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
