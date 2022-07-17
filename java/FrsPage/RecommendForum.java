package tbclient.FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class RecommendForum extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_AVATAR = "";
  
  public static final String DEFAULT_LINK = "";
  
  public static final Integer DEFAULT_MEMBER_NUM;
  
  public static final String DEFAULT_NAME = "";
  
  public static final String DEFAULT_ST_PARAM = "";
  
  public static final Integer DEFAULT_THREAD_NUM;
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String avatar;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String link;
  
  @ProtoField(tag = 5, type = Message.Datatype.INT32)
  public final Integer member_num;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String name;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String st_param;
  
  @ProtoField(tag = 6, type = Message.Datatype.INT32)
  public final Integer thread_num;
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(-1026648301, "Ltbclient/FrsPage/RecommendForum;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(-1026648301, "Ltbclient/FrsPage/RecommendForum;");
          return;
        } 
      } 
    } 
    Integer integer = Integer.valueOf(0);
    DEFAULT_MEMBER_NUM = integer;
    DEFAULT_THREAD_NUM = integer;
  }
  
  public RecommendForum(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      String str = paramBuilder.name;
      if (str == null) {
        this.name = "";
      } else {
        this.name = str;
      } 
      str = paramBuilder.avatar;
      if (str == null) {
        this.avatar = "";
      } else {
        this.avatar = str;
      } 
      str = paramBuilder.link;
      if (str == null) {
        this.link = "";
      } else {
        this.link = str;
      } 
      str = paramBuilder.st_param;
      if (str == null) {
        this.st_param = "";
      } else {
        this.st_param = str;
      } 
      Integer integer1 = paramBuilder.member_num;
      if (integer1 == null) {
        this.member_num = DEFAULT_MEMBER_NUM;
      } else {
        this.member_num = integer1;
      } 
      integer = paramBuilder.thread_num;
      if (integer == null) {
        this.thread_num = DEFAULT_THREAD_NUM;
      } else {
        this.thread_num = integer;
      } 
    } else {
      this.name = ((Builder)integer).name;
      this.avatar = ((Builder)integer).avatar;
      this.link = ((Builder)integer).link;
      this.st_param = ((Builder)integer).st_param;
      this.member_num = ((Builder)integer).member_num;
      this.thread_num = ((Builder)integer).thread_num;
    } 
  }
  
  public RecommendForum(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<RecommendForum> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String avatar;
    
    public String link;
    
    public Integer member_num;
    
    public String name;
    
    public String st_param;
    
    public Integer thread_num;
    
    public Builder() {}
    
    public Builder(RecommendForum param1RecommendForum) {
      super(param1RecommendForum);
      if (param1RecommendForum == null)
        return; 
      this.name = param1RecommendForum.name;
      this.avatar = param1RecommendForum.avatar;
      this.link = param1RecommendForum.link;
      this.st_param = param1RecommendForum.st_param;
      this.member_num = param1RecommendForum.member_num;
      this.thread_num = param1RecommendForum.thread_num;
    }
    
    public RecommendForum build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (RecommendForum)interceptResult.objValue; 
      } 
      return new RecommendForum(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
