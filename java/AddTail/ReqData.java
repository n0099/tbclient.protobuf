package tbclient.AddTail;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class ReqData extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_FONTCOLOR = "";
  
  public static final String DEFAULT_FONTKEYNAME = "";
  
  public static final String DEFAULT_TAILCONTENT = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 4)
  public final CommonReq common;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String fontColor;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String fontKeyName;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String tailContent;
  
  public ReqData(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      String str = paramBuilder.tailContent;
      if (str == null) {
        this.tailContent = "";
      } else {
        this.tailContent = str;
      } 
      str = paramBuilder.fontColor;
      if (str == null) {
        this.fontColor = "";
      } else {
        this.fontColor = str;
      } 
      str = paramBuilder.fontKeyName;
      if (str == null) {
        this.fontKeyName = "";
      } else {
        this.fontKeyName = str;
      } 
      this.common = paramBuilder.common;
    } else {
      this.tailContent = paramBuilder.tailContent;
      this.fontColor = paramBuilder.fontColor;
      this.fontKeyName = paramBuilder.fontKeyName;
      this.common = paramBuilder.common;
    } 
  }
  
  public ReqData(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<ReqData> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public CommonReq common;
    
    public String fontColor;
    
    public String fontKeyName;
    
    public String tailContent;
    
    public Builder() {}
    
    public Builder(ReqData param1ReqData) {
      super(param1ReqData);
      if (param1ReqData == null)
        return; 
      this.tailContent = param1ReqData.tailContent;
      this.fontColor = param1ReqData.fontColor;
      this.fontKeyName = param1ReqData.fontKeyName;
      this.common = param1ReqData.common;
    }
    
    public ReqData build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (ReqData)interceptResult.objValue; 
      } 
      return new ReqData(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
