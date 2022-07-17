package tbclient;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ForumMember extends Message {
  public static Interceptable $ic;
  
  public static final Integer DEFAULT_CUR_SCORE;
  
  public static final Integer DEFAULT_IS_LIKE;
  
  public static final Integer DEFAULT_LEVELUP_SCORE;
  
  public static final String DEFAULT_LEVEL_NAME = "";
  
  public static final Integer DEFAULT_USER_LEVEL;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 4, type = Message.Datatype.INT32)
  public final Integer cur_score;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT32)
  public final Integer is_like;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String level_name;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer levelup_score;
  
  @ProtoField(tag = 2, type = Message.Datatype.INT32)
  public final Integer user_level;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1496119702, "Ltbclient/ForumMember;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1496119702, "Ltbclient/ForumMember;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_IS_LIKE = integer;
    DEFAULT_USER_LEVEL = integer;
    DEFAULT_CUR_SCORE = integer;
    DEFAULT_LEVELUP_SCORE = integer;
  }
  
  public ForumMember(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      Integer integer2 = paramBuilder.is_like;
      if (integer2 == null) {
        this.is_like = DEFAULT_IS_LIKE;
      } else {
        this.is_like = integer2;
      } 
      integer2 = paramBuilder.user_level;
      if (integer2 == null) {
        this.user_level = DEFAULT_USER_LEVEL;
      } else {
        this.user_level = integer2;
      } 
      String str = paramBuilder.level_name;
      if (str == null) {
        this.level_name = "";
      } else {
        this.level_name = str;
      } 
      Integer integer1 = paramBuilder.cur_score;
      if (integer1 == null) {
        this.cur_score = DEFAULT_CUR_SCORE;
      } else {
        this.cur_score = integer1;
      } 
      integer = paramBuilder.levelup_score;
      if (integer == null) {
        this.levelup_score = DEFAULT_LEVELUP_SCORE;
      } else {
        this.levelup_score = integer;
      } 
    } else {
      this.is_like = ((Builder)integer).is_like;
      this.user_level = ((Builder)integer).user_level;
      this.level_name = ((Builder)integer).level_name;
      this.cur_score = ((Builder)integer).cur_score;
      this.levelup_score = ((Builder)integer).levelup_score;
    } 
  }
  
  public ForumMember(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ForumMember> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Integer cur_score;
    
    public Integer is_like;
    
    public String level_name;
    
    public Integer levelup_score;
    
    public Integer user_level;
    
    public Builder() {}
    
    public Builder(ForumMember param1ForumMember) {
      super(param1ForumMember);
      if (param1ForumMember == null)
        return; 
      this.is_like = param1ForumMember.is_like;
      this.user_level = param1ForumMember.user_level;
      this.level_name = param1ForumMember.level_name;
      this.cur_score = param1ForumMember.cur_score;
      this.levelup_score = param1ForumMember.levelup_score;
    }
    
    public ForumMember build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ForumMember)interceptResult.objValue; 
      } 
      return new ForumMember(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
