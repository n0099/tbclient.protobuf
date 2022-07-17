package tbclient.GetMoreMsg;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class MsgContent extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_ID = "";
  
  public static final String DEFAULT_SRC = "";
  
  public static final String DEFAULT_TEXT = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_URL = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String id;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String src;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String text;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String url;
  
  public MsgContent(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.id;
      if (str1 == null) {
        this.id = "";
      } else {
        this.id = str1;
      } 
      str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      str1 = paramBuilder.url;
      if (str1 == null) {
        this.url = "";
      } else {
        this.url = str1;
      } 
      str1 = paramBuilder.text;
      if (str1 == null) {
        this.text = "";
      } else {
        this.text = str1;
      } 
      str = paramBuilder.src;
      if (str == null) {
        this.src = "";
      } else {
        this.src = str;
      } 
    } else {
      this.id = ((Builder)str).id;
      this.title = ((Builder)str).title;
      this.url = ((Builder)str).url;
      this.text = ((Builder)str).text;
      this.src = ((Builder)str).src;
    } 
  }
  
  public MsgContent(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<MsgContent> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String id;
    
    public String src;
    
    public String text;
    
    public String title;
    
    public String url;
    
    public Builder() {}
    
    public Builder(MsgContent param1MsgContent) {
      super(param1MsgContent);
      if (param1MsgContent == null)
        return; 
      this.id = param1MsgContent.id;
      this.title = param1MsgContent.title;
      this.url = param1MsgContent.url;
      this.text = param1MsgContent.text;
      this.src = param1MsgContent.src;
    }
    
    public MsgContent build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (MsgContent)interceptResult.objValue; 
      } 
      return new MsgContent(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
