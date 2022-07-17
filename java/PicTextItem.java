package tbclient;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class PicTextItem extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_ITEM_PIC = "";
  
  public static final String DEFAULT_ITEM_TEXT = "";
  
  public static final String DEFAULT_ITEM_URL = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String item_pic;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String item_text;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String item_url;
  
  public PicTextItem(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.item_pic;
      if (str1 == null) {
        this.item_pic = "";
      } else {
        this.item_pic = str1;
      } 
      str1 = paramBuilder.item_url;
      if (str1 == null) {
        this.item_url = "";
      } else {
        this.item_url = str1;
      } 
      str = paramBuilder.item_text;
      if (str == null) {
        this.item_text = "";
      } else {
        this.item_text = str;
      } 
    } else {
      this.item_pic = ((Builder)str).item_pic;
      this.item_url = ((Builder)str).item_url;
      this.item_text = ((Builder)str).item_text;
    } 
  }
  
  public PicTextItem(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<PicTextItem> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String item_pic;
    
    public String item_text;
    
    public String item_url;
    
    public Builder() {}
    
    public Builder(PicTextItem param1PicTextItem) {
      super(param1PicTextItem);
      if (param1PicTextItem == null)
        return; 
      this.item_pic = param1PicTextItem.item_pic;
      this.item_url = param1PicTextItem.item_url;
      this.item_text = param1PicTextItem.item_text;
    }
    
    public PicTextItem build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (PicTextItem)interceptResult.objValue; 
      } 
      return new PicTextItem(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
