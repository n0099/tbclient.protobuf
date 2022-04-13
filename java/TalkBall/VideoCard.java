package TalkBall;

import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

public final class VideoCard extends Message {
  public static final String DEFAULT_COVER_IMAGE = "";
  
  public static final String DEFAULT_THREAD_ID = "";
  
  public static final String DEFAULT_THREAD_URL = "";
  
  public static final String DEFAULT_TITLE = "";
  
  public static final String DEFAULT_TOPIC_TITLE = "";
  
  public static final String DEFAULT_VIDEO_DURATION = "";
  
  @ProtoField(tag = 2, type = Message.Datatype.STRING)
  public final String cover_image;
  
  @ProtoField(tag = 5, type = Message.Datatype.STRING)
  public final String thread_id;
  
  @ProtoField(tag = 6, type = Message.Datatype.STRING)
  public final String thread_url;
  
  @ProtoField(tag = 1, type = Message.Datatype.STRING)
  public final String title;
  
  @ProtoField(tag = 4, type = Message.Datatype.STRING)
  public final String topic_title;
  
  @ProtoField(tag = 3, type = Message.Datatype.STRING)
  public final String video_duration;
  
  public VideoCard(Builder paramBuilder, boolean paramBoolean) {
    super((Message.Builder)paramBuilder);
    String str;
    if (paramBoolean == true) {
      String str1 = paramBuilder.title;
      if (str1 == null) {
        this.title = "";
      } else {
        this.title = str1;
      } 
      str1 = paramBuilder.cover_image;
      if (str1 == null) {
        this.cover_image = "";
      } else {
        this.cover_image = str1;
      } 
      str1 = paramBuilder.video_duration;
      if (str1 == null) {
        this.video_duration = "";
      } else {
        this.video_duration = str1;
      } 
      str1 = paramBuilder.topic_title;
      if (str1 == null) {
        this.topic_title = "";
      } else {
        this.topic_title = str1;
      } 
      str1 = paramBuilder.thread_id;
      if (str1 == null) {
        this.thread_id = "";
      } else {
        this.thread_id = str1;
      } 
      str = paramBuilder.thread_url;
      if (str == null) {
        this.thread_url = "";
      } else {
        this.thread_url = str;
      } 
    } else {
      this.title = ((Builder)str).title;
      this.cover_image = ((Builder)str).cover_image;
      this.video_duration = ((Builder)str).video_duration;
      this.topic_title = ((Builder)str).topic_title;
      this.thread_id = ((Builder)str).thread_id;
      this.thread_url = ((Builder)str).thread_url;
    } 
  }
}
