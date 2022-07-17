package tbclient.FrsPage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Forum extends Message {
  public static Interceptable $ic;
  
  public static final Long DEFAULT_FORUM_ID = Long.valueOf(0L);
  
  public static final String DEFAULT_LEVEL1_DIR_NAME = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.INT64)
  public final Long forum_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String level1_dir_name;
  
  public Forum(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      Long long_ = paramBuilder.forum_id;
      if (long_ == null) {
        this.forum_id = DEFAULT_FORUM_ID;
      } else {
        this.forum_id = long_;
      } 
      str = paramBuilder.level1_dir_name;
      if (str == null) {
        this.level1_dir_name = "";
      } else {
        this.level1_dir_name = str;
      } 
    } else {
      this.forum_id = ((Builder)str).forum_id;
      this.level1_dir_name = ((Builder)str).level1_dir_name;
    } 
  }
  
  public Forum(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(685618845, "Ltbclient/FrsPage/Forum;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(685618845, "Ltbclient/FrsPage/Forum;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<Forum> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public Long forum_id;
    
    public String level1_dir_name;
    
    public Builder() {}
    
    public Builder(Forum param1Forum) {
      super(param1Forum);
      if (param1Forum == null)
        return; 
      this.forum_id = param1Forum.forum_id;
      this.level1_dir_name = param1Forum.level1_dir_name;
    }
    
    public Forum build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (Forum)interceptResult.objValue; 
      } 
      return new Forum(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
