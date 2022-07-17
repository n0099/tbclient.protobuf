package tbclient;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class RecGuide extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_DOCUMENT = "";
  
  public static final String DEFAULT_PIC = "";
  
  public static final String DEFAULT_URL = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String document;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String pic;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String url;
  
  public RecGuide(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.document;
      if (str1 == null) {
        this.document = "";
      } else {
        this.document = str1;
      } 
      str1 = paramBuilder.url;
      if (str1 == null) {
        this.url = "";
      } else {
        this.url = str1;
      } 
      str = paramBuilder.pic;
      if (str == null) {
        this.pic = "";
      } else {
        this.pic = str;
      } 
    } else {
      this.document = ((Builder)str).document;
      this.url = ((Builder)str).url;
      this.pic = ((Builder)str).pic;
    } 
  }
  
  public RecGuide(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<RecGuide> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String document;
    
    public String pic;
    
    public String url;
    
    public Builder() {}
    
    public Builder(RecGuide param1RecGuide) {
      super(param1RecGuide);
      if (param1RecGuide == null)
        return; 
      this.document = param1RecGuide.document;
      this.url = param1RecGuide.url;
      this.pic = param1RecGuide.pic;
    }
    
    public RecGuide build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (RecGuide)interceptResult.objValue; 
      } 
      return new RecGuide(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
