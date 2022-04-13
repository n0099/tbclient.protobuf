package AddTail;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

public final class ReqData extends Message {
  public static final String DEFAULT_FONTCOLOR = "";
  
  public static final String DEFAULT_FONTKEYNAME = "";
  
  public static final String DEFAULT_TAILCONTENT = "";
  
  @ProtoField(tag = 4)
  public final CommonReq common;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String fontColor;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String fontKeyName;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String tailContent;
  
  public ReqData(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
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
}
