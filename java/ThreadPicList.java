package tbclient;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class ThreadPicList extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_PIC = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String pic;
  
  public ThreadPicList(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      str = paramBuilder.pic;
      if (str == null) {
        this.pic = "";
      } else {
        this.pic = str;
      } 
    } else {
      this.pic = ((Builder)str).pic;
    } 
  }
  
  public ThreadPicList(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ThreadPicList> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String pic;
    
    public Builder() {}
    
    public Builder(ThreadPicList param1ThreadPicList) {
      super(param1ThreadPicList);
      if (param1ThreadPicList == null)
        return; 
      this.pic = param1ThreadPicList.pic;
    }
    
    public ThreadPicList build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ThreadPicList)interceptResult.objValue; 
      } 
      return new ThreadPicList(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
