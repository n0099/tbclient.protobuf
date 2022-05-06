package TopicList;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class TabList extends Message {
  public static final String DEFAULT_SHARE_DESC = "";
  
  public static final String DEFAULT_SHARE_PIC = "";
  
  public static final String DEFAULT_SHARE_TITLE = "";
  
  public static final String DEFAULT_SHARE_URL = "";
  
  public static final String DEFAULT_TAB_NAME = "";
  
  public static final String DEFAULT_TAB_TYPE = "";
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String share_desc;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String share_pic;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String share_title;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String share_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String tab_name;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String tab_type;
  
  public TabList(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.tab_name;
      if (str1 == null) {
        this.tab_name = "";
      } else {
        this.tab_name = str1;
      } 
      str1 = paramBuilder.tab_type;
      if (str1 == null) {
        this.tab_type = "";
      } else {
        this.tab_type = str1;
      } 
      str1 = paramBuilder.share_pic;
      if (str1 == null) {
        this.share_pic = "";
      } else {
        this.share_pic = str1;
      } 
      str1 = paramBuilder.share_title;
      if (str1 == null) {
        this.share_title = "";
      } else {
        this.share_title = str1;
      } 
      str1 = paramBuilder.share_desc;
      if (str1 == null) {
        this.share_desc = "";
      } else {
        this.share_desc = str1;
      } 
      str = paramBuilder.share_url;
      if (str == null) {
        this.share_url = "";
      } else {
        this.share_url = str;
      } 
    } else {
      this.tab_name = ((Builder)str).tab_name;
      this.tab_type = ((Builder)str).tab_type;
      this.share_pic = ((Builder)str).share_pic;
      this.share_title = ((Builder)str).share_title;
      this.share_desc = ((Builder)str).share_desc;
      this.share_url = ((Builder)str).share_url;
    } 
  }
}
