package ForumRecommend;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class Banner extends Message {
  public static final String DEFAULT_LINK = "";
  
  public static final String DEFAULT_PIC_URL = "";
  
  public static final String DEFAULT_TAG_NAME_URL = "";
  
  public static final String DEFAULT_TAG_NAME_WH = "";
  
  public static final String DEFAULT_TITLE = "";
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String link;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String pic_url;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String tag_name_url;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String tag_name_wh;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String title;
  
  public Banner(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.link;
      if (str1 == null) {
        this.link = "";
      } else {
        this.link = str1;
      } 
      str1 = paramBuilder.pic_url;
      if (str1 == null) {
        this.pic_url = "";
      } else {
        this.pic_url = str1;
      } 
      str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      str1 = paramBuilder.tag_name_url;
      if (str1 == null) {
        this.tag_name_url = "";
      } else {
        this.tag_name_url = str1;
      } 
      str = paramBuilder.tag_name_wh;
      if (str == null) {
        this.tag_name_wh = "";
      } else {
        this.tag_name_wh = str;
      } 
    } else {
      this.link = ((Builder)str).link;
      this.pic_url = ((Builder)str).pic_url;
      this.title = ((Builder)str).title;
      this.tag_name_url = ((Builder)str).tag_name_url;
      this.tag_name_wh = ((Builder)str).tag_name_wh;
    } 
  }
}
