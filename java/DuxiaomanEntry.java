package tbclient;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class DuxiaomanEntry extends Message {
  public static Interceptable $ic;
  
  public static final String DEFAULT_ACTIVITY_DESC = "";
  
  public static final String DEFAULT_ACTIVITY_LINK_ADDR = "";
  
  public static final String DEFAULT_ACTIVITY_LINK_TYPE = "";
  
  public static final String DEFAULT_ACTIVITY_TIMESTAMP = "";
  
  public static final String DEFAULT_AMOUNT = "";
  
  public static final String DEFAULT_AMOUNT_MSG = "";
  
  public static final String DEFAULT_ENCOURAGE_DESC = "";
  
  public static final String DEFAULT_ENCOURAGE_ICON = "";
  
  public static final String DEFAULT_ENCOURAGE_ICON_DARK = "";
  
  public static final String DEFAULT_GOTO_BUTTON_NAME = "";
  
  public static final String DEFAULT_GOTO_BUTTON_URL = "";
  
  public static final String DEFAULT_LAYOUT_TYPE = "";
  
  public static final String DEFAULT_TIP = "";
  
  public transient FieldHolder $fh;
  
  @ProtoField(tag = 9, type = Message.Datatype.STRING)
  public final String activity_desc;
  
  @ProtoField(tag = 11, type = Message.Datatype.STRING)
  public final String activity_link_addr;
  
  @ProtoField(tag = 10, type = Message.Datatype.STRING)
  public final String activity_link_type;
  
  @ProtoField(tag = 8, type = Message.Datatype.STRING)
  public final String activity_timestamp;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String amount;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String amount_msg;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String encourage_desc;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String encourage_icon;
  
  @ProtoField(tag = 13, type = Message.Datatype.STRING)
  public final String encourage_icon_dark;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String goto_button_name;
  
  @ProtoField(tag = 7, type = Message.Datatype.STRING)
  public final String goto_button_url;
  
  @ProtoField(tag = 12, type = Message.Datatype.STRING)
  public final String layout_type;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String tip;
  
  public DuxiaomanEntry(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.tip;
      if (str1 == null) {
        this.tip = "";
      } else {
        this.tip = str1;
      } 
      str1 = paramBuilder.amount;
      if (str1 == null) {
        this.amount = "";
      } else {
        this.amount = str1;
      } 
      str1 = paramBuilder.amount_msg;
      if (str1 == null) {
        this.amount_msg = "";
      } else {
        this.amount_msg = str1;
      } 
      str1 = paramBuilder.encourage_icon;
      if (str1 == null) {
        this.encourage_icon = "";
      } else {
        this.encourage_icon = str1;
      } 
      str1 = paramBuilder.encourage_desc;
      if (str1 == null) {
        this.encourage_desc = "";
      } else {
        this.encourage_desc = str1;
      } 
      str1 = paramBuilder.goto_button_name;
      if (str1 == null) {
        this.goto_button_name = "";
      } else {
        this.goto_button_name = str1;
      } 
      str1 = paramBuilder.goto_button_url;
      if (str1 == null) {
        this.goto_button_url = "";
      } else {
        this.goto_button_url = str1;
      } 
      str1 = paramBuilder.activity_timestamp;
      if (str1 == null) {
        this.activity_timestamp = "";
      } else {
        this.activity_timestamp = str1;
      } 
      str1 = paramBuilder.activity_desc;
      if (str1 == null) {
        this.activity_desc = "";
      } else {
        this.activity_desc = str1;
      } 
      str1 = paramBuilder.activity_link_type;
      if (str1 == null) {
        this.activity_link_type = "";
      } else {
        this.activity_link_type = str1;
      } 
      str1 = paramBuilder.activity_link_addr;
      if (str1 == null) {
        this.activity_link_addr = "";
      } else {
        this.activity_link_addr = str1;
      } 
      str1 = paramBuilder.layout_type;
      if (str1 == null) {
        this.layout_type = "";
      } else {
        this.layout_type = str1;
      } 
      str = paramBuilder.encourage_icon_dark;
      if (str == null) {
        this.encourage_icon_dark = "";
      } else {
        this.encourage_icon_dark = str;
      } 
    } else {
      this.tip = ((Builder)str).tip;
      this.amount = ((Builder)str).amount;
      this.amount_msg = ((Builder)str).amount_msg;
      this.encourage_icon = ((Builder)str).encourage_icon;
      this.encourage_desc = ((Builder)str).encourage_desc;
      this.goto_button_name = ((Builder)str).goto_button_name;
      this.goto_button_url = ((Builder)str).goto_button_url;
      this.activity_timestamp = ((Builder)str).activity_timestamp;
      this.activity_desc = ((Builder)str).activity_desc;
      this.activity_link_type = ((Builder)str).activity_link_type;
      this.activity_link_addr = ((Builder)str).activity_link_addr;
      this.layout_type = ((Builder)str).layout_type;
      this.encourage_icon_dark = ((Builder)str).encourage_icon_dark;
    } 
  }
  
  public DuxiaomanEntry(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DuxiaomanEntry> {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
    
    public String activity_desc;
    
    public String activity_link_addr;
    
    public String activity_link_type;
    
    public String activity_timestamp;
    
    public String amount;
    
    public String amount_msg;
    
    public String encourage_desc;
    
    public String encourage_icon;
    
    public String encourage_icon_dark;
    
    public String goto_button_name;
    
    public String goto_button_url;
    
    public String layout_type;
    
    public String tip;
    
    public Builder() {}
    
    public Builder(DuxiaomanEntry param1DuxiaomanEntry) {
      super(param1DuxiaomanEntry);
      if (param1DuxiaomanEntry == null)
        return; 
      this.tip = param1DuxiaomanEntry.tip;
      this.amount = param1DuxiaomanEntry.amount;
      this.amount_msg = param1DuxiaomanEntry.amount_msg;
      this.encourage_icon = param1DuxiaomanEntry.encourage_icon;
      this.encourage_desc = param1DuxiaomanEntry.encourage_desc;
      this.goto_button_name = param1DuxiaomanEntry.goto_button_name;
      this.goto_button_url = param1DuxiaomanEntry.goto_button_url;
      this.activity_timestamp = param1DuxiaomanEntry.activity_timestamp;
      this.activity_desc = param1DuxiaomanEntry.activity_desc;
      this.activity_link_type = param1DuxiaomanEntry.activity_link_type;
      this.activity_link_addr = param1DuxiaomanEntry.activity_link_addr;
      this.layout_type = param1DuxiaomanEntry.layout_type;
      this.encourage_icon_dark = param1DuxiaomanEntry.encourage_icon_dark;
    }
    
    public DuxiaomanEntry build(boolean param1Boolean) {
      Interceptable interceptable = $ic;
      if (interceptable != null) {
        InterceptResult interceptResult = interceptable.invokeZ(1048577, this, param1Boolean);
        if (interceptResult != null)
          return (DuxiaomanEntry)interceptResult.objValue; 
      } 
      return new DuxiaomanEntry(this, param1Boolean, null);
    }
  }
  
  public static class a {
    public static Interceptable $ic;
    
    public transient FieldHolder $fh;
  }
}
