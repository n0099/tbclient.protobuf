package FrsPage;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class CarrierEnter extends Message {
  public static final String DEFAULT_HEADLINE_COVER = "";
  
  public static final String DEFAULT_OBJ_ID = "";
  
  public static final String DEFAULT_TEXT = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_URL = "";
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String headline_cover;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String obj_id;
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String text;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String url;
  
  public CarrierEnter(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      str1 = paramBuilder.text;
      if (str1 == null) {
        this.text = "";
      } else {
        this.text = str1;
      } 
      str1 = paramBuilder.headline_cover;
      if (str1 == null) {
        this.headline_cover = "";
      } else {
        this.headline_cover = str1;
      } 
      str1 = paramBuilder.url;
      if (str1 == null) {
        this.url = "";
      } else {
        this.url = str1;
      } 
      str = paramBuilder.obj_id;
      if (str == null) {
        this.obj_id = "";
      } else {
        this.obj_id = str;
      } 
    } else {
      this.title = ((Builder)str).title;
      this.text = ((Builder)str).text;
      this.headline_cover = ((Builder)str).headline_cover;
      this.url = ((Builder)str).url;
      this.obj_id = ((Builder)str).obj_id;
    } 
  }
}
