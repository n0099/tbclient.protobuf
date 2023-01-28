package tbclient.GetToken;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class DataRes extends Message {
  public static final String DEFAULT_BTN_CANCEL = "";
  
  public static final String DEFAULT_BTN_SURE = "";
  
  public static final String DEFAULT_IMG = "";
  
  public static final String DEFAULT_TIPS = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 7)
  public final ToastInfo activity_done;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String btn_cancel;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String btn_sure;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String img;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String tips;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String url;
  
  public DataRes(Builder paramBuilder, boolean paramBoolean) {
    super(paramBuilder);
    if (paramBoolean == true) {
      String str = paramBuilder.title;
      if (str == null) {
        this.title = "";
      } else {
        this.title = str;
      } 
      str = paramBuilder.img;
      if (str == null) {
        this.img = "";
      } else {
        this.img = str;
      } 
      str = paramBuilder.tips;
      if (str == null) {
        this.tips = "";
      } else {
        this.tips = str;
      } 
      str = paramBuilder.url;
      if (str == null) {
        this.url = "";
      } else {
        this.url = str;
      } 
      str = paramBuilder.btn_sure;
      if (str == null) {
        this.btn_sure = "";
      } else {
        this.btn_sure = str;
      } 
      str = paramBuilder.btn_cancel;
      if (str == null) {
        this.btn_cancel = "";
      } else {
        this.btn_cancel = str;
      } 
      this.activity_done = paramBuilder.activity_done;
    } else {
      this.title = paramBuilder.title;
      this.img = paramBuilder.img;
      this.tips = paramBuilder.tips;
      this.url = paramBuilder.url;
      this.btn_sure = paramBuilder.btn_sure;
      this.btn_cancel = paramBuilder.btn_cancel;
      this.activity_done = paramBuilder.activity_done;
    } 
  }
  
  public DataRes(Builder paramBuilder, boolean paramBoolean, a parama) {
    this(paramBuilder, paramBoolean);
  }
  
  public static final class Builder extends Message.Builder<DataRes> {
    public ToastInfo activity_done;
    
    public String btn_cancel;
    
    public String btn_sure;
    
    public String img;
    
    public String tips;
    
    public String title;
    
    public String url;
    
    public Builder() {}
    
    public Builder(DataRes param1DataRes) {
      super(param1DataRes);
      if (param1DataRes == null)
        return; 
      this.title = param1DataRes.title;
      this.img = param1DataRes.img;
      this.tips = param1DataRes.tips;
      this.url = param1DataRes.url;
      this.btn_sure = param1DataRes.btn_sure;
      this.btn_cancel = param1DataRes.btn_cancel;
      this.activity_done = param1DataRes.activity_done;
    }
    
    public DataRes build(boolean param1Boolean) {
      return new DataRes(this, param1Boolean, null);
    }
  }
  
  public static class a {}
}
