package tbclient.Storypage;

import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThreadInfo;
import tbclient.User;

public final class Story extends Message {
  public static Interceptable $ic;
  
  public static final List<ThreadInfo> DEFAULT_STORY_LIST = Collections.emptyList();
  
  public static final Integer DEFAULT_STORY_USER_TYPE = Integer.valueOf(0);
  
  public transient FieldHolder $fh;
  
  @ProtoField(label = Message.Label.REPEATED, tag = 1)
  public final List<ThreadInfo> story_list;
  
  @ProtoField(tag = 2)
  public final User story_user;
  
  @ProtoField(tag = 3, type = Message.Datatype.INT32)
  public final Integer story_user_type;
  
  public Story(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    Integer integer;
    if (paramBoolean == true) {
      List<ThreadInfo> list = paramBuilder.story_list;
      if (list == null) {
        this.story_list = DEFAULT_STORY_LIST;
      } else {
        this.story_list = Message.immutableCopyOf(list);
      } 
      this.story_user = paramBuilder.story_user;
      integer = paramBuilder.story_user_type;
      if (integer == null) {
        this.story_user_type = DEFAULT_STORY_USER_TYPE;
      } else {
        this.story_user_type = integer;
      } 
    } else {
      this.story_list = Message.immutableCopyOf(((Builder)integer).story_list);
      this.story_user = ((Builder)integer).story_user;
      this.story_user_type = ((Builder)integer).story_user_type;
    } 
  }
  
  public Story(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  static {
    ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
    if (classClinitInterceptable != null) {
      InterceptResult interceptResult = classClinitInterceptable.invokeClinit(1856025179, "Ltbclient/Storypage/Story;");
      if (interceptResult != null) {
        Interceptable interceptable = interceptResult.interceptor;
        if (interceptable != null)
          $ic = interceptable; 
        if ((interceptResult.flags & 0x1) != 0) {
          classClinitInterceptable.invokePostClinit(1856025179, "Ltbclient/Storypage/Story;");
          return;
        } 
      } 
    } 
  }
  
  public static final class Builder extends Message.Builder<Story> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public List<ThreadInfo> story_list;
    
    public User story_user;
    
    public Integer story_user_type;
    
    public Builder() {}
    
    public Builder(Story param1Story) {
      super(param1Story);
      if (param1Story == null)
        return; 
      this.story_list = Message.copyOf(param1Story.story_list);
      this.story_user = param1Story.story_user;
      this.story_user_type = param1Story.story_user_type;
    }
    
    public Story build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (Story)interceptResult.objValue; 
      } 
      return new Story(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
