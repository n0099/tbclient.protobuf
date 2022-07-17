package tbclient.ElectionInfo;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class NoticeContent extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_PUBLIC_NOTICE = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String public_notice;
  
  public NoticeContent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      str = paramBuilder.public_notice;
      if (str == null) {
        this.public_notice = "";
      } else {
        this.public_notice = str;
      } 
    } else {
      this.public_notice = ((Builder)str).public_notice;
    } 
  }
  
  public NoticeContent(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<NoticeContent> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String public_notice;
    
    public Builder() {}
    
    public Builder(NoticeContent param1NoticeContent) {
      super(param1NoticeContent);
      if (param1NoticeContent == null)
        return; 
      this.public_notice = param1NoticeContent.public_notice;
    }
    
    public NoticeContent build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (NoticeContent)interceptResult.objValue; 
      } 
      return new NoticeContent(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
