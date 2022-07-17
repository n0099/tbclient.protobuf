package tbclient.GetMyPost;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ThreadInfo;

public final class DataRes extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_PARTIAL_VISIBLE_TOAST = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String partial_visible_toast;
  
  @ProtoField(tag = 2)
  public final ThreadInfo thread_info;
  
  @ProtoField(tag = 1)
  public final User_Info user_info;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      this.user_info = paramBuilder.user_info;
      this.thread_info = paramBuilder.thread_info;
      str = paramBuilder.partial_visible_toast;
      if (str == null) {
        this.partial_visible_toast = "";
      } else {
        this.partial_visible_toast = str;
      } 
    } else {
      this.user_info = ((Builder)str).user_info;
      this.thread_info = ((Builder)str).thread_info;
      this.partial_visible_toast = ((Builder)str).partial_visible_toast;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String partial_visible_toast;
    
    public ThreadInfo thread_info;
    
    public User_Info user_info;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.user_info = param1DataRes.user_info;
      this.thread_info = param1DataRes.thread_info;
      this.partial_visible_toast = param1DataRes.partial_visible_toast;
    }
    
    public DataRes build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (DataRes)interceptResult.objValue; 
      } 
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
