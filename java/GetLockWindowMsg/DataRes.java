package tbclient.GetLockWindowMsg;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.User;

public final class DataRes extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_PUBLISH_PIC = "";
  
  public static final String DEFAULT_PUBLISH_USER = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1)
  public final User author;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String publish_pic;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String publish_user;
  
  @ProtoField(tag = 4)
  public final LockWindowThreadInfo thread_info;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      this.author = paramBuilder.author;
      String str = paramBuilder.publish_pic;
      if (str == null) {
        this.publish_pic = "";
      } else {
        this.publish_pic = str;
      } 
      str = paramBuilder.publish_user;
      if (str == null) {
        this.publish_user = "";
      } else {
        this.publish_user = str;
      } 
      this.thread_info = paramBuilder.thread_info;
    } else {
      this.author = paramBuilder.author;
      this.publish_pic = paramBuilder.publish_pic;
      this.publish_user = paramBuilder.publish_user;
      this.thread_info = paramBuilder.thread_info;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public User author;
    
    public String publish_pic;
    
    public String publish_user;
    
    public LockWindowThreadInfo thread_info;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.author = param1DataRes.author;
      this.publish_pic = param1DataRes.publish_pic;
      this.publish_user = param1DataRes.publish_user;
      this.thread_info = param1DataRes.thread_info;
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
