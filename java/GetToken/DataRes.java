package GetToken;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.GetToken.ToastInfo;

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
    super((Message.Builder)paramBuilder);
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
}
